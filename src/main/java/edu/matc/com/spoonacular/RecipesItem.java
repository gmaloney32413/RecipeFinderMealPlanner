package edu.matc.com.spoonacular;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RecipesItem{

	@JsonProperty("instructions")
	private String instructions;

	@JsonProperty("sustainable")
	private boolean sustainable;

	@JsonProperty("analyzedInstructions")
	private List<AnalyzedInstructionsItem> analyzedInstructions;

	@JsonProperty("glutenFree")
	private boolean glutenFree;

	@JsonProperty("veryPopular")
	private boolean veryPopular;

	@JsonProperty("language")
	private String language;

	@JsonProperty("title")
	private String title;

	@JsonProperty("healthScore")
	private Object healthScore;

	@JsonProperty("diets")
	private List<Object> diets;

	@JsonProperty("aggregateLikes")
	private int aggregateLikes;

	@JsonProperty("readyInMinutes")
	private int readyInMinutes;

	@JsonProperty("sourceUrl")
	private String sourceUrl;

	@JsonProperty("creditsText")
	private String creditsText;

	@JsonProperty("dairyFree")
	private boolean dairyFree;

	@JsonProperty("servings")
	private int servings;

	@JsonProperty("vegetarian")
	private boolean vegetarian;

	@JsonProperty("id")
	private int id;

	@JsonProperty("preparationMinutes")
	private Object preparationMinutes;

	@JsonProperty("imageType")
	private String imageType;

	@JsonProperty("summary")
	private String summary;

	@JsonProperty("image")
	private String image;

	@JsonProperty("cookingMinutes")
	private Object cookingMinutes;

	@JsonProperty("veryHealthy")
	private boolean veryHealthy;

	@JsonProperty("vegan")
	private boolean vegan;

	@JsonProperty("cheap")
	private boolean cheap;

	@JsonProperty("extendedIngredients")
	private List<ExtendedIngredientsItem> extendedIngredients;

	@JsonProperty("dishTypes")
	private List<String> dishTypes;

	@JsonProperty("gaps")
	private String gaps;

	@JsonProperty("cuisines")
	private List<Object> cuisines;

	@JsonProperty("lowFodmap")
	private boolean lowFodmap;

	@JsonProperty("license")
	private String license;

	@JsonProperty("weightWatcherSmartPoints")
	private int weightWatcherSmartPoints;

	@JsonProperty("occasions")
	private List<Object> occasions;

	@JsonProperty("pricePerServing")
	private Object pricePerServing;

	@JsonProperty("spoonacularScore")
	private Object spoonacularScore;

	@JsonProperty("sourceName")
	private String sourceName;

	@JsonProperty("originalId")
	private Object originalId;

	@JsonProperty("spoonacularSourceUrl")
	private String spoonacularSourceUrl;

	public void setInstructions(String instructions){
		this.instructions = instructions;
	}

	public String getInstructions(){
		return instructions;
	}

	public void setSustainable(boolean sustainable){
		this.sustainable = sustainable;
	}

	public boolean isSustainable(){
		return sustainable;
	}

	public void setAnalyzedInstructions(List<AnalyzedInstructionsItem> analyzedInstructions){
		this.analyzedInstructions = analyzedInstructions;
	}

	public List<AnalyzedInstructionsItem> getAnalyzedInstructions(){
		return analyzedInstructions;
	}

	public void setGlutenFree(boolean glutenFree){
		this.glutenFree = glutenFree;
	}

	public boolean isGlutenFree(){
		return glutenFree;
	}

	public void setVeryPopular(boolean veryPopular){
		this.veryPopular = veryPopular;
	}

	public boolean isVeryPopular(){
		return veryPopular;
	}

	public void setLanguage(String language){
		this.language = language;
	}

	public String getLanguage(){
		return language;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setHealthScore(Object healthScore){
		this.healthScore = healthScore;
	}

	public Object getHealthScore(){
		return healthScore;
	}

	public void setDiets(List<Object> diets){
		this.diets = diets;
	}

	public List<Object> getDiets(){
		return diets;
	}

	public void setAggregateLikes(int aggregateLikes){
		this.aggregateLikes = aggregateLikes;
	}

	public int getAggregateLikes(){
		return aggregateLikes;
	}

	public void setReadyInMinutes(int readyInMinutes){
		this.readyInMinutes = readyInMinutes;
	}

	public int getReadyInMinutes(){
		return readyInMinutes;
	}

	public void setSourceUrl(String sourceUrl){
		this.sourceUrl = sourceUrl;
	}

	public String getSourceUrl(){
		return sourceUrl;
	}

	public void setCreditsText(String creditsText){
		this.creditsText = creditsText;
	}

	public String getCreditsText(){
		return creditsText;
	}

	public void setDairyFree(boolean dairyFree){
		this.dairyFree = dairyFree;
	}

	public boolean isDairyFree(){
		return dairyFree;
	}

	public void setServings(int servings){
		this.servings = servings;
	}

	public int getServings(){
		return servings;
	}

	public void setVegetarian(boolean vegetarian){
		this.vegetarian = vegetarian;
	}

	public boolean isVegetarian(){
		return vegetarian;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setPreparationMinutes(Object preparationMinutes){
		this.preparationMinutes = preparationMinutes;
	}

	public Object getPreparationMinutes(){
		return preparationMinutes;
	}

	public void setImageType(String imageType){
		this.imageType = imageType;
	}

	public String getImageType(){
		return imageType;
	}

	public void setSummary(String summary){
		this.summary = summary;
	}

	public String getSummary(){
		return summary;
	}

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setCookingMinutes(Object cookingMinutes){
		this.cookingMinutes = cookingMinutes;
	}

	public Object getCookingMinutes(){
		return cookingMinutes;
	}

	public void setVeryHealthy(boolean veryHealthy){
		this.veryHealthy = veryHealthy;
	}

	public boolean isVeryHealthy(){
		return veryHealthy;
	}

	public void setVegan(boolean vegan){
		this.vegan = vegan;
	}

	public boolean isVegan(){
		return vegan;
	}

	public void setCheap(boolean cheap){
		this.cheap = cheap;
	}

	public boolean isCheap(){
		return cheap;
	}

	public void setExtendedIngredients(List<ExtendedIngredientsItem> extendedIngredients){
		this.extendedIngredients = extendedIngredients;
	}

	public List<ExtendedIngredientsItem> getExtendedIngredients(){
		return extendedIngredients;
	}

	public void setDishTypes(List<String> dishTypes){
		this.dishTypes = dishTypes;
	}

	public List<String> getDishTypes(){
		return dishTypes;
	}

	public void setGaps(String gaps){
		this.gaps = gaps;
	}

	public String getGaps(){
		return gaps;
	}

	public void setCuisines(List<Object> cuisines){
		this.cuisines = cuisines;
	}

	public List<Object> getCuisines(){
		return cuisines;
	}

	public void setLowFodmap(boolean lowFodmap){
		this.lowFodmap = lowFodmap;
	}

	public boolean isLowFodmap(){
		return lowFodmap;
	}

	public void setLicense(String license){
		this.license = license;
	}

	public String getLicense(){
		return license;
	}

	public void setWeightWatcherSmartPoints(int weightWatcherSmartPoints){
		this.weightWatcherSmartPoints = weightWatcherSmartPoints;
	}

	public int getWeightWatcherSmartPoints(){
		return weightWatcherSmartPoints;
	}

	public void setOccasions(List<Object> occasions){
		this.occasions = occasions;
	}

	public List<Object> getOccasions(){
		return occasions;
	}

	public void setPricePerServing(Object pricePerServing){
		this.pricePerServing = pricePerServing;
	}

	public Object getPricePerServing(){
		return pricePerServing;
	}

	public void setSpoonacularScore(Object spoonacularScore){
		this.spoonacularScore = spoonacularScore;
	}

	public Object getSpoonacularScore(){
		return spoonacularScore;
	}

	public void setSourceName(String sourceName){
		this.sourceName = sourceName;
	}

	public String getSourceName(){
		return sourceName;
	}

	public void setOriginalId(Object originalId){
		this.originalId = originalId;
	}

	public Object getOriginalId(){
		return originalId;
	}

	public void setSpoonacularSourceUrl(String spoonacularSourceUrl){
		this.spoonacularSourceUrl = spoonacularSourceUrl;
	}

	public String getSpoonacularSourceUrl(){
		return spoonacularSourceUrl;
	}

	@Override
 	public String toString(){
		return 
			"RecipesItem{" + 
			"instructions = '" + instructions + '\'' + 
			",sustainable = '" + sustainable + '\'' + 
			",analyzedInstructions = '" + analyzedInstructions + '\'' + 
			",glutenFree = '" + glutenFree + '\'' + 
			",veryPopular = '" + veryPopular + '\'' + 
			",language = '" + language + '\'' + 
			",title = '" + title + '\'' + 
			",healthScore = '" + healthScore + '\'' + 
			",diets = '" + diets + '\'' + 
			",aggregateLikes = '" + aggregateLikes + '\'' + 
			",readyInMinutes = '" + readyInMinutes + '\'' + 
			",sourceUrl = '" + sourceUrl + '\'' + 
			",creditsText = '" + creditsText + '\'' + 
			",dairyFree = '" + dairyFree + '\'' + 
			",servings = '" + servings + '\'' + 
			",vegetarian = '" + vegetarian + '\'' + 
			",id = '" + id + '\'' + 
			",preparationMinutes = '" + preparationMinutes + '\'' + 
			",imageType = '" + imageType + '\'' + 
			",summary = '" + summary + '\'' + 
			",image = '" + image + '\'' + 
			",cookingMinutes = '" + cookingMinutes + '\'' + 
			",veryHealthy = '" + veryHealthy + '\'' + 
			",vegan = '" + vegan + '\'' + 
			",cheap = '" + cheap + '\'' + 
			",extendedIngredients = '" + extendedIngredients + '\'' + 
			",dishTypes = '" + dishTypes + '\'' + 
			",gaps = '" + gaps + '\'' + 
			",cuisines = '" + cuisines + '\'' + 
			",lowFodmap = '" + lowFodmap + '\'' + 
			",license = '" + license + '\'' + 
			",weightWatcherSmartPoints = '" + weightWatcherSmartPoints + '\'' + 
			",occasions = '" + occasions + '\'' + 
			",pricePerServing = '" + pricePerServing + '\'' + 
			",spoonacularScore = '" + spoonacularScore + '\'' + 
			",sourceName = '" + sourceName + '\'' + 
			",originalId = '" + originalId + '\'' + 
			",spoonacularSourceUrl = '" + spoonacularSourceUrl + '\'' + 
			"}";
		}
}