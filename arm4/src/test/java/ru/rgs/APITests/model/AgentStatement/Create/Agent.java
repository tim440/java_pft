package ru.rgs.APITests.model.AgentStatement.Create;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Agent{

	@SerializedName("agentType")
	private AgentType agentType;

	@SerializedName("commissionWithoutDate")
	private String commissionWithoutDate;

	@SerializedName("agentCode")
	private String agentCode;

	@SerializedName("sysSource")
	private String sysSource;

	@SerializedName("partnerWithCommission")
	private String partnerWithCommission;

	@SerializedName("agentIsNotProlongationState")
	private String agentIsNotProlongationState;

	@SerializedName("branch")
	private Branch branch;

	@SerializedName("agentLevel")
	private AgentLevel agentLevel;

	@SerializedName("agentContractList")
	private List<AgentContractListItem> agentContractList;

	@SerializedName("saleGroup")
	private SaleGroup saleGroup;

	@SerializedName("sysEditor")
	private String sysEditor;

	@SerializedName("contractForm")
	private ContractForm contractForm;

	@SerializedName("partnerWithTechInspCommission")
	private String partnerWithTechInspCommission;

	@SerializedName("reserve")
	private String reserve;

	@SerializedName("id")
	private String id;

	@SerializedName("eaRsaAgent")
	private String eaRsaAgent;

	@SerializedName("agentOfficeInfoList")
	private List<AgentOfficeInfoListItem> agentOfficeInfoList;

	@SerializedName("agentArea")
	private AgentArea agentArea;

	@SerializedName("agentPersonalNumber")
	private String agentPersonalNumber;

	@SerializedName("personTypeCode")
	private String personTypeCode;

	@SerializedName("agentSpecialization")
	private AgentSpecialization agentSpecialization;

	@SerializedName("active")
	private String active;

	@SerializedName("broker")
	private String broker;

	@SerializedName("isMultiChannel")
	private String isMultiChannel;

	@SerializedName("saleChannel")
	private SaleChannel saleChannel;

	@SerializedName("personDisplayName")
	private String personDisplayName;

	@SerializedName("personId")
	private String personId;

	@SerializedName("lastModified")
	private String lastModified;

	@SerializedName("agentIsNotProlongation")
	private String agentIsNotProlongation;

	public AgentType getAgentType(){
		return agentType;
	}

	public String getCommissionWithoutDate(){
		return commissionWithoutDate;
	}

	public String getAgentCode(){
		return agentCode;
	}

	public String getSysSource(){
		return sysSource;
	}

	public String getPartnerWithCommission(){
		return partnerWithCommission;
	}

	public String getAgentIsNotProlongationState(){
		return agentIsNotProlongationState;
	}

	public Branch getBranch(){
		return branch;
	}

	public AgentLevel getAgentLevel(){
		return agentLevel;
	}

	public List<AgentContractListItem> getAgentContractList(){
		return agentContractList;
	}

	public SaleGroup getSaleGroup(){
		return saleGroup;
	}

	public String getSysEditor(){
		return sysEditor;
	}

	public ContractForm getContractForm(){
		return contractForm;
	}

	public String getPartnerWithTechInspCommission(){
		return partnerWithTechInspCommission;
	}

	public String getReserve(){
		return reserve;
	}

	public String getId(){
		return id;
	}

	public String getEaRsaAgent(){
		return eaRsaAgent;
	}

	public List<AgentOfficeInfoListItem> getAgentOfficeInfoList(){
		return agentOfficeInfoList;
	}

	public AgentArea getAgentArea(){
		return agentArea;
	}

	public String getAgentPersonalNumber(){
		return agentPersonalNumber;
	}

	public String getPersonTypeCode(){
		return personTypeCode;
	}

	public AgentSpecialization getAgentSpecialization(){
		return agentSpecialization;
	}

	public String getActive(){
		return active;
	}

	public String getBroker(){
		return broker;
	}

	public String getIsMultiChannel(){
		return isMultiChannel;
	}

	public SaleChannel getSaleChannel(){
		return saleChannel;
	}

	public String getPersonDisplayName(){
		return personDisplayName;
	}

	public String getPersonId(){
		return personId;
	}

	public String getLastModified(){
		return lastModified;
	}

	public String getAgentIsNotProlongation(){
		return agentIsNotProlongation;
	}

	@Override
 	public String toString(){
		return 
			"Agent{" + 
			"agentType = '" + agentType + '\'' + 
			",commissionWithoutDate = '" + commissionWithoutDate + '\'' + 
			",agentCode = '" + agentCode + '\'' + 
			",sysSource = '" + sysSource + '\'' + 
			",partnerWithCommission = '" + partnerWithCommission + '\'' + 
			",agentIsNotProlongationState = '" + agentIsNotProlongationState + '\'' + 
			",branch = '" + branch + '\'' + 
			",agentLevel = '" + agentLevel + '\'' + 
			",agentContractList = '" + agentContractList + '\'' + 
			",saleGroup = '" + saleGroup + '\'' + 
			",sysEditor = '" + sysEditor + '\'' + 
			",contractForm = '" + contractForm + '\'' + 
			",partnerWithTechInspCommission = '" + partnerWithTechInspCommission + '\'' + 
			",reserve = '" + reserve + '\'' + 
			",id = '" + id + '\'' + 
			",eaRsaAgent = '" + eaRsaAgent + '\'' + 
			",agentOfficeInfoList = '" + agentOfficeInfoList + '\'' + 
			",agentArea = '" + agentArea + '\'' + 
			",agentPersonalNumber = '" + agentPersonalNumber + '\'' + 
			",personTypeCode = '" + personTypeCode + '\'' + 
			",agentSpecialization = '" + agentSpecialization + '\'' + 
			",active = '" + active + '\'' + 
			",broker = '" + broker + '\'' + 
			",isMultiChannel = '" + isMultiChannel + '\'' + 
			",saleChannel = '" + saleChannel + '\'' + 
			",personDisplayName = '" + personDisplayName + '\'' + 
			",personId = '" + personId + '\'' + 
			",lastModified = '" + lastModified + '\'' + 
			",agentIsNotProlongation = '" + agentIsNotProlongation + '\'' + 
			"}";
		}
}