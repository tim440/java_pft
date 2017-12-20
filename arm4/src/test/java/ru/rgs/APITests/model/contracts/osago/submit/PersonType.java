package ru.rgs.APITests.model.contracts.osago.submit;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class PersonType{

	@SerializedName("code")
	private String code;

	@SerializedName("name")
	private String name;

	public PersonType(String code, String name) {
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
			"PersonType{" + 
			"code = '" + code + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}