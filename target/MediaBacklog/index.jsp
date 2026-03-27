<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Recipe Finder and Meal Planner</title>
    <link rel="stylesheet" href="css/styles.css?v=<%= System.currentTimeMillis() %>">
</head>
<body>
<c:import url="includes/header.jsp"/>
<main>
    <!-- About / Welcome Section -->
    <section id="about">
        <h2>Welcome to My Recipe Finder and Meal Planner</h2>
        <p>
            Discover delicious recipes from around the world, save your favorites, and easily plan your weekly or biweekly meals.
            Whether you're cooking for one, a family, or hosting friends, our app helps you stay organized, inspired, and stress-free.
        </p>
    </section>

    <!-- Quick Links / Call-to-Action -->
    <section id="quick-links">
        <h2>Get Started</h2>
        <div>
            <div class="card">
                <h3>Find Recipes</h3>
                <p>Search thousands of recipes, filter by diet, ingredients, or cuisine, and find your next favorite meal.</p>
                <a href="browseRecipes" class="btn">Browse Recipes</a>
            </div>
            <div class="card" >
                <h3>Saved Recipes</h3>
                <p>Keep all your favorite recipes in one place so you can access them anytime.</p>
                <a href="savedRecipes" class="btn">View Saved Recipes</a>
            </div>
            <div class="card">
                <h3>Meal Plans</h3>
                <p>Create weekly or biweekly meal plans and drag your saved recipes into each day and meal.</p>
                <a href="mealPlans" class="btn">Plan Your Meals</a>
            </div>
        </div>
    </section>

    <!-- Login Prompt -->
    <section id="login">
        <p>Already have an account? Log in to save your recipes and create meal plans:</p>
        <a href="logIn" class="btn">Login</a>
    </section>
</main>
<c:import url="includes/footer.jsp"/>
</body>
</html>