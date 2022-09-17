package com.example.zoraweb.Controllers.frymaster;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class HomeController {
    @GetMapping("/")
    public String hello() {
        return "index";
    }

    @GetMapping("/register")
    public String register(){return "register";}

}
