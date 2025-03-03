package com.example.macrotrackers.repositories;

import com.example.macrotrackers.models.IntakeLog;
import com.example.macrotrackers.models.User;
import com.example.macrotrackers.models.MealType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IntakeLogRepository extends JpaRepository<IntakeLog, Long> {
    List<IntakeLog> findByUserAndMealType(User user, MealType mealType);
}
