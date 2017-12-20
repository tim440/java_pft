package ru.rgs.APITests.model.contracts.termination;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ChangeType{

	@SerializedName("code")
	private String code;

	@SerializedName("name")
	private String name;

	public ChangeType(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public String getCode(){
		return code;
	}

	public String getName(){
		return name;
	}

	@Override
 	public String toString(){
		return 
			"ChangeType{" + 
			"code = '" + code + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}