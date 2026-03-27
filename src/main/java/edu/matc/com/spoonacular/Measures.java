package edu.matc.com.spoonacular;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Measures{

	@JsonProperty("metric")
	private Metric metric;

	@JsonProperty("us")
	private Us us;

	public void setMetric(Metric metric){
		this.metric = metric;
	}

	public Metric getMetric(){
		return metric;
	}

	public void setUs(Us us){
		this.us = us;
	}

	public Us getUs(){
		return us;
	}

	@Override
 	public String toString(){
		return 
			"Measures{" + 
			"metric = '" + metric + '\'' + 
			",us = '" + us + '\'' + 
			"}";
		}
}