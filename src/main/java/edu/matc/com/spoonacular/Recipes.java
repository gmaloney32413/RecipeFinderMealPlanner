package edu.matc.com.spoonacular;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Recipes{

	@JsonProperty("results")
	private List<RecipesItem> recipes;

	public void setRecipes(List<RecipesItem> recipes){
		this.recipes = recipes;
	}

	public List<RecipesItem> getRecipes(){
		return recipes;
	}

	@Override
 	public String toString(){
		return 
			"Recipes{" + 
			"recipes = '" + recipes + '\'' + 
			"}";
		}
}