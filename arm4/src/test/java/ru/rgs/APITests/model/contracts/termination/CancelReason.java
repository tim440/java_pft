package ru.rgs.APITests.model.contracts.termination;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class CancelReason{

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private String id;

	public CancelReason(String id, String name) {
		this.name = name;
		this.id = id;
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
			"CancelReason{" + 
			"name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}