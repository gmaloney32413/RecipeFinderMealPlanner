package edu.matc.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "meal_plan")
public class MealPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "meal_plan_id")
    private int mealPlanId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "spoonacular_recipe_id", nullable = false)
    private int spoonacularRecipeId;

    @Column(name = "day_of_week", length = 10)
    private String dayOfWeek;

    @Column(name = "meal_type", length = 20)
    private String mealType;

    // Getters and setters
    public int getMealPlanId() { return mealPlanId; }
    public void setMealPlanId(int mealPlanId) { this.mealPlanId = mealPlanId; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public int getSpoonacularRecipeId() { return spoonacularRecipeId; }
    public void setSpoonacularRecipeId(int spoonacularRecipeId) { this.spoonacularRecipeId = spoonacularRecipeId; }

    public String getDayOfWeek() { return dayOfWeek; }
    public void setDayOfWeek(String dayOfWeek) { this.dayOfWeek = dayOfWeek; }

    public String getMealType() { return mealType; }
    public void setMealType(String mealType) { this.mealType = mealType; }
}