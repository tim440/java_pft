package ru.rgs.APITests.model.contracts.dsago;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class DrivingLimitationType{

	@SerializedName("code")
	private String code;

	@SerializedName("id")
	private String id;

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public void setId(String id){
		this.id = id;
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