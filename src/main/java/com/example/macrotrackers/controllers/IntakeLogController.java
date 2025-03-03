package com.example.macrotrackers.controllers;

import com.example.macrotrackers.models.IntakeLog;
import com.example.macrotrackers.models.MealType;
import com.example.macrotrackers.models.User;
import com.example.macrotrackers.services.IntakeLogService;
import com.example.macrotrackers.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/intake")
public class IntakeLogController {

    @Autowired
    private IntakeLogService intakeLogService;

    @Autowired
    private UserService userService;

    @PostMapping("/{username}")
    public IntakeLog logIntake(@PathVariable String username, @RequestParam MealType mealType,
                               @RequestParam int calories, @RequestParam int carbs, @RequestParam int sugars) {
        Optional<User> user = userService.findByUsername(username);
        return user.map(u -> intakeLogService.logIntake(u, mealType, calories, carbs, sugars))
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    @GetMapping("/{username}")
    public List<IntakeLog> getLogs(@PathVariable String username, @RequestParam MealType mealType) {
        return userService.findByUsername(username)
                .map(user -> intakeLogService.getLogsByUserAndMeal(user, mealType))
                .orElseThrow();
    }
}
