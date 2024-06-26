package com.example.it_platform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {
    @GetMapping("/")
    public String home () {
        return "index";
    }

    @GetMapping("/registration")
    public String registration () {
        return "registration";
    }

    @GetMapping("/login")
    public String login () {
        return "login";
    }

    @GetMapping("/profile")
    public String profile () {
        return "profile";
    }
}
