package ru.rgs.APITests.model.AgentStatement.Create;

import com.google.gson.annotations.SerializedName;
import ru.rgs.APITests.model.AgentStatement.SaleChannelListItem;

import javax.annotation.Generated;
import java.util.List;

@Generated("com.robohorse.robopojogenerator")
public class AgentStatement{

	@SerializedName("currencyType")
	private CurrencyType currencyType;

	@SerializedName("surcharge")
	private String surcharge;

	@SerializedName("premiumChargedSum")
	private String premiumChargedSum;

	@SerializedName("agent")
	private Agent agent;

	@SerializedName("isCftPayInsEnabled")
	private String isCftPayInsEnabled;

	@SerializedName("branch")
	private Branch branch;

	@SerializedName("saleChannelList")
	private List<SaleChannelListItem> saleChannelList;

	@SerializedName("paymentType")
	private PaymentType paymentType;

	@SerializedName("factAccruedPremiumDateStartDate")
	private String factAccruedPremiumDateStartDate;

	@SerializedName("saleGroup")
	private SaleGroup saleGroup;

	@SerializedName("sysEditor")
	private String sysEditor;

	@SerializedName("isStartMigrationEnrichment")
	private String isStartMigrationEnrichment;

	@SerializedName("isShowAllCommissionsDisabled")
	private String isShowAllCommissionsDisabled;

	@SerializedName("statementNumber")
	private String statementNumber;

	@SerializedName("paymentStatus")
	private PaymentStatus paymentStatus;

	@SerializedName("epsDate")
	private String epsDate;

	@SerializedName("premiumCollectedSum")
	private String premiumCollectedSum;

	@SerializedName("startMatchingDate")
	private String startMatchingDate;

	@SerializedName("isActivateAgentFromAnotherBranch")
	private String isActivateAgentFromAnotherBranch;

	@SerializedName("newKvActive")
	private String newKvActive;

	@SerializedName("premiumChargeType")
	private PremiumChargeType premiumChargeType;

	@SerializedName("agentStatementStatus")
	private AgentStatementStatus agentStatementStatus;

	@SerializedName("contractCount")
	private String contractCount;

	@SerializedName("saleChannel")
	private SaleChannel saleChannel;

	@SerializedName("liabilitySum")
	private String liabilitySum;

	@SerializedName("isManualMatch")
	private String isManualMatch;

	@SerializedName("paymentCount")
	private String paymentCount;

	public CurrencyType getCurrencyType(){
		return currencyType;
	}

	public String getSurcharge(){
		return surcharge;
	}

	public String getPremiumChargedSum(){
		return premiumChargedSum;
	}

	public Agent getAgent(){
		return agent;
	}

	public String getIsCftPayInsEnabled(){
		return isCftPayInsEnabled;
	}

	public Branch getBranch(){
		return branch;
	}

	public List<SaleChannelListItem> getSaleChannelList(){
		return saleChannelList;
	}

	public PaymentType getPaymentType(){
		return paymentType;
	}

	public String getFactAccruedPremiumDateStartDate(){
		return factAccruedPremiumDateStartDate;
	}

	public SaleGroup getSaleGroup(){
		return saleGroup;
	}

	public String getSysEditor(){
		return sysEditor;
	}

	public String getIsStartMigrationEnrichment(){
		return isStartMigrationEnrichment;
	}

	public String getIsShowAllCommissionsDisabled(){
		return isShowAllCommissionsDisabled;
	}

	public String getStatementNumber(){
		return statementNumber;
	}

	public PaymentStatus getPaymentStatus(){
		return paymentStatus;
	}

	public String getEpsDate(){
		return epsDate;
	}

	public String getPremiumCollectedSum(){
		return premiumCollectedSum;
	}

	public String getStartMatchingDate(){
		return startMatchingDate;
	}

	public String getIsActivateAgentFromAnotherBranch(){
		return isActivateAgentFromAnotherBranch;
	}

	public String getNewKvActive(){
		return newKvActive;
	}

	public PremiumChargeType getPremiumChargeType(){
		return premiumChargeType;
	}

	public AgentStatementStatus getAgentStatementStatus(){
		return agentStatementStatus;
	}

	public String getContractCount(){
		return contractCount;
	}

	public SaleChannel getSaleChannel(){
		return saleChannel;
	}

	public String getLiabilitySum(){
		return liabilitySum;
	}

	public String getIsManualMatch(){
		return isManualMatch;
	}

	public String getPaymentCount(){
		return paymentCount;
	}

	@Override
 	public String toString(){
		return 
			"AgentStatement{" + 
			"currencyType = '" + currencyType + '\'' + 
			",surcharge = '" + surcharge + '\'' + 
			",premiumChargedSum = '" + premiumChargedSum + '\'' + 
			",agent = '" + agent + '\'' + 
			",isCftPayInsEnabled = '" + isCftPayInsEnabled + '\'' + 
			",branch = '" + branch + '\'' + 
			",saleChannelList = '" + saleChannelList + '\'' + 
			",paymentType = '" + paymentType + '\'' + 
			",factAccruedPremiumDateStartDate = '" + factAccruedPremiumDateStartDate + '\'' + 
			",saleGroup = '" + saleGroup + '\'' + 
			",sysEditor = '" + sysEditor + '\'' + 
			",isStartMigrationEnrichment = '" + isStartMigrationEnrichment + '\'' + 
			",isShowAllCommissionsDisabled = '" + isShowAllCommissionsDisabled + '\'' + 
			",statementNumber = '" + statementNumber + '\'' + 
			",paymentStatus = '" + paymentStatus + '\'' + 
			",epsDate = '" + epsDate + '\'' + 
			",premiumCollectedSum = '" + premiumCollectedSum + '\'' + 
			",startMatchingDate = '" + startMatchingDate + '\'' + 
			",isActivateAgentFromAnotherBranch = '" + isActivateAgentFromAnotherBranch + '\'' + 
			",newKvActive = '" + newKvActive + '\'' + 
			",premiumChargeType = '" + premiumChargeType + '\'' + 
			",agentStatementStatus = '" + agentStatementStatus + '\'' + 
			",contractCount = '" + contractCount + '\'' + 
			",saleChannel = '" + saleChannel + '\'' + 
			",liabilitySum = '" + liabilitySum + '\'' + 
			",isManualMatch = '" + isManualMatch + '\'' + 
			",paymentCount = '" + paymentCount + '\'' + 
			"}";
		}
}