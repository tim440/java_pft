package ru.rgs.APITests.model.AgentStatement.Create;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class AgentContractListItem{

	@SerializedName("number")
	private String number;

	@SerializedName("endDate")
	private String endDate;

	@SerializedName("settlementTypeName")
	private String settlementTypeName;

	@SerializedName("isSapIntegrActive")
	private String isSapIntegrActive;

	@SerializedName("settlementTypeCode")
	private String settlementTypeCode;

	@SerializedName("agentContractRateList")
	private List<AgentContractRateListItem> agentContractRateList;

	@SerializedName("id")
	private String id;

	@SerializedName("startDate")
	private String startDate;

	@SerializedName("useRatesByDefault")
	private String useRatesByDefault;

	public String getNumber(){
		return number;
	}

	public String getEndDate(){
		return endDate;
	}

	public String getSettlementTypeName(){
		return settlementTypeName;
	}

	public String getIsSapIntegrActive(){
		return isSapIntegrActive;
	}

	public String getSettlementTypeCode(){
		return settlementTypeCode;
	}

	public List<AgentContractRateListItem> getAgentContractRateList(){
		return agentContractRateList;
	}

	public String getId(){
		return id;
	}

	public String getStartDate(){
		return startDate;
	}

	public String getUseRatesByDefault(){
		return useRatesByDefault;
	}

	@Override
 	public String toString(){
		return 
			"AgentContractListItem{" + 
			"number = '" + number + '\'' + 
			",endDate = '" + endDate + '\'' + 
			",settlementTypeName = '" + settlementTypeName + '\'' + 
			",isSapIntegrActive = '" + isSapIntegrActive + '\'' + 
			",settlementTypeCode = '" + settlementTypeCode + '\'' + 
			",agentContractRateList = '" + agentContractRateList + '\'' + 
			",id = '" + id + '\'' + 
			",startDate = '" + startDate + '\'' + 
			",useRatesByDefault = '" + useRatesByDefault + '\'' + 
			"}";
		}
}