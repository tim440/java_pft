package ru.rgs.APITests.model.contracts.osago.submit;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Project{

	@SerializedName("code")
	private String code;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private String id;

	public Project() {
		this.code = "";
		this.name = "";
		this.id = "";
	}

	public String getCode(){
		return code;
	}

	public String getName(){
		return name;
	}

	public String getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"Project{" + 
			"code = '" + code + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}