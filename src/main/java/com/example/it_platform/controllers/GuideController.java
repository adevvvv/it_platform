package com.example.it_platform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class GuideController {
    @GetMapping("/guide")
    public String guide () {
        return "guide";
    }

    @GetMapping("/guide/spring")
    public String guideSpring () {
        return "guide_spring";
    }

    @GetMapping("/guide/spring/first-app")
    public String guideSpringFirstApp () {
        return "guide_spring_first-app";
    }
    @GetMapping("/guide/spring/rest-api")
    public String guideSpringRestApi () {
        return "guide_spring_rest_api";
    }
    @GetMapping("/guide/spring/auth-jwt")
    public String guideSpringAuthJwt () {
        return "guide_spring_auth-jwt";
    }

    @GetMapping("/guide/postgresql")
    public String guidePostgresql () {
        return "guide_postgresql";
    }
}
