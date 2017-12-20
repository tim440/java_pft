package ru.rgs.APITests.model.contracts.osago.submit;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class HoldingCompany{

	@SerializedName("displayName")
	private String displayName;

	public HoldingCompany() {
		this.displayName = "";
	}

	public String getDisplayName(){
		return displayName;
	}

	@Override
 	public String toString(){
		return 
			"HoldingCompany{" + 
			"displayName = '" + displayName + '\'' + 
			"}";
		}
}