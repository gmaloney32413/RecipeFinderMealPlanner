<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Saved Recipes</title>
    <link rel="stylesheet" href="css/styles.css">
</head>
<body>
<c:import url="includes/header.jsp"/>
<main>
    <h1>My Saved Recipes</h1>

    <c:if test="${empty savedRecipes}">
        <p>You have not saved any recipes yet.</p>
    </c:if>

    <div class="recipe-list">
        <c:forEach var="recipe" items="${savedRecipes}">
            <div class="recipe-card">
                <img src="${recipe.recipeImage}" alt="${recipe.recipeTitle}" class="recipe-image"/>
                <h3>${recipe.recipeTitle}</h3>
                <p>Notes: ${recipe.notes}</p>
                <form action="deleteRecipe" method="post">
                    <input type="hidden" name="savedRecipeId" value="${recipe.savedRecipeId}">
                    <button type="submit">Remove</button>
                </form>
            </div>
        </c:forEach>
    </div>
</main>
<c:import url="includes/footer.jsp"/>
</body>
</html>