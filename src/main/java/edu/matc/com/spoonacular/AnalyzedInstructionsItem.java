package edu.matc.com.spoonacular;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AnalyzedInstructionsItem{

	@JsonProperty("name")
	private String name;

	@JsonProperty("steps")
	private List<StepsItem> steps;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setSteps(List<StepsItem> steps){
		this.steps = steps;
	}

	public List<StepsItem> getSteps(){
		return steps;
	}

	@Override
 	public String toString(){
		return 
			"AnalyzedInstructionsItem{" + 
			"name = '" + name + '\'' + 
			",steps = '" + steps + '\'' + 
			"}";
		}
}