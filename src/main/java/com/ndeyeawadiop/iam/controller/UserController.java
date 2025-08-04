package com.ndeyeawadiop.iam.controller;

import com.ndeyeawadiop.iam.model.User;
import com.ndeyeawadiop.iam.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public User createUser(@RequestBody User user) {
        System.out.println("[AUDIT] Creating user: " + user.getUsername());
        return userRepository.save(user);
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @PostMapping("/{id}/roles")
    public User assignRole(@PathVariable Long id, @RequestBody Map<String, String> body) {
        User user = userRepository.findById(id).orElse(null);
        if (user != null) {
            user.setRole(body.get("role"));
            System.out.println("[AUDIT] Assigned role to user " + id + ": " + body.get("role"));
            return userRepository.save(user);
        }
        return null;
    }

    @DeleteMapping("/{id}/roles")
    public User revokeRole(@PathVariable Long id) {
        User user = userRepository.findById(id).orElse(null);
        if (user != null) {
            System.out.println("[AUDIT] Revoked role from user " + id);
            user.setRole(null);
            return userRepository.save(user);
        }
        return null;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
