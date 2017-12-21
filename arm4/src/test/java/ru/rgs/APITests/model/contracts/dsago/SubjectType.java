package ru.rgs.APITests.model.contracts.dsago;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class SubjectType{

	@SerializedName("code")
	private String code;

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	@Override
 	public String toString(){
		return 
			"SubjectType{" + 
			"code = '" + code + '\'' + 
			"}";
		}
}