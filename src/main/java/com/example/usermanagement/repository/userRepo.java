package com.example.usermanagement.repository;

import com.example.usermanagement.model.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class userRepo {
    @Autowired
    private  List<user> userList=new ArrayList<>();

    public  List<user> getUsers() {
        return userList;
    }

}
