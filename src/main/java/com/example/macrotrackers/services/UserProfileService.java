package com.example.macrotrackers.services;

import com.example.macrotrackers.models.User;
import com.example.macrotrackers.models.UserProfile;
import com.example.macrotrackers.repositories.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserProfileService {

    @Autowired
    private UserProfileRepository userProfileRepository;

    public UserProfile createProfile(User user, double weight, double height) {
        UserProfile profile = new UserProfile(user, weight, height);
        return userProfileRepository.save(profile);
    }

    public Optional<UserProfile> getProfileByUser(User user) {
        return userProfileRepository.findByUser(user);
    }
}
