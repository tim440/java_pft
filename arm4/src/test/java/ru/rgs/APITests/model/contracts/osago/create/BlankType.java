package ru.rgs.APITests.model.contracts.osago.create;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class BlankType{

	@SerializedName("sortOrder")
	private String sortOrder;

	public String getSortOrder(){
		return sortOrder;
	}

	@Override
 	public String toString(){
		return 
			"BlankType{" + 
			"sortOrder = '" + sortOrder + '\'' + 
			"}";
		}
}