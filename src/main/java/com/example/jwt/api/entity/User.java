package com.example.jwt.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Table(name = "USER_TBL")
//@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class User {
//    @Id
//    @GeneratedValue
    private int id;
    private String userName;
    private String password;
    private String email;

}
