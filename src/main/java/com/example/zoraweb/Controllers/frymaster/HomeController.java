package com.example.zoraweb.Controllers.frymaster;

import com.example.zoraweb.Models.frymaster.User;
import com.example.zoraweb.Repository.UserRepository;
import com.example.zoraweb.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

@Controller

public class HomeController {

    private UserRepository userDao;
    private PasswordEncoder passwordEncoder;

    @Autowired
    UserService services;

    public HomeController(UserRepository userDao, PasswordEncoder passwordEncoder) {
        this.userDao = userDao;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping("/")
    public String hello() {
        return "index";
    }

    @GetMapping("/register")
    public String register(Model model) {
        try{
            User currentUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            model.addAttribute("currentUser",currentUser);
            return "redirect:/index";
        }catch(Exception e){
            model.addAttribute("newUser",new User());
            return "register";
        }

    }
    @PostMapping("/register")
    public String registerUser(User user, HttpServletRequest request, RedirectAttributes ra)throws UnsupportedEncodingException, MessagingException {
        boolean inputError = user.getUsername().isEmpty() || user.getEmail().isEmpty() || user.getPassword().isEmpty();
        String passwordConfirmation = request.getParameter("verify-password");
        User newUser = userDao.findByUsername(user.getusername());
        User uEmail = userDao.findByEmail(user.getEmail());
        if (!inputError && newUser == null && uEmail == null && (String.valueOf(user.getPassword()).equals(passwordConfirmation))) {
            services.register(user, getSiteUrl(request));
            return "register_success";
        } else if (!String.valueOf(user.getPassword()).equals(passwordConfirmation)) {
            ra.addFlashAttribute("uName", String.valueOf(user.getUsername()));
            ra.addFlashAttribute("email", String.valueOf(user.getEmail()));
            return "redirect:/register?pmfail";
        } else if (newUser != null) {
            ra.addFlashAttribute("email", user.getEmail());
            return "redirect:/register?Uexist";

        } else {
            ra.addFlashAttribute("uName",String.valueOf(user.getUsername()));
            return "redirect:/register?eexist";

        }
    }

private String getSiteUrl(HttpServletRequest request){
        String siteUrl= request.getRequestURL().toString();
        return siteUrl.replace(request.getServletPath(),"");
}
    @GetMapping("/verify")
    public String verifyUser(@Param("code") String code) {
        if (services.verify(code)) {
            return "verify_success";
        } else {
            return "verify_fail";
        }
    }



    @GetMapping("/login")
    public String login(){return "login";}

}
