package com.example.zoraweb.services;

import com.example.zoraweb.Models.frymaster.User;
import com.example.zoraweb.Repository.UserRepository;
import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import java.io.UnsupportedEncodingException;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JavaMailSender mailSender;


    public void register(User user, String siteURL)
   throws UnsupportedEncodingException, MessagingException {
            String encodedPassword = passwordEncoder.encode(user.getPassword());
            user.setPassword(encodedPassword);

            String randomCode = RandomString.make(64);
            user.setVerificationCode(randomCode);
            user.setEnable(false);

            repo.save(user);

            sendVerificationEmail(user, siteURL);
    }

    private void sendVerificationEmail(User user, String siteURL) {

    }
}
