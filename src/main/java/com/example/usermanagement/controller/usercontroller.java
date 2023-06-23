package com.example.usermanagement.controller;

import com.example.usermanagement.model.user;
import com.example.usermanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class usercontroller {
    @Autowired
    UserService Userservice;
    @GetMapping("users")
    List<user> getAllUsers()
    {
        return Userservice.getAllUsers();
    }

}
