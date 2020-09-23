package com.example.mop.controllers;

import com.example.mop.models.User;
import com.example.mop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/user")
    User[] userInfo(Authentication authentication) {
        return userRepository.findAll().toArray(new User[0]);
    }
}
