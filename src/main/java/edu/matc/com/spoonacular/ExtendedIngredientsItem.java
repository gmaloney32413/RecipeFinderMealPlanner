package edu.matc.com.spoonacular;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ExtendedIngredientsItem{

	@JsonProperty("originalName")
	private String originalName;

	@JsonProperty("image")
	private String image;

	@JsonProperty("amount")
	private Object amount;

	@JsonProperty("unit")
	private String unit;

	@JsonProperty("measures")
	private Measures measures;

	@JsonProperty("nameClean")
	private String nameClean;

	@JsonProperty("original")
	private String original;

	@JsonProperty("meta")
	private List<Object> meta;

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private int id;

	@JsonProperty("aisle")
	private String aisle;

	@JsonProperty("consistency")
	private String consistency;

	public void setOriginalName(String originalName){
		this.originalName = originalName;
	}

	public String getOriginalName(){
		return originalName;
	}

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setAmount(Object amount){
		this.amount = amount;
	}

	public Object getAmount(){
		return amount;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public String getUnit(){
		return unit;
	}

	public void setMeasures(Measures measures){
		this.measures = measures;
	}

	public Measures getMeasures(){
		return measures;
	}

	public void setNameClean(String nameClean){
		this.nameClean = nameClean;
	}

	public String getNameClean(){
		return nameClean;
	}

	public void setOriginal(String original){
		this.original = original;
	}

	public String getOriginal(){
		return original;
	}

	public void setMeta(List<Object> meta){
		this.meta = meta;
	}

	public List<Object> getMeta(){
		return meta;
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

	public void setAisle(String aisle){
		this.aisle = aisle;
	}

	public String getAisle(){
		return aisle;
	}

	public void setConsistency(String consistency){
		this.consistency = consistency;
	}

	public String getConsistency(){
		return consistency;
	}

	@Override
 	public String toString(){
		return 
			"ExtendedIngredientsItem{" + 
			"originalName = '" + originalName + '\'' + 
			",image = '" + image + '\'' + 
			",amount = '" + amount + '\'' + 
			",unit = '" + unit + '\'' + 
			",measures = '" + measures + '\'' + 
			",nameClean = '" + nameClean + '\'' + 
			",original = '" + original + '\'' + 
			",meta = '" + meta + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",aisle = '" + aisle + '\'' + 
			",consistency = '" + consistency + '\'' + 
			"}";
		}
}