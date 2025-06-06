package com.laurenzel.playgroundservice.controllers;

import com.laurenzel.playgroundservice.models.User;
import com.laurenzel.playgroundservice.services.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")

public class UserController {

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/register")

    public ResponseEntity<User> register(@RequestBody User user) {
        return authenticationService.register(user.getName(), user.getEmail(), user.getPassword());
    }
}
