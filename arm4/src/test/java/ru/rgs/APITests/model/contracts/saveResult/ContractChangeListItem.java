package ru.rgs.APITests.model.contracts.saveResult;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class ContractChangeListItem{

	@SerializedName("premiumProportion")
	private String premiumProportion;

	@SerializedName("changeType")
	private ChangeType changeType;

	@SerializedName("contractId")
	private String contractId;

	@SerializedName("id")
	private String id;

	@SerializedName("sysModifyDate")
	private String sysModifyDate;

	@SerializedName("bid")
	private String bid;

	@SerializedName("contractClassCode")
	private String contractClassCode;

	@SerializedName("user")
	private String user;

	@SerializedName("startDate")
	private String startDate;

	@SerializedName("versionNumber")
	private String versionNumber;

	@SerializedName("createDate")
	private String createDate;

	public String getPremiumProportion(){
		return premiumProportion;
	}

	public ChangeType getChangeType(){
		return changeType;
	}

	public String getContractId(){
		return contractId;
	}

	public String getId(){
		return id;
	}

	public String getSysModifyDate(){
		return sysModifyDate;
	}

	public String getBid(){
		return bid;
	}

	public String getContractClassCode(){
		return contractClassCode;
	}

	public String getUser(){
		return user;
	}

	public String getStartDate(){
		return startDate;
	}

	public String getVersionNumber(){
		return versionNumber;
	}

	public String getCreateDate(){
		return createDate;
	}

	@Override
 	public String toString(){
		return 
			"ContractChangeListItem{" + 
			"premiumProportion = '" + premiumProportion + '\'' + 
			",changeType = '" + changeType + '\'' + 
			",contractId = '" + contractId + '\'' + 
			",id = '" + id + '\'' + 
			",sysModifyDate = '" + sysModifyDate + '\'' + 
			",bid = '" + bid + '\'' + 
			",contractClassCode = '" + contractClassCode + '\'' + 
			",user = '" + user + '\'' + 
			",startDate = '" + startDate + '\'' + 
			",versionNumber = '" + versionNumber + '\'' + 
			",createDate = '" + createDate + '\'' + 
			"}";
		}
}