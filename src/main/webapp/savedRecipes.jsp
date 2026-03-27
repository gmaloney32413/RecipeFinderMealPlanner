<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Saved Recipes</title>
    <link rel="stylesheet" href="css/styles.css?v=<%= System.currentTimeMillis() %>">
</head>
<body>
<c:import url="includes/header.jsp"/>
<main class="main-container">
    <section class="saved-recipes-section">
        <h1>My Saved Recipes</h1>

        <c:if test="${empty savedRecipes}">
            <p class="empty-message">You have not saved any recipes yet.</p>
        </c:if>

        <div class="recipe-list">
            <c:forEach var="recipe" items="${savedRecipes}">
                <div class="recipe-card">
                    <div class="recipe-image-wrapper">
                        <img src="${recipe.recipeImage}" alt="${recipe.recipeTitle}" class="recipe-image"/>
                    </div>
                    <div class="recipe-content">
                        <h3 class="recipe-title">${recipe.recipeTitle}</h3>
                        <p class="recipe-notes">Notes: ${recipe.notes}</p>
                        <form action="deleteRecipe" method="post" class="recipe-form">
                            <input type="hidden" name="savedRecipeId" value="${recipe.savedRecipeId}">
                            <button type="submit" class="btn btn-remove">Remove</button>
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