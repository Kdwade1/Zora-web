package com.example.zoraweb.Controllers.frymaster;

import com.example.zoraweb.Models.frymaster.User;
import com.example.zoraweb.Repository.UserRepository;
import com.example.zoraweb.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public String registerUser(User user, HttpServletRequest request, RedirectAttributes ra)throws UnsupportedEncodingException, MessagingException{
        boolean inputError =user.getUsername().isEmpty()|| user.getEmail().isEmpty()||user.getPassword().isEmpty();
        String passwordConfirmation =request.getParameter("verify-password");
        User newUser = userDao.findByUsername(user.getusername());
        User uEmail = userDao.findByEmail(user.getEmail());
        if(!inputError && newUser ==null && uEmail==null&& (String.valueOf(user.getPassword()).equals(passwordConfirmation))){
            services.register(user, getSiteUrl(request));
        }
    }



    @GetMapping("/login")
    public String login(){return "login";}

}
