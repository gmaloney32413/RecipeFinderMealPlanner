package edu.matc.controller;

import edu.matc.entity.MealPlan;
import edu.matc.entity.Recipe;
import edu.matc.entity.User;
import edu.matc.persistence.GenericDao;
import edu.matc.persistence.SpoonacularDao;
import edu.matc.service.SpoonacularConverter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/savedRecipes")

public class SavedRecipesServlet extends HttpServlet {
    private final MealPlan mealPlan = new MealPlan();
    private final Recipe recipe = new Recipe();
    private final Logger logger = LogManager.getLogger(this.getClass());
    private final SpoonacularDao spoonacularDao = new SpoonacularDao();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int userId = 1; // hardcoded for now (until Cognito)


        // Retrieve the user
        GenericDao<User> userDao = new GenericDao<>(User.class);
        User currentUser = userDao.getById(userId);

        // Retrieve the saved recipes for that user
        GenericDao<Recipe> savedRecipeDao = new GenericDao<>(Recipe.class);
        List<Recipe> savedRecipes = savedRecipeDao.getByPropertyEqual("user", currentUser);

        logger.debug("Number of saved recipes for user " + userId + ": " + savedRecipes.size());

        // Pass the list to the JSP
        request.setAttribute("savedRecipes", savedRecipes);

        // Forward to JSP
        request.getRequestDispatcher("/savedRecipes.jsp").forward(request, response);
            }
        }
    //}
//}
