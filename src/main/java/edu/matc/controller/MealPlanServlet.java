package edu.matc.controller;

import edu.matc.com.spoonacular.Recipes;
import edu.matc.entity.MealPlan;
import edu.matc.entity.Recipe;
import edu.matc.entity.User;
import edu.matc.persistence.GenericDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@WebServlet("/mealPlan")
public class MealPlanServlet extends HttpServlet {

    private GenericDao<MealPlan> mealPlanDao;
    private GenericDao<Recipe> recipeDao;

    @Override
    public void init() {
        recipeDao = new GenericDao<>(Recipe.class);
        mealPlanDao = new GenericDao<>(MealPlan.class);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int userId = 1;
        GenericDao<User> userDao = new GenericDao<>(User.class);
        User user = userDao.getById(userId);

        //
        List<Recipe> userRecipes = recipeDao.getByPropertyEqual("user", user);

        // Get all meal plans
        List<MealPlan> mealPlans = mealPlanDao.getByPropertyEqual("user", user);

        String[] daysOfWeek = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        String[] mealTypes = {"breakfast","lunch","dinner"};

        Map<String, Map<String, Recipe>> planGrid = new LinkedHashMap<>();
        for (String day : daysOfWeek) {
            planGrid.put(day, new HashMap<>());
        }

// Fill the grid
        for (MealPlan plan : mealPlans) {
            Recipe recipe = userRecipes.stream()
                    .filter(r -> r.getSpoonacularRecipeId() == plan.getSpoonacularRecipeId())
                    .findFirst()
                    .orElse(null);

            if (recipe != null && plan.getDayOfWeek() != null && plan.getMealType() != null) {
                // Normalize day and mealType
                String day = plan.getDayOfWeek().trim();
                if (!day.isEmpty()) {
                    day = Character.toUpperCase(day.charAt(0)) + day.substring(1).toLowerCase();
                    String mealType = plan.getMealType().trim().toLowerCase();

                    Map<String, Recipe> mealMap = planGrid.get(day);
                    if (mealMap != null) {
                        mealMap.put(mealType, recipe);
                    }
                }
            }
        }

        request.setAttribute("mealPlanGrid", planGrid);
        request.setAttribute("daysOfWeek", daysOfWeek);
        request.setAttribute("mealTypes", mealTypes);
        // Send to JSP
        request.setAttribute("mealPlans", mealPlans);
        request.getRequestDispatcher("/mealPlan.jsp").forward(request, response);
    }
}