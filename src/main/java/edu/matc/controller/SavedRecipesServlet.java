package edu.matc.controller;

import edu.matc.entity.MealPlan;
import edu.matc.entity.Recipe;
import edu.matc.entity.User;
import edu.matc.persistence.GenericDao;
import edu.matc.persistence.SpoonacularDao;
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
        request.getRequestDispatcher("/savedRecipes.jsp").forward(request, response);

        Long userId = 1L; // hardcoded for now (until Cognito)

        GenericDao<User> userDao = new GenericDao<>(User.class);
        User currentUser = userDao.getById(userId);
        // Get search parameters (if present)
        String searchQuery = request.getParameter("searchQuery");
        String searchType = request.getParameter("searchType");

        logger.debug("Search parameters received - query: " + searchQuery + ", type: " + searchType);
        /*List<MediaItem> mediaItems = new ArrayList<>();
        MediaConverter converter = new MediaConverter();
        TMDBDao tmdbDao = new TMDBDao();

        if (searchQuery != null && !searchQuery.isBlank()) {
            if (searchType == null) searchType = "any";
            switch (searchType.toLowerCase()) {
                case "movie":
                    // searchMovies returns List<MovieItem>
                    List<MovieItem> movieResults = tmdbDao.searchMovies(searchQuery);
                    for (MovieItem item : movieResults) {
                        Movie movie = converter.convertToMovie(item);
                        mediaItems.add(movie);
                    }
                    break;

                case "tv":
                    // searchTv returns List<TVItem>
                    List<TVItem> tvResults = tmdbDao.searchTv(searchQuery);
                    for (TVItem item : tvResults) {
                        TvShow show = converter.convertToTvShow(item);
                        mediaItems.add(show);
                    }
                    break;

                default:
                    // generic search: combine movies and tv shows
                    List<MovieItem> movies = tmdbDao.searchMovies(searchQuery);
                    List<TVItem> tvShows = tmdbDao.searchTv(searchQuery);

                    movies.forEach(item -> mediaItems.add(converter.convertToMovie(item)));
                    tvShows.forEach(item -> mediaItems.add(converter.convertToTvShow(item)));

                    logger.debug("Media items size: " + mediaItems.size());
                    mediaItems.forEach(m -> logger.debug("Item: " + m));

                    break;
            }
        } else {
            if (searchType == null) searchType = "any";

            switch (searchType.toLowerCase()) {

                case "movie":
                    tmdbDao.getMoviePage().getResults()
                            .forEach(item -> mediaItems.add(converter.convertToMovie(item)));
                    break;

                case "tv":
                    tmdbDao.getTVPage().getResults()
                            .forEach(item -> mediaItems.add(converter.convertToTvShow(item)));
                    break;

                default:
                    tmdbDao.getMoviePage().getResults()
                            .forEach(item -> mediaItems.add(converter.convertToMovie(item)));

                    tmdbDao.getTVPage().getResults()
                            .forEach(item -> mediaItems.add(converter.convertToTvShow(item)));
                    break;





                request.setAttribute("mediaItems", mediaItems);

         */
            }
        }
    //}
//}
