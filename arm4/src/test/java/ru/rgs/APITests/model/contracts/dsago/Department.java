package ru.rgs.APITests.model.contracts.dsago;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Department{

	@SerializedName("displayValue")
	private String displayValue;

	@SerializedName("id")
	private String id;

	@SerializedName("bid")
	private String bid;

	public void setDisplayValue(String displayValue){
		this.displayValue = displayValue;
	}

	public String getDisplayValue(){
		return displayValue;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setBid(String bid){
		this.bid = bid;
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