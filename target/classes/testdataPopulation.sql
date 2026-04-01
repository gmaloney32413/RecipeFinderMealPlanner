use recipeplanner;

SET FOREIGN_KEY_CHECKS = 0;

Truncate table meal_plan;
Truncate table saved_recipes;
Truncate table users;
SET FOREIGN_KEY_CHECKS = 1;

ALTER TABLE users AUTO_INCREMENT = 1;
ALTER TABLE meal_plan AUTO_INCREMENT = 1;
ALTER TABLE saved_recipes AUTO_INCREMENT = 1;

LOCK TABLES `meal_plan` WRITE;
INSERT INTO `meal_plan` VALUES (1,1,716429,'Monday','Dinner'),(2,1,715538,'Tuesday','Dinner'),(3,1,782601,'Wednesday','Lunch'),(4,2,716627,'Monday','Lunch'),(5,3,641803,'Friday','Dinner');
UNLOCK TABLES;

LOCK TABLES `saved_recipes` WRITE;

INSERT INTO `saved_recipes` VALUES (1,1,716429,'Pasta with Garlic, Scallions, Cauliflower & Breadcrumbs','https://img.spoonacular.com/recipes/716429-556x370.jpg','Looks like a good vegetarian dinner','2026-03-26 23:03:34'),(2,1,715538,'Chicken with Garlic Sauce','https://img.spoonacular.com/recipes/715538-556x370.jpg','Try this for meal prep','2026-03-26 23:03:34'),(3,2,716627,'Easy Homemade Rice and Beans','https://img.spoonacular.com/recipes/716627-556x370.jpg','Cheap and healthy','2026-03-26 23:03:34'),(4,3,641803,'Easy Vegetable Fried Rice','https://img.spoonacular.com/recipes/641803-556x370.jpg','Quick lunch option','2026-03-26 23:03:34'),(5,1,782601,'Red Lentil Soup','https://img.spoonacular.com/recipes/782601-556x370.jpg','Healthy soup idea','2026-03-26 23:03:34');

UNLOCK TABLES;

LOCK TABLES `users` WRITE;
INSERT INTO `users` VALUES (1,'gavin','gavin@example.com','password123','2026-03-26 23:03:28'),(2,'testuser','test@example.com','testpass','2026-03-26 23:03:28'),(3,'chefanna','anna@example.com','secretpass','2026-03-26 23:03:28');
UNLOCK TABLES;
