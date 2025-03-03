package com.example.macrotrackers.repositories;

import com.example.macrotrackers.models.UserProfile;
import com.example.macrotrackers.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {
    Optional<UserProfile> findByUser(User user);
}
