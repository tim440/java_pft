package ru.rgs.APITests.model.AgentStatement.Create;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class RiskObjectType{

	@SerializedName("isAddressRequred")
	private String isAddressRequred;

	@SerializedName("name")
	private String name;

	@SerializedName("isPayGovernmentRequired")
	private String isPayGovernmentRequired;

	@SerializedName("id")
	private String id;

	@SerializedName("isAddressAvailable")
	private String isAddressAvailable;

	@SerializedName("codeAndName")
	private String codeAndName;

	@SerializedName("validForPolicy")
	private String validForPolicy;

	public String getIsAddressRequred(){
		return isAddressRequred;
	}

	public String getName(){
		return name;
	}

	public String getIsPayGovernmentRequired(){
		return isPayGovernmentRequired;
	}

	public String getId(){
		return id;
	}

	public String getIsAddressAvailable(){
		return isAddressAvailable;
	}

	public String getCodeAndName(){
		return codeAndName;
	}

	public String getValidForPolicy(){
		return validForPolicy;
	}

	@Override
 	public String toString(){
		return 
			"RiskObjectType{" + 
			"isAddressRequred = '" + isAddressRequred + '\'' + 
			",name = '" + name + '\'' + 
			",isPayGovernmentRequired = '" + isPayGovernmentRequired + '\'' + 
			",id = '" + id + '\'' + 
			",isAddressAvailable = '" + isAddressAvailable + '\'' + 
			",codeAndName = '" + codeAndName + '\'' + 
			",validForPolicy = '" + validForPolicy + '\'' + 
			"}";
		}
}