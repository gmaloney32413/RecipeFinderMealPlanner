package edu.matc.persistence;

import edu.matc.com.spoonacular.AnalyzedInstructionsItem;
import edu.matc.com.spoonacular.ExtendedIngredientsItem;
import edu.matc.com.spoonacular.RecipesItem;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;


import static org.junit.jupiter.api.Assertions.*;

class SpoonacularDaoTest {

    /*

    private final Logger logger = LogManager.getLogger(this.getClass());
    private static SpoonacularDao dao;

    @BeforeAll
    static void setup() {
        dao = new SpoonacularDao();
    }

    @Test
    void testSearchRecipes() {
        List<RecipesItem> results = dao.searchRecipes("chicken");
        assertNotNull(results, "Results should not be null");
        assertTrue(!results.isEmpty(), "Should return at least one recipe");

        RecipesItem first = results.get(0);
        System.out.println("First recipe title: " + first.getTitle());
        assertNotNull(first.getTitle(), "Recipe title should not be null");
        assertNotNull(first.getId(), "Recipe ID should not be null");
    }

    @Test
    void testGetRecipeDetails() {
        // Use a known recipe ID; Spoonacular has sample IDs like 716429
        RecipesItem recipe = dao.getRecipeDetails(716429);

        assertNotNull(recipe, "Recipe details should not be null");
        assertEquals(716429, recipe.getId(), "Recipe ID should match");
        assertNotNull(recipe.getTitle(), "Recipe title should not be null");
        assertNotNull(recipe.getExtendedIngredients(), "Ingredients should not be null");
        assertTrue(recipe.getExtendedIngredients().size() > 0, "Should have at least one ingredient");

    }

    @Test
    void testGetAnalyzedInstructions() {
        List<AnalyzedInstructionsItem> instructions = dao.getRecipeInstructions(716429);

        assertNotNull(instructions);

        if (!instructions.isEmpty()) {
            AnalyzedInstructionsItem firstInstruction = instructions.get(0);
            assertNotNull(firstInstruction.getSteps(), "Instruction steps should not be null");
            logger.info("First instruction name: " + firstInstruction.getName());
        } else {
            logger.info("Recipe has no analyzed instructions.");
        }
    }

    @Test
    void testGetRecipeIngredients() {
        List<ExtendedIngredientsItem> ingredients = dao.getRecipeIngredients(716429);
        assertNotNull(ingredients, "Ingredients should not be null");
        assertTrue(!ingredients.isEmpty(), "Should return at least one ingredient");
        System.out.println("First ingredient: " + ingredients.get(0).getName());
    }

    @Test
    void testSearchRecipesEmptyQuery() {
        List<RecipesItem> results = dao.searchRecipes("");
        assertNotNull(results, "Results should not be null for empty query");
        assertTrue(results.isEmpty() || results.size() >= 0, "Empty query should return empty or some default results");
    }

    @Test
    void testGetRecipeDetailsNonExistent() {
        assertThrows(RuntimeException.class, () -> dao.getRecipeDetails(-1), "Invalid recipe ID should throw exception");
    }


     */


}