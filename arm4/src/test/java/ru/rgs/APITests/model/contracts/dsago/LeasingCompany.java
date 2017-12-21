package ru.rgs.APITests.model.contracts.dsago;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class LeasingCompany{

	@SerializedName("id")
	private String id;

	@SerializedName("codeAndName")
	private String codeAndName;

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setCodeAndName(String codeAndName){
		this.codeAndName = codeAndName;
	}

	public String getCodeAndName(){
		return codeAndName;
	}

	@Override
 	public String toString(){
		return 
			"LeasingCompany{" + 
			"id = '" + id + '\'' + 
			",codeAndName = '" + codeAndName + '\'' + 
			"}";
		}
}