package com.example.zoraweb.Controllers.frymaster;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class MenuController {
    @GetMapping("/menu")
    public String showMenu(){return "menu";}
}
