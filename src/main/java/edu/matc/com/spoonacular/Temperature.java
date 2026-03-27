package edu.matc.com.spoonacular;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Temperature{

	@JsonProperty("number")
	private Object number;

	@JsonProperty("unit")
	private String unit;

	public void setNumber(Object number){
		this.number = number;
	}

	public Object getNumber(){
		return number;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public String getUnit(){
		return unit;
	}

	@Override
 	public String toString(){
		return 
			"Temperature{" + 
			"number = '" + number + '\'' + 
			",unit = '" + unit + '\'' + 
			"}";
		}
}