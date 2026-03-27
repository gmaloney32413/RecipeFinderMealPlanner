package edu.matc.entity;

import edu.matc.entity.MealPlan;
import jakarta.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;

    @Column(nullable = false, unique = true, name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(nullable = false, name = "password")
    private String password;

    @Column(name = "created_at")
    private Timestamp createdAt;

    // One user can have many saved recipes
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Recipe> savedRecipes;

    // One user can have many meal plans
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MealPlan> mealPlans;

    // Getters and setters
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public Timestamp getCreatedAt() { return createdAt; }
    public void setCreatedAt(Timestamp createdAt) { this.createdAt = createdAt; }

    public List<Recipe> getSavedRecipes() { return savedRecipes; }
    public void setSavedRecipes(List<Recipe> savedRecipes) { this.savedRecipes = savedRecipes; }

    public List<MealPlan> getMealPlans() { return mealPlans; }
    public void setMealPlans(List<MealPlan> mealPlans) { this.mealPlans = mealPlans; }
}