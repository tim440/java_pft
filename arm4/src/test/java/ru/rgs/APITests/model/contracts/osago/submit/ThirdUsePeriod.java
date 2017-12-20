package ru.rgs.APITests.model.contracts.osago.submit;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ThirdUsePeriod{

	@SerializedName("endDate")
	private Object endDate;

	@SerializedName("id")
	private String id;

	@SerializedName("startDate")
	private Object startDate;

	public ThirdUsePeriod() {
		this.endDate = null;
		this.id = "";
		this.startDate = null;
	}

	public Object getEndDate(){
		return endDate;
	}

	public String getId(){
		return id;
	}

	public Object getStartDate(){
		return startDate;
	}

	@Override
 	public String toString(){
		return 
			"ThirdUsePeriod{" + 
			"endDate = '" + endDate + '\'' + 
			",id = '" + id + '\'' + 
			",startDate = '" + startDate + '\'' + 
			"}";
		}
}