package ru.rgs.APITests.model.contracts.osago.submit;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class CreationType{

	@SerializedName("code")
	private String code;

	public CreationType() {
		this.code = "";
	}

	public String getCode(){
		return code;
	}

	@Override
 	public String toString(){
		return 
			"CreationType{" + 
			"code = '" + code + '\'' + 
			"}";
		}
}