package ru.rgs.APITests.model.contracts.osago.submit;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class BonusMalus{

	@SerializedName("id")
	private String id;

	public BonusMalus(String id) {
		this.id = id;
	}

    public String getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"BonusMalus{" + 
			"id = '" + id + '\'' + 
			"}";
		}
}