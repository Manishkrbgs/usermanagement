package com.example.usermanagement.configuration;

import com.example.usermanagement.model.user;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class beanmanager {
    @Bean
    List<user> getInitializedList()
    {
        user inituser =new user(1,"manishraz","manish","9801466288","bihar");
 List<user> initList = new  ArrayList<>();
 initList.add(inituser);
 return initList;
    }
}