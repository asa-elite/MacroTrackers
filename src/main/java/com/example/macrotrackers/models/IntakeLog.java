package com.example.macrotrackers.models;

import jakarta.persistence.*;

@Entity
@Table(name = "intake_logs")
public class IntakeLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private MealType mealType; // Breakfast, Lunch, Dinner, Snack

    private int calories;
    private int carbs;  // in grams
    private int sugars; // in grams

    public IntakeLog() {}

    public IntakeLog(User user, MealType mealType, int calories, int carbs, int sugars) {
        this.user = user;
        this.mealType = mealType;
        this.calories = calories;
        this.carbs = carbs;
        this.sugars = sugars;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public MealType getMealType() {
        return mealType;
    }

    public void setMealType(MealType mealType) {
        this.mealType = mealType;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getCarbs() {
        return carbs;
    }

    public void setCarbs(int carbs) {
        this.carbs = carbs;
    }

    public int getSugars() {
        return sugars;
    }

    public void setSugars(int sugars) {
        this.sugars = sugars;
    }
}
