package ru.rgs.APITests.model.contracts.saveResult;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class FirstUsePeriod{

	@SerializedName("sysCreateDate")
	private String sysCreateDate;

	@SerializedName("periodNumber")
	private String periodNumber;

	@SerializedName("versionEndDate")
	private String versionEndDate;

	@SerializedName("endDate")
	private String endDate;

	@SerializedName("sysSource")
	private String sysSource;

	@SerializedName("sysCreateUser")
	private String sysCreateUser;

	@SerializedName("isIdPregenerated")
	private String isIdPregenerated;

	@SerializedName("masterId")
	private String masterId;

	@SerializedName("sysEditor")
	private String sysEditor;

	@SerializedName("versionStartDate")
	private String versionStartDate;

	@SerializedName("entityChangeId")
	private String entityChangeId;

	@SerializedName("lastModified")
	private String lastModified;

	@SerializedName("sysUser")
	private String sysUser;

	@SerializedName("sysCreator")
	private String sysCreator;

	@SerializedName("id")
	private String id;

	@SerializedName("bid")
	private String bid;

	@SerializedName("startDate")
	private String startDate;

	public String getSysCreateDate(){
		return sysCreateDate;
	}

	public String getPeriodNumber(){
		return periodNumber;
	}

	public String getVersionEndDate(){
		return versionEndDate;
	}

	public String getEndDate(){
		return endDate;
	}

	public String getSysSource(){
		return sysSource;
	}

	public String getSysCreateUser(){
		return sysCreateUser;
	}

	public String getIsIdPregenerated(){
		return isIdPregenerated;
	}

	public String getMasterId(){
		return masterId;
	}

	public String getSysEditor(){
		return sysEditor;
	}

	public String getVersionStartDate(){
		return versionStartDate;
	}

	public String getEntityChangeId(){
		return entityChangeId;
	}

	public String getLastModified(){
		return lastModified;
	}

	public String getSysUser(){
		return sysUser;
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
			"FirstUsePeriod{" + 
			"sysCreateDate = '" + sysCreateDate + '\'' + 
			",periodNumber = '" + periodNumber + '\'' + 
			",versionEndDate = '" + versionEndDate + '\'' + 
			",endDate = '" + endDate + '\'' + 
			",sysSource = '" + sysSource + '\'' + 
			",sysCreateUser = '" + sysCreateUser + '\'' + 
			",isIdPregenerated = '" + isIdPregenerated + '\'' + 
			",masterId = '" + masterId + '\'' + 
			",sysEditor = '" + sysEditor + '\'' + 
			",versionStartDate = '" + versionStartDate + '\'' + 
			",entityChangeId = '" + entityChangeId + '\'' + 
			",lastModified = '" + lastModified + '\'' + 
			",sysUser = '" + sysUser + '\'' + 
			",sysCreator = '" + sysCreator + '\'' + 
			",id = '" + id + '\'' + 
			",bid = '" + bid + '\'' + 
			",startDate = '" + startDate + '\'' + 
			"}";
		}
}