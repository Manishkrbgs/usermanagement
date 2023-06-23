package com.example.usermanagement.service;

import com.example.usermanagement.model.user;
import com.example.usermanagement.repository.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    userRepo userrepo;
    public List<user> getAllUsers() {
        return userRepo.getUsers();
    }



}
