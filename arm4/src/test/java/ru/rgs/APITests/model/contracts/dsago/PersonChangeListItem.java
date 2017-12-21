package ru.rgs.APITests.model.contracts.dsago;

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

	public void setIsCanceled(String isCanceled){
		this.isCanceled = isCanceled;
	}

	public String getIsCanceled(){
		return isCanceled;
	}

	public void setIsNewHistory(String isNewHistory){
		this.isNewHistory = isNewHistory;
	}

	public String getIsNewHistory(){
		return isNewHistory;
	}

	public void setEndDate(String endDate){
		this.endDate = endDate;
	}

	public String getEndDate(){
		return endDate;
	}

	public void setDisplayName(String displayName){
		this.displayName = displayName;
	}

	public String getDisplayName(){
		return displayName;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setSysUser(String sysUser){
		this.sysUser = sysUser;
	}

	public String getSysUser(){
		return sysUser;
	}

	public void setBid(String bid){
		this.bid = bid;
	}

	public String getBid(){
		return bid;
	}

	public void setSubjectId(String subjectId){
		this.subjectId = subjectId;
	}

	public String getSubjectId(){
		return subjectId;
	}

	public void setStartDate(String startDate){
		this.startDate = startDate;
	}

	public String getStartDate(){
		return startDate;
	}

	public void setVersionNumber(String versionNumber){
		this.versionNumber = versionNumber;
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