package edu.matc.persistence;


import com.fasterxml.jackson.databind.ObjectMapper;
import edu.matc.com.spoonacular.Recipes;
import edu.matc.com.spoonacular.RecipesItem;
import edu.matc.entity.Recipe;
import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


/**
 * The type Test service client.
 */
public class TestServiceClient {



    /**
     * Testswapi json.
     *
     * @throws Exception the exception
     */

    /*
    @Test
    public void testSpoonacularJSON() throws Exception {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://api.spoonacular.com/recipes/random?number=10")
                        .queryParam("number", "10")
                        .queryParam("apiKey", "38198faa55f64e7ea0c075a4281a5f83");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);

        //Mapping objects from the api
        ObjectMapper mapper = new ObjectMapper();
        Recipes result = mapper.readValue(response, Recipes.class);
        RecipesItem recipesItem = result.getRecipes().get(0);




        //assertEquals("???", response);

    }

    @Test
    public void testRecipeDetailJSON() throws Exception {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://api.spoonacular.com/recipes/716429/information")
                        .queryParam("apiKey", "38198faa55f64e7ea0c075a4281a5f83");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);

        //Mapping objects from the api
        ObjectMapper mapper = new ObjectMapper();
        RecipesItem recipe = mapper.readValue(response, RecipesItem.class);
        String expectedRecipeTitle = "Pasta with Garlic, Scallions, Cauliflower & Breadcrumbs";
        int expectedRecipeID = 716429;

        assertEquals(expectedRecipeTitle, recipe.getTitle());
        assertEquals(expectedRecipeID, recipe.getId());


        //assertEquals("???", response);
    }


     */






}