package ru.rgs.APITests.model.contracts.osago.submit;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class FirstUsePeriod{

	@SerializedName("endDate")
	private String endDate;

	@SerializedName("id")
	private String id;

	@SerializedName("startDate")
	private String startDate;

	public FirstUsePeriod(String endDate, String startDate) {
		this.endDate = endDate;
		this.id = "";
		this.startDate = startDate;
	}

	public String getEndDate(){
		return endDate;
	}

	public String getId(){
		return id;
	}

	public String getStartDate(){
		return startDate;
	}

	@Override
 	public String toString(){
		return 
			"FirstUsePeriod{" + 
			"endDate = '" + endDate + '\'' + 
			",id = '" + id + '\'' + 
			",startDate = '" + startDate + '\'' + 
			"}";
		}
}