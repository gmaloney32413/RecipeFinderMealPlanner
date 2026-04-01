package edu.matc.persistence;

import edu.matc.entity.Recipe;
import edu.matc.entity.User;
import org.junit.jupiter.api.Test;

import java.sql.Timestamp;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RecipeDaoTest {

    GenericDao<Recipe> recipeDao = new GenericDao<>(Recipe.class);
    GenericDao<User> userDao = new GenericDao<>(User.class);

    @Test
    void insertSuccess() {

        User user = userDao.getById(1);

        Recipe recipe = new Recipe();
        recipe.setUser(user);
        recipe.setSpoonacularRecipeId(99999);
        recipe.setRecipeTitle("JUnit Test Recipe");
        recipe.setRecipeImage("test.jpg");
        recipe.setNotes("Test note");
        recipe.setDateSaved(new Timestamp(System.currentTimeMillis()));

        int id = (int) recipeDao.insert(recipe);

        assertNotNull(id);

        Recipe insertedRecipe = recipeDao.getById(id);

        assertEquals("JUnit Test Recipe", insertedRecipe.getRecipeTitle());
    }


    @Test
    void getAllSuccess() {

        List<Recipe> recipes = recipeDao.getAll();

        assertTrue(recipes.size() > 0);
    }


    @Test
    void updateSuccess() {

        Recipe recipe = recipeDao.getById(1);

        String newTitle = "Updated Recipe Title";
        recipe.setRecipeTitle(newTitle);

        recipeDao.update(recipe);

        Recipe updatedRecipe = recipeDao.getById(1);

        assertEquals(newTitle, updatedRecipe.getRecipeTitle());
    }


    @Test
    void deleteSuccess() {

        User user = userDao.getById(1);

        Recipe recipe = new Recipe();
        recipe.setUser(user);
        recipe.setSpoonacularRecipeId(88888);
        recipe.setRecipeTitle("Delete Test");
        recipe.setDateSaved(new Timestamp(System.currentTimeMillis()));

        int id = (int) recipeDao.insert(recipe);

        Recipe insertedRecipe = recipeDao.getById(id);

        recipeDao.delete(insertedRecipe);

        Recipe deletedRecipe = recipeDao.getById(id);

        assertNull(deletedRecipe);
    }


    @Test
    void getByPropertyEqualSuccess() {

        List<Recipe> recipes = recipeDao.getByPropertyEqual("recipeTitle", "JUnit Test Recipe");

        assertNotNull(recipes);
    }

    @Test
    void getByIdNotFound() {
        Recipe recipe = recipeDao.getById(-1);
        assertNull(recipe, "getById for non-existent ID should return null");
    }

    @Test
    void getByPropertyEqualEmpty() {
        List<Recipe> recipes = recipeDao.getByPropertyEqual("recipeTitle", "nonexistent title");
        assertNotNull(recipes, "List should not be null");
        assertTrue(recipes.isEmpty(), "List should be empty for non-matching property");
    }

    @Test
    void insertWithNullOptionalFields() {
        User user = userDao.getById(1);
        Recipe recipe = new Recipe();
        recipe.setUser(user);
        recipe.setSpoonacularRecipeId(12345);
        recipe.setRecipeTitle("No Image or Notes");

        int id = (int) recipeDao.insert(recipe);
        Recipe inserted = recipeDao.getById(id);
        assertNotNull(inserted);
        assertNull(inserted.getRecipeImage());
        assertNull(inserted.getNotes());
    }
}