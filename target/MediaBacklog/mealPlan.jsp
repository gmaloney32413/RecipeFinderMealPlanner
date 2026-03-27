<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Meal Plan</title>
    <link rel="stylesheet" href="css/styles.css">
</head>
<body>
<c:import url="includes/header.jsp"/>
<main>
    <h1>My Meal Plan</h1>

    <!-- Option to choose weekly or biweekly -->
    <form action="mealPlan" method="get">
        <select name="planType">
            <option value="weekly" ${planType=='weekly' ? 'selected' : ''}>Weekly</option>
            <option value="biweekly" ${planType=='biweekly' ? 'selected' : ''}>Biweekly</option>
        </select>
        <button type="submit">Load Plan</button>
    </form>

    <!-- Display days and meals -->
    <table class="meal-plan-table">
        <tr>
            <th>Day</th>
            <th>Breakfast</th>
            <th>Lunch</th>
            <th>Dinner</th>
        </tr>
        <c:forEach var="day" items="${daysOfWeek}">
            <tr>
                <td>${day}</td>
                <c:forEach var="mealType" items="${mealTypes}">
                    <td>
                        <c:set var="meal" value="${mealPlan[day][mealType]}" />
                        <c:if test="${meal != null}">
                            ${meal.recipeTitle}
                        </c:if>
                        <!-- Dropdown to add saved recipe -->
                        <form action="addMealPlan" method="post">
                            <input type="hidden" name="dayOfWeek" value="${day}">
                            <input type="hidden" name="mealType" value="${mealType}">
                            <select name="savedRecipeId">
                                <c:forEach var="recipe" items="${savedRecipes}">
                                    <option value="${recipe.savedRecipeId}">${recipe.recipeTitle}</option>
                                </c:forEach>
                            </select>
                            <button type="submit">Add</button>
                        </form>
                    </td>
                </c:forEach>
            </tr>
        </c:forEach>
    </table>
</main>
<c:import url="includes/footer.jsp"/>
</body>
</html>