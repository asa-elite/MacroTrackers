package com.example.macrotrackers.controllers;

import com.example.macrotrackers.models.User;
import com.example.macrotrackers.models.UserProfile;
import com.example.macrotrackers.services.UserProfileService;
import com.example.macrotrackers.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/profile")
public class UserProfileController {

    @Autowired
    private UserProfileService userProfileService;

    @Autowired
    private UserService userService;

    @PostMapping("/{username}")
    public UserProfile createProfile(@PathVariable String username, @RequestParam double weight, @RequestParam double height) {
        Optional<User> user = userService.findByUsername(username);
        return user.map(u -> userProfileService.createProfile(u, weight, height))
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    @GetMapping("/{username}")
    public Optional<UserProfile> getProfile(@PathVariable String username) {
        return userService.findByUsername(username).flatMap(userProfileService::getProfileByUser);
    }
}
