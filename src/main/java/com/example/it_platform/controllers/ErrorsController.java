package com.example.it_platform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorsController {
    @GetMapping("/errors")
    public String errors() {
        return "errors/errors_main";
    }
}