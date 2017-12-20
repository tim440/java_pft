package ru.rgs.APITests.model.contracts.osago.create;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class CreateObject{

	@SerializedName("drivingLimitationTypeByPersonTypeList")
	private List<DrivingLimitationTypeByPersonTypeListItem> drivingLimitationTypeByPersonTypeList;

	@SerializedName("contractType")
	private ContractType contractType;

	@SerializedName("coInsuranceStartDate")
	private String coInsuranceStartDate;

	@SerializedName("office")
	private Office office;

	@SerializedName("branch")
	private Branch branch;

	@SerializedName("segmentActivateStartDate")
	private String segmentActivateStartDate;

	@SerializedName("currentContractChange")
	private CurrentContractChange currentContractChange;

	@SerializedName("sysEditor")
	private String sysEditor;

	@SerializedName("contractTypeClassList")
	private List<ContractTypeClassListItem> contractTypeClassList;

	@SerializedName("insurerIsOwner")
	private String insurerIsOwner;

	@SerializedName("contractTypeClass")
	private ContractTypeClass contractTypeClass;

	@SerializedName("statementStatusCode")
	private String statementStatusCode;

	@SerializedName("isActivateAgentFromAnotherBranch")
	private String isActivateAgentFromAnotherBranch;

	@SerializedName("agentName")
	private String agentName;

	@SerializedName("premiumChargeType")
	private PremiumChargeType premiumChargeType;

	@SerializedName("insurerHasCellPhone")
	private String insurerHasCellPhone;

	@SerializedName("saleChannel")
	private SaleChannel saleChannel;

	@SerializedName("isEmptySourceCheckSum")
	private String isEmptySourceCheckSum;

	@SerializedName("claimReturnSum")
	private String claimReturnSum;

	@SerializedName("premiumChanged")
	private String premiumChanged;

	@SerializedName("noBlank")
	private String noBlank;

	@SerializedName("insuredVehicle")
	private InsuredVehicle insuredVehicle;

	@SerializedName("agentId")
	private String agentId;

	@SerializedName("existActiveAsyncRequest")
	private String existActiveAsyncRequest;

	@SerializedName("stateProcurementStartDate")
	private String stateProcurementStartDate;

	@SerializedName("debitWriteOffReasonList")
	private List<DebitWriteOffReasonListItem> debitWriteOffReasonList;

	@SerializedName("hasViolations")
	private String hasViolations;

	@SerializedName("agentStatementNumber")
	private String agentStatementNumber;

	@SerializedName("factAccruedPremiumDateStartDate")
	private String factAccruedPremiumDateStartDate;

	@SerializedName("vehicle")
	private Vehicle vehicle;

	@SerializedName("saleGroup")
	private SaleGroup saleGroup;

	@SerializedName("segmentRequestStatusName")
	private String segmentRequestStatusName;

	@SerializedName("reinsureStartDate")
	private String reinsureStartDate;

	@SerializedName("currency")
	private Currency currency;

	@SerializedName("insbridgePremiumCalculateStartDate")
	private String insbridgePremiumCalculateStartDate;

	@SerializedName("osagoSchema17StartDate")
	private String osagoSchema17StartDate;

	@SerializedName("product")
	private Product product;

	@SerializedName("bonusMalusList")
	private List<BonusMalusListItem> bonusMalusList;

	@SerializedName("rsaKbmStartDate")
	private String rsaKbmStartDate;

	@SerializedName("contractOption")
	private ContractOption contractOption;

	@SerializedName("osagoStoaStartDate")
	private String osagoStoaStartDate;

	@SerializedName("agentStatementId")
	private String agentStatementId;

	@SerializedName("agentStatementDate")
	private String agentStatementDate;

	@SerializedName("contractTypeClassStartDate")
	private String contractTypeClassStartDate;

	@SerializedName("blankDto")
	private BlankDto blankDto;

	@SerializedName("premiumRur")
	private String premiumRur;

	@SerializedName("paymentTypeList")
	private List<PaymentTypeListItem> paymentTypeList;

	@SerializedName("entityPurpose")
	private String entityPurpose;

	@SerializedName("isProcessPersInfo")
	private String isProcessPersInfo;

	@SerializedName("isProcessPersInfoEmpty")
	private String isProcessPersInfoEmpty;

	public List<DrivingLimitationTypeByPersonTypeListItem> getDrivingLimitationTypeByPersonTypeList(){
		return drivingLimitationTypeByPersonTypeList;
	}

	public ContractType getContractType(){
		return contractType;
	}

	public String getCoInsuranceStartDate(){
		return coInsuranceStartDate;
	}

	public Office getOffice(){
		return office;
	}

	public Branch getBranch(){
		return branch;
	}

	public String getSegmentActivateStartDate(){
		return segmentActivateStartDate;
	}

	public CurrentContractChange getCurrentContractChange(){
		return currentContractChange;
	}

	public String getSysEditor(){
		return sysEditor;
	}

	public List<ContractTypeClassListItem> getContractTypeClassList(){
		return contractTypeClassList;
	}

	public String getInsurerIsOwner(){
		return insurerIsOwner;
	}

	public ContractTypeClass getContractTypeClass(){
		return contractTypeClass;
	}

	public String getStatementStatusCode(){
		return statementStatusCode;
	}

	public String getIsActivateAgentFromAnotherBranch(){
		return isActivateAgentFromAnotherBranch;
	}

	public String getAgentName(){
		return agentName;
	}

	public PremiumChargeType getPremiumChargeType(){
		return premiumChargeType;
	}

	public String getInsurerHasCellPhone(){
		return insurerHasCellPhone;
	}

	public SaleChannel getSaleChannel(){
		return saleChannel;
	}

	public String getIsEmptySourceCheckSum(){
		return isEmptySourceCheckSum;
	}

	public String getClaimReturnSum(){
		return claimReturnSum;
	}

	public String getPremiumChanged(){
		return premiumChanged;
	}

	public String getNoBlank(){
		return noBlank;
	}

	public InsuredVehicle getInsuredVehicle(){
		return insuredVehicle;
	}

	public String getAgentId(){
		return agentId;
	}

	public String getExistActiveAsyncRequest(){
		return existActiveAsyncRequest;
	}

	public String getStateProcurementStartDate(){
		return stateProcurementStartDate;
	}

	public List<DebitWriteOffReasonListItem> getDebitWriteOffReasonList(){
		return debitWriteOffReasonList;
	}

	public String getHasViolations(){
		return hasViolations;
	}

	public String getAgentStatementNumber(){
		return agentStatementNumber;
	}

	public String getFactAccruedPremiumDateStartDate(){
		return factAccruedPremiumDateStartDate;
	}

	public Vehicle getVehicle(){
		return vehicle;
	}

	public SaleGroup getSaleGroup(){
		return saleGroup;
	}

	public String getSegmentRequestStatusName(){
		return segmentRequestStatusName;
	}

	public String getReinsureStartDate(){
		return reinsureStartDate;
	}

	public Currency getCurrency(){
		return currency;
	}

	public String getInsbridgePremiumCalculateStartDate(){
		return insbridgePremiumCalculateStartDate;
	}

	public String getOsagoSchema17StartDate(){
		return osagoSchema17StartDate;
	}

	public Product getProduct(){
		return product;
	}

	public List<BonusMalusListItem> getBonusMalusList(){
		return bonusMalusList;
	}

	public String getRsaKbmStartDate(){
		return rsaKbmStartDate;
	}

	public ContractOption getContractOption(){
		return contractOption;
	}

	public String getOsagoStoaStartDate(){
		return osagoStoaStartDate;
	}

	public String getAgentStatementId(){
		return agentStatementId;
	}

	public String getAgentStatementDate(){
		return agentStatementDate;
	}

	public String getContractTypeClassStartDate(){
		return contractTypeClassStartDate;
	}

	public BlankDto getBlankDto(){
		return blankDto;
	}

	public String getPremiumRur(){
		return premiumRur;
	}

	public List<PaymentTypeListItem> getPaymentTypeList(){
		return paymentTypeList;
	}

	public String getEntityPurpose(){
		return entityPurpose;
	}

	public String getIsProcessPersInfo(){
		return isProcessPersInfo;
	}

	public String getIsProcessPersInfoEmpty(){
		return isProcessPersInfoEmpty;
	}

	@Override
 	public String toString(){
		return 
			"CreateObject{" + 
			"drivingLimitationTypeByPersonTypeList = '" + drivingLimitationTypeByPersonTypeList + '\'' + 
			",contractType = '" + contractType + '\'' + 
			",coInsuranceStartDate = '" + coInsuranceStartDate + '\'' + 
			",office = '" + office + '\'' + 
			",branch = '" + branch + '\'' + 
			",segmentActivateStartDate = '" + segmentActivateStartDate + '\'' + 
			",currentContractChange = '" + currentContractChange + '\'' + 
			",sysEditor = '" + sysEditor + '\'' + 
			",contractTypeClassList = '" + contractTypeClassList + '\'' + 
			",insurerIsOwner = '" + insurerIsOwner + '\'' + 
			",contractTypeClass = '" + contractTypeClass + '\'' + 
			",statementStatusCode = '" + statementStatusCode + '\'' + 
			",isActivateAgentFromAnotherBranch = '" + isActivateAgentFromAnotherBranch + '\'' + 
			",agentName = '" + agentName + '\'' + 
			",premiumChargeType = '" + premiumChargeType + '\'' + 
			",insurerHasCellPhone = '" + insurerHasCellPhone + '\'' + 
			",saleChannel = '" + saleChannel + '\'' + 
			",isEmptySourceCheckSum = '" + isEmptySourceCheckSum + '\'' + 
			",claimReturnSum = '" + claimReturnSum + '\'' + 
			",premiumChanged = '" + premiumChanged + '\'' + 
			",noBlank = '" + noBlank + '\'' + 
			",insuredVehicle = '" + insuredVehicle + '\'' + 
			",agentId = '" + agentId + '\'' + 
			",existActiveAsyncRequest = '" + existActiveAsyncRequest + '\'' + 
			",stateProcurementStartDate = '" + stateProcurementStartDate + '\'' + 
			",debitWriteOffReasonList = '" + debitWriteOffReasonList + '\'' + 
			",hasViolations = '" + hasViolations + '\'' + 
			",agentStatementNumber = '" + agentStatementNumber + '\'' + 
			",factAccruedPremiumDateStartDate = '" + factAccruedPremiumDateStartDate + '\'' + 
			",vehicle = '" + vehicle + '\'' + 
			",saleGroup = '" + saleGroup + '\'' + 
			",segmentRequestStatusName = '" + segmentRequestStatusName + '\'' + 
			",reinsureStartDate = '" + reinsureStartDate + '\'' + 
			",currency = '" + currency + '\'' + 
			",insbridgePremiumCalculateStartDate = '" + insbridgePremiumCalculateStartDate + '\'' + 
			",osagoSchema17StartDate = '" + osagoSchema17StartDate + '\'' + 
			",product = '" + product + '\'' + 
			",bonusMalusList = '" + bonusMalusList + '\'' + 
			",rsaKbmStartDate = '" + rsaKbmStartDate + '\'' + 
			",contractOption = '" + contractOption + '\'' + 
			",osagoStoaStartDate = '" + osagoStoaStartDate + '\'' + 
			",agentStatementId = '" + agentStatementId + '\'' + 
			",agentStatementDate = '" + agentStatementDate + '\'' + 
			",contractTypeClassStartDate = '" + contractTypeClassStartDate + '\'' + 
			",blankDto = '" + blankDto + '\'' + 
			",premiumRur = '" + premiumRur + '\'' + 
			",paymentTypeList = '" + paymentTypeList + '\'' + 
			",entityPurpose = '" + entityPurpose + '\'' + 
			",isProcessPersInfo = '" + isProcessPersInfo + '\'' + 
			",isProcessPersInfoEmpty = '" + isProcessPersInfoEmpty + '\'' + 
			"}";
		}
}