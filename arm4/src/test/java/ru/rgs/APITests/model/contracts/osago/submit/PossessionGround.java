package ru.rgs.APITests.model.contracts.osago.submit;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class PossessionGround{

	@SerializedName("id")
	private String id;

	public PossessionGround() {
		this.id = "1";
	}

	public String getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"PossessionGround{" + 
			"id = '" + id + '\'' + 
			"}";
		}
}