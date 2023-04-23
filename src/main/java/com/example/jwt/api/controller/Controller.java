package com.example.jwt.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/home")
    public String welcome() {
        return "Welcome All to Spring Security!";
    }

    @GetMapping("/normal")
    public String normal() {
        return "Welcome Normal User!";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Welcome Admin User!";
    }

}
