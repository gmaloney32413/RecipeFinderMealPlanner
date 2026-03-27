<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Meal Plan</title>
    <link rel="stylesheet" href="css/styles.css?v=<%= System.currentTimeMillis() %>">
</head>
<body>
<c:import url="includes/header.jsp"/>
<main class="main-container">
    <section class="meal-plan-section">
        <h1>My Meal Plan</h1>

        <!-- Option to choose weekly or biweekly -->
        <form action="mealPlan" method="get" class="meal-plan-form">
            <label for="planType">Select Plan Type:</label>
            <select name="planType" id="planType">
                <option value="weekly" ${planType=='weekly' ? 'selected' : ''}>Weekly</option>
                <option value="biweekly" ${planType=='biweekly' ? 'selected' : ''}>Biweekly</option>
            </select>
            <button type="submit" class="btn">Load Plan</button>
        </form>

        <!-- Display days and meals -->
        <table class="meal-plan-table">
            <thead>
            <tr>
                <th>Day</th>
                <th>Breakfast</th>
                <th>Lunch</th>
                <th>Dinner</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="day" items="${daysOfWeek}">
                <tr>
                    <td class="day-cell">${day}</td>
                    <c:forEach var="mealType" items="${mealTypes}">
                        <td class="meal-cell">
                            <c:set var="meal" value="${mealPlan[day][mealType]}" />
                            <c:if test="${meal != null}">
                                <div class="meal-recipe">${meal.recipeTitle}</div>
                            </c:if>
                            <!-- Dropdown to add saved recipe -->
                            <form action="addMealPlan" method="post" class="meal-add-form">
                                <input type="hidden" name="dayOfWeek" value="${day}">
                                <input type="hidden" name="mealType" value="${mealType}">
                                <select name="savedRecipeId">
                                    <c:forEach var="recipe" items="${savedRecipes}">
                                        <option value="${recipe.savedRecipeId}">${recipe.recipeTitle}</option>
                                    </c:forEach>
                                </select>
                                <button type="submit" class="btn btn-add">Add</button>
                            </form>
                        </td>
                    </c:forEach>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </section>
</main>
<c:import url="includes/footer.jsp"/>
</body>
</html>