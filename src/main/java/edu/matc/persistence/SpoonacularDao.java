package edu.matc.persistence;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.matc.com.spoonacular.AnalyzedInstructionsItem;
import edu.matc.com.spoonacular.ExtendedIngredientsItem;
import edu.matc.com.spoonacular.Recipes;
import edu.matc.com.spoonacular.RecipesItem;
import edu.matc.utilities.PropertiesLoader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

/**
 * DAO for interacting with the Spoonacular API.
 */
public class SpoonacularDao {

    private final Logger logger = LogManager.getLogger(this.getClass());
    private final Properties properties = new PropertiesLoader(){}.loadProperties("/spoonacular.properties");
    private final String apiKey = properties.getProperty("spoonacular.api.key");
    private final String baseUrl = properties.getProperty("spoonacular.base.url");

    private final ObjectMapper mapper;

    public SpoonacularDao() {
        mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    // Generic fetch for any endpoint returning a single recipe or list
    private <T> T fetch(String path, Class<T> clazz) {
        Client client = ClientBuilder.newClient();
        try {
            WebTarget target = client.target(baseUrl + path)
                    .queryParam("apiKey", apiKey);
            String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
            return mapper.readValue(response, clazz);
        } catch (JsonProcessingException e) {
            logger.error("Error processing response: " + e.getMessage());
            return null;
        } catch (Exception e) {
            logger.error("Error fetching data: " + e.getMessage());
            return null;
        }
    }

    /**
     * Search recipes by query.
     *
     * @param query search term
     * @return list of RecipesItem
     */
    public List<RecipesItem> searchRecipes(String query) {
        try {
            String encodedQuery = URLEncoder.encode(query, StandardCharsets.UTF_8);
            String path = baseUrl + "/complexSearch?query=" + encodedQuery + "&number=15" + "&addRecipeInformation=true";
            Recipes recipes = fetch(path, Recipes.class);
            return recipes != null ? recipes.getRecipes() : Collections.emptyList();
        } catch (Exception e) {
            logger.error("Error searching recipes: " + e.getMessage());
            return Collections.emptyList();
        }
    }

    /**
     * Get full recipe details by Spoonacular ID.
     *
     * @param recipeId Spoonacular recipe ID
     * @return RecipesItem
     */
    public RecipesItem getRecipeDetails(int recipeId) {
        return fetch("/recipes/" + recipeId + "/information", RecipesItem.class);
    }

    /**
     * Get recipe instructions only (optional helper).
     *
     * @param recipeId Spoonacular recipe ID
     * @return list of steps
     */
    public List<AnalyzedInstructionsItem> getRecipeInstructions(int recipeId) {
        RecipesItem recipe = getRecipeDetails(recipeId);
        return recipe != null ? recipe.getAnalyzedInstructions() : Collections.emptyList();
    }

    /**
     * Get ingredients for a recipe (optional helper).
     *
     * @param recipeId Spoonacular recipe ID
     * @return list of extended ingredients
     */
    public List<ExtendedIngredientsItem> getRecipeIngredients(int recipeId) {
        RecipesItem recipe = getRecipeDetails(recipeId);
        return recipe != null ? recipe.getExtendedIngredients() : Collections.emptyList();
    }
}