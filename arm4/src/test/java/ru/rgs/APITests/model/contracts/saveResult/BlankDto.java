package ru.rgs.APITests.model.contracts.saveResult;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class BlankDto{

	@SerializedName("number")
	private String number;

	@SerializedName("sysEditor")
	private String sysEditor;

	@SerializedName("series")
	private String series;

	@SerializedName("blankTypeCode")
	private String blankTypeCode;

	@SerializedName("id")
	private String id;

	@SerializedName("blankTypeName")
	private String blankTypeName;

	@SerializedName("blankTypeId")
	private String blankTypeId;

	public String getNumber(){
		return number;
	}

	public String getSysEditor(){
		return sysEditor;
	}

	public String getSeries(){
		return series;
	}

	public String getBlankTypeCode(){
		return blankTypeCode;
	}

	public String getId(){
		return id;
	}

	public String getBlankTypeName(){
		return blankTypeName;
	}

	public String getBlankTypeId(){
		return blankTypeId;
	}

	@Override
 	public String toString(){
		return 
			"BlankDto{" + 
			"number = '" + number + '\'' + 
			",sysEditor = '" + sysEditor + '\'' + 
			",series = '" + series + '\'' + 
			",blankTypeCode = '" + blankTypeCode + '\'' + 
			",id = '" + id + '\'' + 
			",blankTypeName = '" + blankTypeName + '\'' + 
			",blankTypeId = '" + blankTypeId + '\'' + 
			"}";
		}
}