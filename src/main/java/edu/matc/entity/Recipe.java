package edu.matc.entity;

import edu.matc.entity.User;
import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "saved_recipes")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "saved_recipe_id")
    private int savedRecipeId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "spoonacular_recipe_id", nullable = false)
    private int spoonacularRecipeId;

    @Column(name = "recipe_title", length = 255)
    private String recipeTitle;

    @Column(name = "recipe_image", length = 255)
    private String recipeImage;

    @Column(columnDefinition = "TEXT", name = "notes")
    private String notes;

    @Column(name = "date_saved")
    private Timestamp dateSaved;

    // Getters and setters
    public int getSavedRecipeId() { return savedRecipeId; }
    public void setSavedRecipeId(int savedRecipeId) { this.savedRecipeId = savedRecipeId; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public int getSpoonacularRecipeId() { return spoonacularRecipeId; }
    public void setSpoonacularRecipeId(int spoonacularRecipeId) { this.spoonacularRecipeId = spoonacularRecipeId; }

    public String getRecipeTitle() { return recipeTitle; }
    public void setRecipeTitle(String recipeTitle) { this.recipeTitle = recipeTitle; }

    public String getRecipeImage() { return recipeImage; }
    public void setRecipeImage(String recipeImage) { this.recipeImage = recipeImage; }

    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }

    public Timestamp getDateSaved() { return dateSaved; }
    public void setDateSaved(Timestamp dateSaved) { this.dateSaved = dateSaved; }
}