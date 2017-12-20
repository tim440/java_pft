package ru.rgs.APITests.model.SearchInsurer.Request;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ConstraintsItem{

	@SerializedName("equalsIgnoreCase")
	private EqualsIgnoreCase equalsIgnoreCase;

	public ConstraintsItem(EqualsIgnoreCase equalsIgnoreCase) {
		this.equalsIgnoreCase = equalsIgnoreCase;
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