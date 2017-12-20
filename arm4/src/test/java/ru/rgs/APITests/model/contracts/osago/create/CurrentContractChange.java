package ru.rgs.APITests.model.contracts.osago.create;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class CurrentContractChange{

	@SerializedName("premiumProportion")
	private String premiumProportion;

	@SerializedName("changeType")
	private ChangeType changeType;

	@SerializedName("sysModifyDate")
	private String sysModifyDate;

	@SerializedName("bid")
	private String bid;

	@SerializedName("cancelReason")
	private CancelReason cancelReason;

	@SerializedName("contractClassCode")
	private String contractClassCode;

	@SerializedName("contractCancel")
	private String contractCancel;

	@SerializedName("changeTypeList")
	private List<ChangeTypeListItem> changeTypeList;

	public String getPremiumProportion(){
		return premiumProportion;
	}

	public ChangeType getChangeType(){
		return changeType;
	}

	public String getSysModifyDate(){
		return sysModifyDate;
	}

	public String getBid(){
		return bid;
	}

	public CancelReason getCancelReason(){
		return cancelReason;
	}

	public String getContractClassCode(){
		return contractClassCode;
	}

	public String getContractCancel(){
		return contractCancel;
	}

	public List<ChangeTypeListItem> getChangeTypeList(){
		return changeTypeList;
	}

	@Override
 	public String toString(){
		return 
			"CurrentContractChange{" + 
			"premiumProportion = '" + premiumProportion + '\'' + 
			",changeType = '" + changeType + '\'' + 
			",sysModifyDate = '" + sysModifyDate + '\'' + 
			",bid = '" + bid + '\'' + 
			",cancelReason = '" + cancelReason + '\'' + 
			",contractClassCode = '" + contractClassCode + '\'' + 
			",contractCancel = '" + contractCancel + '\'' + 
			",changeTypeList = '" + changeTypeList + '\'' + 
			"}";
		}
}