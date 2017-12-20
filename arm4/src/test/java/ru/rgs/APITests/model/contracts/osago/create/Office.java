package ru.rgs.APITests.model.contracts.osago.create;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Office{

	@SerializedName("address")
	private String address;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private String id;

	public String getAddress(){
		return address;
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
			"Office{" + 
			"address = '" + address + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}