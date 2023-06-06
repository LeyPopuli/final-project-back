package com.charactergeneratorgroup.charactergenerator.service.impl;

import com.charactergeneratorgroup.charactergenerator.controller.handler.CustomException;
import com.charactergeneratorgroup.charactergenerator.model.User;
import com.charactergeneratorgroup.charactergenerator.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {

    @Autowired
    UserRepository userRepository;

    public void login(User user) {
        String userName = user.getUserName();
        User userExists = userRepository.findByUserName(userName)
                .orElseThrow(() -> new CustomException("User not found."));

        if (!userExists.checkPassword(user.getPassword())) {
            throw new CustomException("Invalid credentials.");
        }
    }

    public void register(User user) {
        String userName = user.getUserName();
        String password = user.getPassword();
        if (password.length() < 5) {
            throw new CustomException("Password must have at least 5 characters.");
        }

        Optional<User> existingUser = userRepository.findByUserName(userName);
        if (existingUser.isPresent()) {
            throw new CustomException("User already exists.");
        }

        if (userName.length() < 5) {
            throw new CustomException("Username must have at least 5 characters.");
        }

        User newUser = new User(userName, password);
        userRepository.save(newUser);
    }
}
