package ru.rgs.APITests.model.SearchInsurer.Insurer;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class InsurerFound {

	@SerializedName("sysCreateDate")
	private String sysCreateDate;

	@SerializedName("docSeries")
	private String docSeries;

	@SerializedName("personTypeId")
	private String personTypeId;

	@SerializedName("personTypeName")
	private String personTypeName;

	@SerializedName("haveProfile")
	private String haveProfile;

	@SerializedName("docNumber")
	private String docNumber;

	@SerializedName("displayName")
	private String displayName;

	@SerializedName("personTypeCode")
	private String personTypeCode;

	@SerializedName("topBranchName")
	private String topBranchName;

	@SerializedName("branchName")
	private String branchName;

	@SerializedName("birthDate")
	private String birthDate;

	@SerializedName("docTypeName")
	private String docTypeName;

	@SerializedName("sysEditor")
	private String sysEditor;

	@SerializedName("id")
	private String id;

	@SerializedName("riskLevelName")
	private String riskLevelName;

	@SerializedName("vipCode")
	private String vipCode;

	public String getSysCreateDate(){
		return sysCreateDate;
	}

	public String getDocSeries(){
		return docSeries;
	}

	public String getPersonTypeId(){
		return personTypeId;
	}

	public String getPersonTypeName(){
		return personTypeName;
	}

	public String getHaveProfile(){
		return haveProfile;
	}

	public String getDocNumber(){
		return docNumber;
	}

	public String getDisplayName(){
		return displayName;
	}

	public String getPersonTypeCode(){
		return personTypeCode;
	}

	public String getTopBranchName(){
		return topBranchName;
	}

	public String getBranchName(){
		return branchName;
	}

	public String getBirthDate(){
		return birthDate;
	}

	public String getDocTypeName(){
		return docTypeName;
	}

	public String getSysEditor(){
		return sysEditor;
	}

	public String getId(){
		return id;
	}

	public String getRiskLevelName(){
		return riskLevelName;
	}

	public String getVipCode(){
		return vipCode;
	}

	@Override
 	public String toString(){
		return 
			"InsurerFound{" +
			"sysCreateDate = '" + sysCreateDate + '\'' + 
			",docSeries = '" + docSeries + '\'' + 
			",personTypeId = '" + personTypeId + '\'' + 
			",personTypeName = '" + personTypeName + '\'' + 
			",haveProfile = '" + haveProfile + '\'' + 
			",docNumber = '" + docNumber + '\'' + 
			",displayName = '" + displayName + '\'' + 
			",personTypeCode = '" + personTypeCode + '\'' + 
			",topBranchName = '" + topBranchName + '\'' + 
			",branchName = '" + branchName + '\'' + 
			",birthDate = '" + birthDate + '\'' + 
			",docTypeName = '" + docTypeName + '\'' + 
			",sysEditor = '" + sysEditor + '\'' + 
			",id = '" + id + '\'' + 
			",riskLevelName = '" + riskLevelName + '\'' + 
			",vipCode = '" + vipCode + '\'' + 
			"}";
		}
}