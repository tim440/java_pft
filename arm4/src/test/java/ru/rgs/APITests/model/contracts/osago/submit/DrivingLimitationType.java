package ru.rgs.APITests.model.contracts.osago.submit;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class DrivingLimitationType{

	@SerializedName("code")
	private String code;

	@SerializedName("id")
	private String id;

	public DrivingLimitationType() {
		this.code = "0";
		this.id = "0";
	}

	public String getCode(){
		return code;
	}

	public String getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"DrivingLimitationType{" + 
			"code = '" + code + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}