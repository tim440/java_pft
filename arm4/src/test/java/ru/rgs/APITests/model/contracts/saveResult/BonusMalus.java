package ru.rgs.APITests.model.contracts.saveResult;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class BonusMalus{

	@SerializedName("id")
	private String id;

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