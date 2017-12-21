package ru.rgs.APITests.model.SearchContract.search;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ConstraintsItem{

	@SerializedName("equalsIgnoreCase")
	private EqualsIgnoreCase equalsIgnoreCase;

	public ConstraintsItem(String property, String value) {
		this.equalsIgnoreCase = new EqualsIgnoreCase(property, value);
	}

	public EqualsIgnoreCase getEqualsIgnoreCase(){
		return equalsIgnoreCase;
	}

	@Override
 	public String toString(){
		return 
			"ConstraintsItem{" + 
			"equalsIgnoreCase = '" + equalsIgnoreCase + '\'' + 
			"}";
		}
}