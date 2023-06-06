package com.charactergeneratorgroup.charactergenerator.controller.impl;

import com.charactergeneratorgroup.charactergenerator.model.User;
import com.charactergeneratorgroup.charactergenerator.service.impl.AuthService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public void login(@RequestBody @Valid User user) {
       authService.login(user);
    }

    @PostMapping("/register")
    public void register(@RequestBody @Valid User user) {
        authService.register(user);
    }
}

