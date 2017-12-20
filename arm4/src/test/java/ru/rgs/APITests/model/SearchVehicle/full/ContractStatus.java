package ru.rgs.APITests.model.SearchVehicle.full;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class ContractStatus{

	@SerializedName("code")
	private String code;

	@SerializedName("sortOrder")
	private String sortOrder;

	@SerializedName("name")
	private String name;

	@SerializedName("isActive")
	private String isActive;

	public String getCode(){
		return code;
	}

	public String getSortOrder(){
		return sortOrder;
	}

	public String getName(){
		return name;
	}

	public String getIsActive(){
		return isActive;
	}

	@Override
 	public String toString(){
		return 
			"ContractStatus{" + 
			"code = '" + code + '\'' + 
			",sortOrder = '" + sortOrder + '\'' + 
			",name = '" + name + '\'' + 
			",isActive = '" + isActive + '\'' + 
			"}";
		}
}