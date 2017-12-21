package ru.rgs.APITests.model.SearchInsurer.InsurerFull;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class AddressType{

	@SerializedName("code")
	private String code;

	@SerializedName("sortOrder")
	private String sortOrder;

	@SerializedName("name")
	private String name;

	public String getCode(){
		return code;
	}

	public String getSortOrder(){
		return sortOrder;
	}

	public String getName(){
		return name;
	}

	@Override
 	public String toString(){
		return 
			"AddressType{" + 
			"code = '" + code + '\'' + 
			",sortOrder = '" + sortOrder + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}