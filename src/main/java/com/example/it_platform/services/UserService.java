package com.example.it_platform.services;

import com.example.it_platform.models.User;

import java.util.List;

// UserService.java
public interface UserService {

    Iterable<User> getAllUsers();

    void deleteUser(Long userId);
    List<User> searchUsersByUsername(String username);

}