package ru.rgs.APITests.model.contracts.osago.create;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class DrivingLimitationTypeByPersonTypeListItem{

	@SerializedName("personTypeId")
	private String personTypeId;

	@SerializedName("personTypeName")
	private String personTypeName;

	@SerializedName("drLimTypeId")
	private String drLimTypeId;

	@SerializedName("personTypeCode")
	private String personTypeCode;

	@SerializedName("drLimTypeCode")
	private String drLimTypeCode;

	@SerializedName("drLimTypeName")
	private String drLimTypeName;

	public String getPersonTypeId(){
		return personTypeId;
	}

	public String getPersonTypeName(){
		return personTypeName;
	}

	public String getDrLimTypeId(){
		return drLimTypeId;
	}

	public String getPersonTypeCode(){
		return personTypeCode;
	}

	public String getDrLimTypeCode(){
		return drLimTypeCode;
	}

	public String getDrLimTypeName(){
		return drLimTypeName;
	}

	@Override
 	public String toString(){
		return 
			"DrivingLimitationTypeByPersonTypeListItem{" + 
			"personTypeId = '" + personTypeId + '\'' + 
			",personTypeName = '" + personTypeName + '\'' + 
			",drLimTypeId = '" + drLimTypeId + '\'' + 
			",personTypeCode = '" + personTypeCode + '\'' + 
			",drLimTypeCode = '" + drLimTypeCode + '\'' + 
			",drLimTypeName = '" + drLimTypeName + '\'' + 
			"}";
		}
}