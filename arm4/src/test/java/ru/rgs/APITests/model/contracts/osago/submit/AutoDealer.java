package ru.rgs.APITests.model.contracts.osago.submit;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class AutoDealer{

	@SerializedName("id")
	private String id;

	@SerializedName("codeAndName")
	private String codeAndName;

	public AutoDealer() {
		this.id = "";
		this.codeAndName = "";
	}

	public String getId(){
		return id;
	}

	public String getCodeAndName(){
		return codeAndName;
	}

	@Override
 	public String toString(){
		return 
			"AutoDealer{" + 
			"id = '" + id + '\'' + 
			",codeAndName = '" + codeAndName + '\'' + 
			"}";
		}
}