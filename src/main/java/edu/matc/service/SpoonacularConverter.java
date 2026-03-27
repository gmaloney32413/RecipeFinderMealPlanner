package edu.matc.service;

import edu.matc.com.spoonacular.RecipesItem;
import edu.matc.entity.Recipe;
import edu.matc.entity.User;

import java.sql.Timestamp;

/**
 * Converts Spoonacular API objects to database entities.
 */
public class SpoonacularConverter {

    /**
     * Converts a RecipesItem from the API into a Recipe entity.
     *
     * @param apiItem The RecipesItem from Spoonacular API
     * @param user The user saving the recipe
     * @return Recipe entity ready to persist
     */
    public Recipe convertToRecipe(RecipesItem apiItem, User user) {
        Recipe recipe = new Recipe();

        recipe.setUser(user);  // Set the owning user
        recipe.setSpoonacularRecipeId(apiItem.getId()); // API recipe ID
        recipe.setRecipeTitle(apiItem.getTitle());      // Recipe title
        recipe.setRecipeImage(apiItem.getImage());      // Image URL
        recipe.setNotes("");                             // Default empty notes
        recipe.setDateSaved(new Timestamp(System.currentTimeMillis())); // Current timestamp

        return recipe;
    }
}