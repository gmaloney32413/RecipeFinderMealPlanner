<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Browse Recipes</title>
    <link rel="stylesheet" href="css/styles.css?v=<%= System.currentTimeMillis() %>">
</head>
<body>
<c:import url="includes/header.jsp"/>
<main class="main-container">
    <section class="browse-recipes-section">
        <h1>Browse Spoonacular Recipes</h1>

        <!-- Search form -->
        <form action="browseRecipes" method="get" class="search-form">
            <input type="text" name="query" placeholder="Search recipes..." class="search-input">
            <button type="submit" class="btn btn-search">Search</button>
        </form>

        <!-- Display list of recipes -->
        <div class="recipe-list">
            <c:forEach var="recipe" items="${recipes}">
                <div class="recipe-card">
                    <div class="recipe-image-wrapper">
                        <img src="${recipe.image}" alt="${recipe.title}" class="recipe-image"/>
                    </div>
                    <div class="recipe-content">
                        <h3 class="recipe-title">${recipe.title}</h3>
                        <p class="recipe-summary">${recipe.summary}</p>
                        <form action="saveRecipe" method="post" class="recipe-form">
                            <input type="hidden" name="recipeId" value="${recipe.id}">
                            <button type="submit" class="btn btn-add">Add to Saved Recipes</button>
                        </form>
                    </div>
                </div>
            </c:forEach>
        </div>
    </section>
</main>
<c:import url="includes/footer.jsp"/>
</body>
</html>