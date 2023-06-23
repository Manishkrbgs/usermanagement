package com.example.usermanagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class user {

    private Integer userId;
    private String UserName;
    private String name;
    private String userContact;

    private String address;
}