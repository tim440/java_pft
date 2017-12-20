package ru.rgs.APITests.model.contracts.osago.submit;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class BlankDto{

	@SerializedName("number")
	private String number;

	@SerializedName("series")
	private String series;

	@SerializedName("id")
	private Object id;

	@SerializedName("blankTypeId")
	private String blankTypeId;

	public BlankDto() {
		this.number = "2000000001";
		this.series = "ЕЕЕ";
		this.id = null;
		this.blankTypeId = "1";
	}

	public String getNumber(){
		return number;
	}

	public String getSeries(){
		return series;
	}

	public Object getId(){
		return id;
	}

	public String getBlankTypeId(){
		return blankTypeId;
	}

	@Override
 	public String toString(){
		return 
			"BlankDto{" + 
			"number = '" + number + '\'' + 
			",series = '" + series + '\'' + 
			",id = '" + id + '\'' + 
			",blankTypeId = '" + blankTypeId + '\'' + 
			"}";
		}
}