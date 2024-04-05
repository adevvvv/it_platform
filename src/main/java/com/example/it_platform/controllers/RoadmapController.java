package com.example.it_platform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class RoadmapController {
    @GetMapping("/roadmap")
    public String roadmap () {
        return "roadmap";
    }

    @GetMapping("/roadmap/intellij")
    public String roadmapIntellij () {
        return "roadmap_intellij";
    }

    @GetMapping("/roadmap/java")
    public String roadmapJava () {
        return "roadmap_java";
    }

    @GetMapping("/roadmap/postgresql")
    public String roadmapPostgresql () {
        return "roadmap_postgresql";
    }

    @GetMapping("/roadmap/redis")
    public String roadmapRedis () {
        return "roadmap_redis";
    }

    @GetMapping("/roadmap/spring")
    public String roadmapSpring () {
        return "roadmap_spring";
    }

    @GetMapping("/roadmap/testng")
    public String roadmapTestng () {
        return "roadmap_testng";
    }

    @GetMapping("/roadmap/docker")
    public String roadmapDocker () {
        return "roadmap_docker";
    }

    @GetMapping("/roadmap/kafka")
    public String roadmapKafka () {
        return "roadmap_kafka";
    }

    @GetMapping("/roadmap/git")
    public String roadmapGit () {
        return "roadmap_git";
    }

    @GetMapping("/roadmap/linux")
    public String roadmapLinux () {
        return "roadmap_linux";
    }
}
