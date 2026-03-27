package edu.matc.com.spoonacular;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Us{

	@JsonProperty("amount")
	private Object amount;

	@JsonProperty("unitShort")
	private String unitShort;

	@JsonProperty("unitLong")
	private String unitLong;

	public void setAmount(Object amount){
		this.amount = amount;
	}

	public Object getAmount(){
		return amount;
	}

	public void setUnitShort(String unitShort){
		this.unitShort = unitShort;
	}

	public String getUnitShort(){
		return unitShort;
	}

	public void setUnitLong(String unitLong){
		this.unitLong = unitLong;
	}

	public String getUnitLong(){
		return unitLong;
	}

	@Override
 	public String toString(){
		return 
			"Us{" + 
			"amount = '" + amount + '\'' + 
			",unitShort = '" + unitShort + '\'' + 
			",unitLong = '" + unitLong + '\'' + 
			"}";
		}
}