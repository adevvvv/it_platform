package com.example.it_platform.repositories;

import com.example.it_platform.models.Users;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Users, Long>{ }