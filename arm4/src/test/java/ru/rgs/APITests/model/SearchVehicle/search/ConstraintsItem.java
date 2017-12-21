package ru.rgs.APITests.model.SearchVehicle.search;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ConstraintsItem{

	@SerializedName("simple")
	private Simple simple;

	public ConstraintsItem(String property, String value, String op) {
		this.simple = new Simple(property, value, op);
	}

	public Simple getSimple(){
		return simple;
	}

	@Override
 	public String toString(){
		return 
			"ConstraintsItem{" + 
			"simple = '" + simple + '\'' + 
			"}";
		}
}