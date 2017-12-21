package ru.rgs.APITests.model.contracts.dsago;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class HoldingCompany{

	@SerializedName("displayName")
	private String displayName;

	public void setDisplayName(String displayName){
		this.displayName = displayName;
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