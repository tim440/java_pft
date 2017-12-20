package ru.rgs.APITests.model.contracts.osago.submit;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class AgentInsuranceCompany{

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private String id;

	public AgentInsuranceCompany() {
		this.name = "";
		this.id = "";
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
			"AgentInsuranceCompany{" + 
			"name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}