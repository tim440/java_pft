package ru.rgs.APITests.model.contracts.osago.submit;

import com.google.gson.annotations.SerializedName;
import ru.rgs.APITests.model.contracts.osago.create.CreateObject;
import ru.rgs.APITests.model.contracts.osago.create.OsagoCreate;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class CurrentContractChange{

	@SerializedName("agreementType")
	private AgreementType agreementType;

	@SerializedName("agentId")
	private String agentId;

	@SerializedName("cancelDate")
	private Object cancelDate;

	@SerializedName("docBase")
	private String docBase;

	@SerializedName("premiumPaidSum")
	private int premiumPaidSum;

	@SerializedName("endDate")
	private Object endDate;

	@SerializedName("agentDisplayName")
	private String agentDisplayName;

	@SerializedName("contractCurrency")
	private ContractCurrency contractCurrency;

	@SerializedName("statementDate")
	private Object statementDate;

	@SerializedName("contractStatusCode")
	private String contractStatusCode;

	@SerializedName("signDate")
	private Object signDate;

	@SerializedName("contractCurrencySum")
	private int contractCurrencySum;

	@SerializedName("nssoRecordState")
	private String nssoRecordState;

	@SerializedName("agentStatementNumber")
	private String agentStatementNumber;

	@SerializedName("damageCurrencySum")
	private int damageCurrencySum;

	@SerializedName("nssoMethod")
	private String nssoMethod;

	@SerializedName("damageRateForOne")
	private int damageRateForOne;

	@SerializedName("number")
	private String number;

	@SerializedName("premiumProportion")
	private boolean premiumProportion;

	@SerializedName("prolongationType")
	private String prolongationType;

	@SerializedName("topBranchUserName")
	private String topBranchUserName;

	@SerializedName("damageCurrencyCode")
	private String damageCurrencyCode;

	@SerializedName("cancelReason")
	private CancelReason cancelReason;

	@SerializedName("createDate")
	private Object createDate;

	@SerializedName("cancelApplicationDate")
	private Object cancelApplicationDate;

	@SerializedName("contractCancel")
	private boolean contractCancel;

	@SerializedName("noChangeBso")
	private boolean noChangeBso;

	@SerializedName("comments")
	private String comments;

	@SerializedName("contractStartDate")
	private Object contractStartDate;

	@SerializedName("changeType")
	private ChangeType changeType;

	@SerializedName("versionNumber")
	private int versionNumber;

	@SerializedName("naumenNumber")
	private String naumenNumber;

	@SerializedName("agentStatementId")
	private String agentStatementId;

	@SerializedName("agentStatementDate")
	private String agentStatementDate;

	@SerializedName("blankDto")
	private String blankDto;

	@SerializedName("series")
	private String series;

	@SerializedName("contractId")
	private String contractId;

	@SerializedName("sysModifyDate")
	private String sysModifyDate;

	@SerializedName("bid")
	private String bid;

	@SerializedName("contractClassCode")
	private String contractClassCode;

	@SerializedName("user")
	private String user;

	@SerializedName("sapMigrationReasonCode")
	private String sapMigrationReasonCode;

	@SerializedName("startDate")
	private Object startDate;

	@SerializedName("cancelActNumber")
	private String cancelActNumber;

    public CurrentContractChange(OsagoCreate osagoCreate) {
        CreateObject createObject = osagoCreate.getCreateOperationResult().getCreateObject();
        this.agreementType = new AgreementType();
        this.agentId = "";
        this.cancelDate = null;
        this.docBase = "";
        this.premiumPaidSum = 0;
        this.endDate = null;
        this.agentDisplayName = "";
        this.contractCurrency = new ContractCurrency();
        this.statementDate = null;
        this.contractStatusCode = "";
        this.signDate = null;
        this.contractCurrencySum = 0;
        this.nssoRecordState = "";
        this.agentStatementNumber = "";
        this.damageCurrencySum = 0;
        this.nssoMethod = "";
        this.damageRateForOne = 0;
        this.number = "";
        this.premiumProportion = false;
        this.prolongationType = "";
        this.topBranchUserName = "";
        this.damageCurrencyCode = "";
        this.cancelReason = new CancelReason(createObject);
        this.createDate = null;
        this.cancelApplicationDate = null;
        this.contractCancel = false;
        this.noChangeBso = false;
        this.comments = "";
        this.contractStartDate = null;
        this.changeType = new ChangeType(createObject);
        this.versionNumber = 0;
        this.naumenNumber = "";
        this.agentStatementId = "";
        this.agentStatementDate = "";
        this.blankDto = "";
        this.series = "";
        this.contractId = "";
        this.sysModifyDate = "2017-11-09T00:06:58";
        this.bid = createObject.getCurrentContractChange().getBid();
        this.contractClassCode = createObject.getCurrentContractChange().getContractClassCode();
        this.user = "";
        this.sapMigrationReasonCode = "";
        this.startDate = null;
        this.cancelActNumber = "";
    }

    public AgreementType getAgreementType(){
		return agreementType;
	}

	public String getAgentId(){
		return agentId;
	}

	public Object getCancelDate(){
		return cancelDate;
	}

	public String getDocBase(){
		return docBase;
	}

	public int getPremiumPaidSum(){
		return premiumPaidSum;
	}

	public Object getEndDate(){
		return endDate;
	}

	public String getAgentDisplayName(){
		return agentDisplayName;
	}

	public ContractCurrency getContractCurrency(){
		return contractCurrency;
	}

	public Object getStatementDate(){
		return statementDate;
	}

	public String getContractStatusCode(){
		return contractStatusCode;
	}

	public Object getSignDate(){
		return signDate;
	}

	public int getContractCurrencySum(){
		return contractCurrencySum;
	}

	public String getNssoRecordState(){
		return nssoRecordState;
	}

	public String getAgentStatementNumber(){
		return agentStatementNumber;
	}

	public int getDamageCurrencySum(){
		return damageCurrencySum;
	}

	public String getNssoMethod(){
		return nssoMethod;
	}

	public int getDamageRateForOne(){
		return damageRateForOne;
	}

	public String getNumber(){
		return number;
	}

	public boolean isPremiumProportion(){
		return premiumProportion;
	}

	public String getProlongationType(){
		return prolongationType;
	}

	public String getTopBranchUserName(){
		return topBranchUserName;
	}

	public String getDamageCurrencyCode(){
		return damageCurrencyCode;
	}

	public CancelReason getCancelReason(){
		return cancelReason;
	}

	public Object getCreateDate(){
		return createDate;
	}

	public Object getCancelApplicationDate(){
		return cancelApplicationDate;
	}

	public boolean isContractCancel(){
		return contractCancel;
	}

	public boolean isNoChangeBso(){
		return noChangeBso;
	}

	public String getComments(){
		return comments;
	}

	public Object getContractStartDate(){
		return contractStartDate;
	}

	public ChangeType getChangeType(){
		return changeType;
	}

	public int getVersionNumber(){
		return versionNumber;
	}

	public String getNaumenNumber(){
		return naumenNumber;
	}

	public String getAgentStatementId(){
		return agentStatementId;
	}

	public String getAgentStatementDate(){
		return agentStatementDate;
	}

	public String getBlankDto(){
		return blankDto;
	}

	public String getSeries(){
		return series;
	}

	public String getContractId(){
		return contractId;
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

	public String getSapMigrationReasonCode(){
		return sapMigrationReasonCode;
	}

	public Object getStartDate(){
		return startDate;
	}

	public String getCancelActNumber(){
		return cancelActNumber;
	}

	@Override
 	public String toString(){
		return 
			"CurrentContractChange{" + 
			"agreementType = '" + agreementType + '\'' + 
			",agentId = '" + agentId + '\'' + 
			",cancelDate = '" + cancelDate + '\'' + 
			",docBase = '" + docBase + '\'' + 
			",premiumPaidSum = '" + premiumPaidSum + '\'' + 
			",endDate = '" + endDate + '\'' + 
			",agentDisplayName = '" + agentDisplayName + '\'' + 
			",contractCurrency = '" + contractCurrency + '\'' + 
			",statementDate = '" + statementDate + '\'' + 
			",contractStatusCode = '" + contractStatusCode + '\'' + 
			",signDate = '" + signDate + '\'' + 
			",contractCurrencySum = '" + contractCurrencySum + '\'' + 
			",nssoRecordState = '" + nssoRecordState + '\'' + 
			",agentStatementNumber = '" + agentStatementNumber + '\'' + 
			",damageCurrencySum = '" + damageCurrencySum + '\'' + 
			",nssoMethod = '" + nssoMethod + '\'' + 
			",damageRateForOne = '" + damageRateForOne + '\'' + 
			",number = '" + number + '\'' + 
			",premiumProportion = '" + premiumProportion + '\'' + 
			",prolongationType = '" + prolongationType + '\'' + 
			",topBranchUserName = '" + topBranchUserName + '\'' + 
			",damageCurrencyCode = '" + damageCurrencyCode + '\'' + 
			",cancelReason = '" + cancelReason + '\'' + 
			",createDate = '" + createDate + '\'' + 
			",cancelApplicationDate = '" + cancelApplicationDate + '\'' + 
			",contractCancel = '" + contractCancel + '\'' + 
			",noChangeBso = '" + noChangeBso + '\'' + 
			",comments = '" + comments + '\'' + 
			",contractStartDate = '" + contractStartDate + '\'' + 
			",changeType = '" + changeType + '\'' + 
			",versionNumber = '" + versionNumber + '\'' + 
			",naumenNumber = '" + naumenNumber + '\'' + 
			",agentStatementId = '" + agentStatementId + '\'' + 
			",agentStatementDate = '" + agentStatementDate + '\'' + 
			",blankDto = '" + blankDto + '\'' + 
			",series = '" + series + '\'' + 
			",contractId = '" + contractId + '\'' + 
			",sysModifyDate = '" + sysModifyDate + '\'' + 
			",bid = '" + bid + '\'' + 
			",contractClassCode = '" + contractClassCode + '\'' + 
			",user = '" + user + '\'' + 
			",sapMigrationReasonCode = '" + sapMigrationReasonCode + '\'' + 
			",startDate = '" + startDate + '\'' + 
			",cancelActNumber = '" + cancelActNumber + '\'' + 
			"}";
		}
}