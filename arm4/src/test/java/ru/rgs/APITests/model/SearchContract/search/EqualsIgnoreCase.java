package ru.rgs.APITests.model.SearchContract.search;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class EqualsIgnoreCase{

	@SerializedName("property")
	private String property;

	@SerializedName("value")
	private String value;

	public EqualsIgnoreCase(String property, String value) {
		this.property = property;
		this.value = value;
	}

	public String getProperty(){
		return property;
	}

	public String getValue(){
		return value;
	}

	@Override
 	public String toString(){
		return 
			"EqualsIgnoreCase{" + 
			"property = '" + property + '\'' + 
			",value = '" + value + '\'' + 
			"}";
		}
}