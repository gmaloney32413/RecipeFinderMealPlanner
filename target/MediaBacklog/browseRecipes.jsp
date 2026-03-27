<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Browse Recipes</title>
    <link rel="stylesheet" href="css/styles.css">
</head>
<body>
<c:import url="includes/header.jsp"/>
<main>
    <h1>Browse Spoonacular Recipes</h1>

    <!-- Search form (optional) -->
    <form action="browseRecipes" method="get">
        <input type="text" name="query" placeholder="Search recipes...">
        <button type="submit">Search</button>
    </form>

    <!-- Display list of recipes -->
    <div class="recipe-list">
        <c:forEach var="recipe" items="${recipes}">
            <div class="recipe-card">
                <img src="${recipe.image}" alt="${recipe.title}" class="recipe-image"/>
                <h3>${recipe.title}</h3>
                <p>${recipe.summary}</p>
                <form action="saveRecipe" method="post">
                    <input type="hidden" name="recipeId" value="${recipe.id}">
                    <button type="submit">Add to Saved Recipes</button>
                </form>
            </div>
        </c:forEach>
    </div>
</main>
<c:import url="includes/footer.jsp"/>
</body>
</html>