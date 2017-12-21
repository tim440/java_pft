package ru.rgs.APITests.model.contracts.saveResult;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class KladrStreet{

	@SerializedName("zip")
	private String zip;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private String id;

	@SerializedName("type")
	private String type;

	public String getZip(){
		return zip;
	}

	public String getName(){
		return name;
	}

	public String getId(){
		return id;
	}

	public String getType(){
		return type;
	}

	@Override
 	public String toString(){
		return 
			"KladrStreet{" + 
			"zip = '" + zip + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",type = '" + type + '\'' + 
			"}";
		}
}