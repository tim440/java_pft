package ru.rgs.APITests.model.contracts.saveResult;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class PersonChangeListItem{

	@SerializedName("isCanceled")
	private String isCanceled;

	@SerializedName("isNewHistory")
	private String isNewHistory;

	@SerializedName("endDate")
	private String endDate;

	@SerializedName("displayName")
	private String displayName;

	@SerializedName("id")
	private String id;

	@SerializedName("sysUser")
	private String sysUser;

	@SerializedName("bid")
	private String bid;

	@SerializedName("subjectId")
	private String subjectId;

	@SerializedName("startDate")
	private String startDate;

	@SerializedName("versionNumber")
	private String versionNumber;

	public String getIsCanceled(){
		return isCanceled;
	}

	public String getIsNewHistory(){
		return isNewHistory;
	}

	public String getEndDate(){
		return endDate;
	}

	public String getDisplayName(){
		return displayName;
	}

	public String getId(){
		return id;
	}

	public String getSysUser(){
		return sysUser;
	}

	public String getBid(){
		return bid;
	}

	public String getSubjectId(){
		return subjectId;
	}

	public String getStartDate(){
		return startDate;
	}

	public String getVersionNumber(){
		return versionNumber;
	}

	@Override
 	public String toString(){
		return 
			"PersonChangeListItem{" + 
			"isCanceled = '" + isCanceled + '\'' + 
			",isNewHistory = '" + isNewHistory + '\'' + 
			",endDate = '" + endDate + '\'' + 
			",displayName = '" + displayName + '\'' + 
			",id = '" + id + '\'' + 
			",sysUser = '" + sysUser + '\'' + 
			",bid = '" + bid + '\'' + 
			",subjectId = '" + subjectId + '\'' + 
			",startDate = '" + startDate + '\'' + 
			",versionNumber = '" + versionNumber + '\'' + 
			"}";
		}
}