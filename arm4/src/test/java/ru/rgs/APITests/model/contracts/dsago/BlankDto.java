package ru.rgs.APITests.model.contracts.dsago;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

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

	public void setNumber(String number){
		this.number = number;
	}

	public String getNumber(){
		return number;
	}

	public void setSeries(String series){
		this.series = series;
	}

	public String getSeries(){
		return series;
	}

	public void setId(Object id){
		this.id = id;
	}

	public Object getId(){
		return id;
	}

	public void setBlankTypeId(String blankTypeId){
		this.blankTypeId = blankTypeId;
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