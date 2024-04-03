package com.example.it_platform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class RoadmapController {
    @GetMapping("/roadmap")
    public String roadmap () {
        return "roadmap";
    }
}
