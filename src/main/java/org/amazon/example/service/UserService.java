package org.amazon.example.service;

import org.amazon.example.entity.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private final Map<String, User> users = new HashMap<>();
    private final PasswordEncoder passwordEncoder;

    public UserService(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;

        // Initialize default users
        User admin = new User("admin", passwordEncoder.encode("admin123"), "ADMIN");
        users.put(admin.getUsername(), admin);

        User user = new User("user", passwordEncoder.encode("user123"), "USER");
        users.put(user.getUsername(), user);
    }

    public void registerUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        users.put(user.getUsername(), user);
    }

    public User findByUsername(String username) {
        return users.get(username);
    }
}