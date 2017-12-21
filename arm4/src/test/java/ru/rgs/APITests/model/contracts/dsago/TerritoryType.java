package ru.rgs.APITests.model.contracts.dsago;

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

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setObjectLevel(String objectLevel){
		this.objectLevel = objectLevel;
	}

	public String getObjectLevel(){
		return objectLevel;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setShortName(String shortName){
		this.shortName = shortName;
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