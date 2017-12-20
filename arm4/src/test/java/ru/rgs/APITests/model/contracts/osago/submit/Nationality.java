package ru.rgs.APITests.model.contracts.osago.submit;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Nationality{

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private String id;

	public Nationality() {
		this.name = "Российская Федерация";
		this.id = "643";
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
			"Nationality{" + 
			"name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}