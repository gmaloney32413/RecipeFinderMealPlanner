package edu.matc.controller;

import edu.matc.com.spoonacular.Recipes;
import edu.matc.entity.User;
import edu.matc.persistence.GenericDao;
import edu.matc.persistence.SpoonacularDao;
import edu.matc.service.SpoonacularConverter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static edu.matc.utilities.PropertiesLoader.logger;

@WebServlet("/browseRecipes")

public class BrowseRecipesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int userId = 1;

        GenericDao<User> userDao = new GenericDao<>(User.class);
        User currentUser = userDao.getById(userId);

        String searchQuery = request.getParameter("query");

        logger.debug("Search parameters received - query: " + searchQuery);
        Recipes recipes = new Recipes();
        SpoonacularConverter converter = new SpoonacularConverter();
        SpoonacularDao spoonDao = new SpoonacularDao();

        if (searchQuery != null && !searchQuery.isBlank()) {

        }

        request.getRequestDispatcher("/browseRecipes.jsp").forward(request, response);
    }
}
