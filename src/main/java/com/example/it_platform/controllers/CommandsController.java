package com.example.it_platform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommandsController {
    @GetMapping("/commands")
    public String commands() {
        return "commands";
    }
}