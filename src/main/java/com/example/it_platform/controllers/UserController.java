package com.example.it_platform.controllers;

import com.example.it_platform.models.User;
import com.example.it_platform.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/admin")
    public String adminPage(Model model) {
        Iterable<User> usersIterable = userService.getAllUsers();
        List<User> users = new ArrayList<>();
        usersIterable.forEach(users::add);
        model.addAttribute("users", users);
        return "admin";
    }

    @PostMapping("/admin/deleteUser")
    public String deleteUser(@RequestParam("userId") Long userId) {
        userService.deleteUser(userId);
        return "redirect:/admin";
    }

    @GetMapping("/admin/search")
    public String searchUsers(@RequestParam("query") String query, Model model) {
        List<User> foundUsers = userService.searchUsersByUsername(query);
        model.addAttribute("users", foundUsers);
        return "admin"; // Имя представления, в котором отображается список пользователей
    }
}