package edu.matc.controller;

import edu.matc.entity.MealPlan;
import edu.matc.entity.Recipe;
import edu.matc.entity.User;
import edu.matc.persistence.GenericDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@WebServlet("/mealPlan")
public class MealPlanServlet extends HttpServlet {

    private GenericDao<MealPlan> mealPlanDao;

    @Override
    public void init() {
        mealPlanDao = new GenericDao<>(MealPlan.class);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int userId = 1;
        User user = new User();
        user.setUserId(userId);

        // Get all meal plans
        List<MealPlan> mealPlans = mealPlanDao.getByPropertyEqual("user", user);

        Map<String, Map<String, Recipe>> planGrid = new HashMap<>();
        String[] daysOfWeek = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        for (String day : daysOfWeek) {
            planGrid.put(day, new HashMap<>());
        }

        GenericDao<Recipe> recipeDao = new GenericDao<>(Recipe.class);

// Fill the grid
        for (MealPlan plan : mealPlans) {
            // Get the recipe for this meal plan
            Recipe recipe = recipeDao.getByPropertyEqual("spoonacularRecipeId", plan.getSpoonacularRecipeId())
                    .stream()
                    .filter(r -> r.getUser().getUserId() == plan.getUser().getUserId())
                    .findFirst()
                    .orElse(null);
            if (recipe != null) {
                planGrid.get(plan.getDayOfWeek()).put(plan.getMealType(), recipe);
            }
        }

        request.setAttribute("mealPlanGrid", planGrid);
        request.setAttribute("daysOfWeek", daysOfWeek);
        request.setAttribute("mealTypes", new String[]{"breakfast","lunch","dinner"});
        // Send to JSP
        request.setAttribute("mealPlans", mealPlans);
        request.getRequestDispatcher("/mealPlan.jsp").forward(request, response);
    }
}