package ru.rgs.APITests.model.contracts.saveResult;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class ChangeType{

	@SerializedName("code")
	private String code;

	@SerializedName("name")
	private String name;

	@SerializedName("codeAndName")
	private String codeAndName;

	public String getCode(){
		return code;
	}

	public String getName(){
		return name;
	}

	public String getCodeAndName(){
		return codeAndName;
	}

	@Override
 	public String toString(){
		return 
			"ChangeType{" + 
			"code = '" + code + '\'' + 
			",name = '" + name + '\'' + 
			",codeAndName = '" + codeAndName + '\'' + 
			"}";
		}
}