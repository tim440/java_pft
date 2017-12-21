package ru.rgs.APITests.model.contracts.dsago;

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

	public void setZip(String zip){
		this.zip = zip;
	}

	public String getZip(){
		return zip;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setType(String type){
		this.type = type;
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