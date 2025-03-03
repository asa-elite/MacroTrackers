package com.example.macrotrackers.services;

import com.example.macrotrackers.models.IntakeLog;
import com.example.macrotrackers.models.MealType;
import com.example.macrotrackers.models.User;
import com.example.macrotrackers.repositories.IntakeLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IntakeLogService {

    @Autowired
    private IntakeLogRepository intakeLogRepository;

    public IntakeLog logIntake(User user, MealType mealType, int calories, int carbs, int sugars) {
        IntakeLog log = new IntakeLog(user, mealType, calories, carbs, sugars);
        return intakeLogRepository.save(log);
    }

    public List<IntakeLog> getLogsByUserAndMeal(User user, MealType mealType) {
        return intakeLogRepository.findByUserAndMealType(user, mealType);
    }
}
