package edu.matc.persistence;

import edu.matc.entity.MealPlan;
import edu.matc.entity.User;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MealPlanDaoTest {

    GenericDao<MealPlan> mealPlanDao = new GenericDao<>(MealPlan.class);
    GenericDao<User> userDao = new GenericDao<>(User.class);

    @Test
    void insertSuccess() {

        User user = userDao.getById(1);

        MealPlan mealPlan = new MealPlan();
        mealPlan.setUser(user);
        mealPlan.setSpoonacularRecipeId(12345);
        mealPlan.setDayOfWeek("Monday");
        mealPlan.setMealType("Dinner");

        Object id = mealPlanDao.insert(mealPlan);

        assertNotNull(id);
    }


    @Test
    void getAllSuccess() {

        List<MealPlan> mealPlans = mealPlanDao.getAll();

        assertTrue(mealPlans.size() > 0);
    }


    @Test
    void updateSuccess() {

        MealPlan mealPlan = mealPlanDao.getById(1);

        mealPlan.setMealType("Lunch");

        mealPlanDao.update(mealPlan);

        MealPlan updatedMealPlan = mealPlanDao.getById(1);

        assertEquals("Lunch", updatedMealPlan.getMealType());
    }


    @Test
    void deleteSuccess() {

        User user = userDao.getById(1);

        MealPlan mealPlan = new MealPlan();
        mealPlan.setUser(user);
        mealPlan.setSpoonacularRecipeId(55555);
        mealPlan.setDayOfWeek("Sunday");
        mealPlan.setMealType("Breakfast");

        int id = (int) mealPlanDao.insert(mealPlan);

        MealPlan insertedMealPlan = mealPlanDao.getById(id);

        mealPlanDao.delete(insertedMealPlan);

        MealPlan deletedMealPlan = mealPlanDao.getById(id);

        assertNull(deletedMealPlan);
    }
}