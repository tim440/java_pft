package ru.rgs.APITests.model.AgentStatement.Create;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class AgentContractRateListItem{

	@SerializedName("rate")
	private String rate;

	@SerializedName("endDate")
	private String endDate;

	@SerializedName("riskObjectType")
	private RiskObjectType riskObjectType;

	@SerializedName("commissionChargeType")
	private CommissionChargeType commissionChargeType;

	@SerializedName("isReserve")
	private String isReserve;

	@SerializedName("id")
	private String id;

	@SerializedName("startDate")
	private String startDate;

	public String getRate(){
		return rate;
	}

	public String getEndDate(){
		return endDate;
	}

	public RiskObjectType getRiskObjectType(){
		return riskObjectType;
	}

	public CommissionChargeType getCommissionChargeType(){
		return commissionChargeType;
	}

	public String getIsReserve(){
		return isReserve;
	}

	public String getId(){
		return id;
	}

	public String getStartDate(){
		return startDate;
	}

	@Override
 	public String toString(){
		return 
			"AgentContractRateListItem{" + 
			"rate = '" + rate + '\'' + 
			",endDate = '" + endDate + '\'' + 
			",riskObjectType = '" + riskObjectType + '\'' + 
			",commissionChargeType = '" + commissionChargeType + '\'' + 
			",isReserve = '" + isReserve + '\'' + 
			",id = '" + id + '\'' + 
			",startDate = '" + startDate + '\'' + 
			"}";
		}
}