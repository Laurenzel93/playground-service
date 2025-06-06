package com.laurenzel.playgroundservice.services;

import com.laurenzel.playgroundservice.models.User;
import com.laurenzel.playgroundservice.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final UserRepository userRepository;

    public ResponseEntity<User> register(String name, String password, String email) {
        var user = User.builder().name(name).email(email).password(password).build();

        userRepository.save(user);
        return ResponseEntity.ok(user);
    }
}
