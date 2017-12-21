package ru.rgs.APITests.model.contracts.osago.create;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Branch{

	@SerializedName("blankType")
	private BlankType blankType;

	@SerializedName("code")
	private String code;

	@SerializedName("endDate")
	private String endDate;

	@SerializedName("sysSource")
	private String sysSource;

	@SerializedName("parentId")
	private String parentId;

	@SerializedName("countrySubjectId")
	private String countrySubjectId;

	@SerializedName("isIdPregenerated")
	private String isIdPregenerated;

	@SerializedName("displayValue")
	private String displayValue;

	@SerializedName("sysEditor")
	private String sysEditor;

	@SerializedName("name")
	private String name;

	@SerializedName("sysCreator")
	private String sysCreator;

	@SerializedName("id")
	private String id;

	@SerializedName("bid")
	private String bid;

	@SerializedName("startDate")
	private String startDate;

	public BlankType getBlankType(){
		return blankType;
	}

	public String getCode(){
		return code;
	}

	public String getEndDate(){
		return endDate;
	}

	public String getSysSource(){
		return sysSource;
	}

	public String getParentId(){
		return parentId;
	}

	public String getCountrySubjectId(){
		return countrySubjectId;
	}

	public String getIsIdPregenerated(){
		return isIdPregenerated;
	}

	public String getDisplayValue(){
		return displayValue;
	}

	public String getSysEditor(){
		return sysEditor;
	}

	public String getName(){
		return name;
	}

	public String getSysCreator(){
		return sysCreator;
	}

	public String getId(){
		return id;
	}

	public String getBid(){
		return bid;
	}

	public String getStartDate(){
		return startDate;
	}

	@Override
 	public String toString(){
		return 
			"Branch{" + 
			"blankType = '" + blankType + '\'' + 
			",code = '" + code + '\'' + 
			",endDate = '" + endDate + '\'' + 
			",sysSource = '" + sysSource + '\'' + 
			",parentId = '" + parentId + '\'' + 
			",countrySubjectId = '" + countrySubjectId + '\'' + 
			",isIdPregenerated = '" + isIdPregenerated + '\'' + 
			",displayValue = '" + displayValue + '\'' + 
			",sysEditor = '" + sysEditor + '\'' + 
			",name = '" + name + '\'' + 
			",sysCreator = '" + sysCreator + '\'' + 
			",id = '" + id + '\'' + 
			",bid = '" + bid + '\'' + 
			",startDate = '" + startDate + '\'' + 
			"}";
		}
}