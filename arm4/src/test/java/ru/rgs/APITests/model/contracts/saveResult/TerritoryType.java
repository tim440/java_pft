package ru.rgs.APITests.model.contracts.saveResult;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class TerritoryType{

	@SerializedName("code")
	private String code;

	@SerializedName("name")
	private String name;

	@SerializedName("objectLevel")
	private String objectLevel;

	@SerializedName("id")
	private String id;

	@SerializedName("shortName")
	private String shortName;

	public String getCode(){
		return code;
	}

	public String getName(){
		return name;
	}

	public String getObjectLevel(){
		return objectLevel;
	}

	public String getId(){
		return id;
	}

	public String getShortName(){
		return shortName;
	}

	@Override
 	public String toString(){
		return 
			"TerritoryType{" + 
			"code = '" + code + '\'' + 
			",name = '" + name + '\'' + 
			",objectLevel = '" + objectLevel + '\'' + 
			",id = '" + id + '\'' + 
			",shortName = '" + shortName + '\'' + 
			"}";
		}
}