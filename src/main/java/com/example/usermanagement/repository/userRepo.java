package com.example.usermanagement.repository;

import com.example.usermanagement.model.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class userRepo {
    @Autowired
    private static List<user> userList;

    public static List<user> getUsers() {
        return userList;
    }

}
