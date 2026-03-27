package edu.matc.com.spoonacular;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IngredientsItem{

	@JsonProperty("image")
	private String image;

	@JsonProperty("localizedName")
	private String localizedName;

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private int id;

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setLocalizedName(String localizedName){
		this.localizedName = localizedName;
	}

	public String getLocalizedName(){
		return localizedName;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"IngredientsItem{" + 
			"image = '" + image + '\'' + 
			",localizedName = '" + localizedName + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}