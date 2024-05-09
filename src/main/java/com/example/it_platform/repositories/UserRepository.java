package com.example.it_platform.repositories;

import com.example.it_platform.models.User;
import com.example.it_platform.models.Users;
import org.springframework.data.repository.CrudRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findByUsernameContaining(String username);
}