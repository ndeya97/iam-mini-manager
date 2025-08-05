package com.ndeyeawadiop.iam.service;

import com.ndeyeawadiop.iam.model.User;
import com.ndeyeawadiop.iam.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public User assignRole(Long id, String role) {
        return userRepository.findById(id).map(user -> {
            user.setRole(role);
            return userRepository.save(user);
        }).orElse(null);
    }

    public User revokeRole(Long id) {
        return userRepository.findById(id).map(user -> {
            user.setRole(null);
            return userRepository.save(user);
        }).orElse(null);
    }
}
