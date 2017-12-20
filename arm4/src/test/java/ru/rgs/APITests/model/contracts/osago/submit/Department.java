package ru.rgs.APITests.model.contracts.osago.submit;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Department{

	@SerializedName("displayValue")
	private String displayValue;

	@SerializedName("id")
	private String id;

	@SerializedName("bid")
	private String bid;

	public Department() {
		this.displayValue = "";
		this.id = "";
		this.bid = "";
	}

	public String getDisplayValue(){
		return displayValue;
	}

	public String getId(){
		return id;
	}

	public String getBid(){
		return bid;
	}

	@Override
 	public String toString(){
		return 
			"Department{" + 
			"displayValue = '" + displayValue + '\'' + 
			",id = '" + id + '\'' + 
			",bid = '" + bid + '\'' + 
			"}";
		}
}