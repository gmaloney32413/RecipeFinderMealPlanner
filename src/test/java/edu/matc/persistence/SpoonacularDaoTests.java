package edu.matc.persistence;

import edu.matc.com.spoonacular.AnalyzedInstructionsItem;
import edu.matc.com.spoonacular.RecipesItem;
import edu.matc.persistence.SpoonacularDao;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SpoonacularDaoTest {

    /*

    private static SpoonacularDao dao;

    @BeforeAll
    static void setup() {
        dao = new SpoonacularDao();
    }

    @Test
    void testSearchRecipes() {
        List<RecipesItem> results = dao.searchRecipes("chicken");
        assertNotNull(results, "Results should not be null");
        assertTrue(results.size() > 0, "Should return at least one recipe");

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
        //assertNotNull(instructions, "Instructions should not be null");
        //assertTrue(instructions.size() > 0, "Should have at least one instruction step");

        AnalyzedInstructionsItem firstInstruction = instructions.get(0);
        assertNotNull(firstInstruction.getSteps(), "Instruction steps should not be null");
        System.out.println("First instruction name: " + firstInstruction.getName());
    }

     */
}