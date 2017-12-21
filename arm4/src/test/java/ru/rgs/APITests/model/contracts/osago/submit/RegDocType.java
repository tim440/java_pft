package ru.rgs.APITests.model.contracts.osago.submit;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class RegDocType{

	@SerializedName("id")
	private String id;

	public RegDocType() {
		this.id = "1";
	}

	public String getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"RegDocType{" + 
			"id = '" + id + '\'' + 
			"}";
		}
}