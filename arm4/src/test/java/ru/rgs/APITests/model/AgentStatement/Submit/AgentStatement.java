package ru.rgs.APITests.model.AgentStatement.Submit;

import com.google.gson.annotations.SerializedName;
import ru.rgs.APITests.model.AgentStatement.Create.AgentStatementCreate;
import ru.rgs.APITests.model.AgentStatement.SaleChannelListItem;

import javax.annotation.Generated;
import java.util.List;

import static java.util.Arrays.asList;

@Generated("com.robohorse.robopojogenerator")
public class AgentStatement{

	@SerializedName("currencyType")
	private CurrencyType currencyType;

	@SerializedName("surcharge")
	private boolean surcharge;

	@SerializedName("premiumChargedSum")
	private int premiumChargedSum;

	@SerializedName("projectStatus")
	private ProjectStatus projectStatus;

	@SerializedName("agent")
	private Agent agent;

	@SerializedName("agentRoleList")
	private List<Object> agentRoleList;

	@SerializedName("secondaryAgentsList")
	private List<Object> secondaryAgentsList;

	@SerializedName("statementDate")
	private String statementDate;

	@SerializedName("isCftPayInsEnabled")
	private boolean isCftPayInsEnabled;

	@SerializedName("branch")
	private Branch branch;

	@SerializedName("saleChannelList")
	private List<SaleChannelListItem> saleChannelList;

	@SerializedName("sapActiveDate")
	private Object sapActiveDate;

	@SerializedName("paymentType")
	private PaymentType paymentType;

	@SerializedName("factAccruedPremiumDateStartDate")
	private String factAccruedPremiumDateStartDate;

	@SerializedName("saleGroup")
	private SaleGroup saleGroup;

	@SerializedName("sysEditor")
	private String sysEditor;

	@SerializedName("autoDealer")
	private AutoDealer autoDealer;

	@SerializedName("isStartMigrationEnrichment")
	private boolean isStartMigrationEnrichment;

	@SerializedName("isShowAllCommissionsDisabled")
	private boolean isShowAllCommissionsDisabled;

	@SerializedName("statementNumber")
	private String statementNumber;

	@SerializedName("activeAgentRolesDate")
	private Object activeAgentRolesDate;

	@SerializedName("paymentStatus")
	private PaymentStatus paymentStatus;

	@SerializedName("epsDate")
	private String epsDate;

	@SerializedName("otherPartner")
	private OtherPartner otherPartner;

	@SerializedName("premiumCollectedSum")
	private int premiumCollectedSum;

	@SerializedName("startMatchingDate")
	private String startMatchingDate;

	@SerializedName("leasingCompany")
	private LeasingCompany leasingCompany;

	@SerializedName("newKvActive")
	private boolean newKvActive;

	@SerializedName("isActivateAgentFromAnotherBranch")
	private boolean isActivateAgentFromAnotherBranch;

	@SerializedName("premiumChargeType")
	private PremiumChargeType premiumChargeType;

	@SerializedName("agentStatementStatus")
	private AgentStatementStatus agentStatementStatus;

	@SerializedName("receivedPaymentList")
	private List<Object> receivedPaymentList;

	@SerializedName("contractCount")
	private int contractCount;

	@SerializedName("saleChannel")
	private SaleChannel saleChannel;

	@SerializedName("liabilitySum")
	private int liabilitySum;

	@SerializedName("isManualMatch")
	private boolean isManualMatch;

	@SerializedName("bankIntermediary")
	private BankIntermediary bankIntermediary;

	@SerializedName("paymentCount")
	private int paymentCount;

	@SerializedName("sapMigrationReasonCode")
	private String sapMigrationReasonCode;

	@SerializedName("commentary")
	private String commentary;

	@SerializedName("crcNumber")
	private String crcNumber;

	@SerializedName("agentContractId")
	private String agentContractId;

	public AgentStatement(AgentStatementCreate agentStatementCreate, String agentStatementNumberFromDate, String agentStatementDate, String name, String id, String paymentName, String paymentId) {
		this.branch = new Branch(agentStatementCreate);
		this.paymentStatus = new PaymentStatus(agentStatementCreate);
		this.agentStatementStatus = new AgentStatementStatus(agentStatementCreate);
		this.agent = new Agent(agentStatementCreate);
		this.currencyType = new CurrencyType(name, id);
		this.paymentType = new PaymentType(paymentName, paymentId);
		this.leasingCompany = new LeasingCompany();
		this.autoDealer = new AutoDealer();
		this.otherPartner = new OtherPartner();
		this.bankIntermediary = new BankIntermediary();
		this.saleGroup = new SaleGroup(agentStatementCreate);
		this.saleChannel = new SaleChannel(agentStatementCreate);
		this.statementNumber = "72850010-72850010" + agentStatementNumberFromDate;
		this.statementDate = agentStatementDate;
		this.contractCount = 0;
		this.premiumChargedSum = 0;
		this.paymentCount = 0;
		this.premiumCollectedSum = 0;
		this.sysEditor = "1";
		this.commentary = "";
		this.sapMigrationReasonCode = "";
		this.saleChannelList = agentStatementCreate.getCreateOperationResult().getCreateObject().getAgentStatement().getSaleChannelList();
		this.liabilitySum = 0;
		this.premiumChargeType = new PremiumChargeType(agentStatementCreate);
		this.surcharge = false;
		this.receivedPaymentList = asList();
		this.agentRoleList = asList();
		this.secondaryAgentsList = asList();
		this.isCftPayInsEnabled = false;
		this.isStartMigrationEnrichment = false;
		this.agentContractId = agentStatementCreate.getCreateOperationResult().getCreateObject().getAgentStatement().getAgent().getAgentContractList().get(0).getId();
		this.epsDate = "2016-12-01T00:00:00";
		this.factAccruedPremiumDateStartDate = "2017-05-01T00:00:00";
		this.newKvActive = true;
		this.activeAgentRolesDate = null;
		this.sapActiveDate = null;
		this.startMatchingDate = "2009-01-01T00:00:00";
		this.isShowAllCommissionsDisabled = true;
		this.isActivateAgentFromAnotherBranch = true;
		this.isManualMatch = false;
		this.crcNumber = "";
	}

    public CurrencyType getCurrencyType(){
		return currencyType;
	}

	public boolean isSurcharge(){
		return surcharge;
	}

	public int getPremiumChargedSum(){
		return premiumChargedSum;
	}

	public Agent getAgent(){
		return agent;
	}

	public List<Object> getAgentRoleList(){
		return agentRoleList;
	}

	public List<Object> getSecondaryAgentsList(){
		return secondaryAgentsList;
	}

	public String getStatementDate(){
		return statementDate;
	}

	public boolean isIsCftPayInsEnabled(){
		return isCftPayInsEnabled;
	}

	public Branch getBranch(){
		return branch;
	}

	public List<SaleChannelListItem> getSaleChannelList(){
		return saleChannelList;
	}

	public Object getSapActiveDate(){
		return sapActiveDate;
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

	public AutoDealer getAutoDealer(){
		return autoDealer;
	}

	public boolean isIsStartMigrationEnrichment(){
		return isStartMigrationEnrichment;
	}

	public boolean isIsShowAllCommissionsDisabled(){
		return isShowAllCommissionsDisabled;
	}

	public String getStatementNumber(){
		return statementNumber;
	}

	public Object getActiveAgentRolesDate(){
		return activeAgentRolesDate;
	}

	public PaymentStatus getPaymentStatus(){
		return paymentStatus;
	}

	public String getEpsDate(){
		return epsDate;
	}

	public OtherPartner getOtherPartner(){
		return otherPartner;
	}

	public int getPremiumCollectedSum(){
		return premiumCollectedSum;
	}

	public String getStartMatchingDate(){
		return startMatchingDate;
	}

	public LeasingCompany getLeasingCompany(){
		return leasingCompany;
	}

	public boolean isNewKvActive(){
		return newKvActive;
	}

	public boolean isIsActivateAgentFromAnotherBranch(){
		return isActivateAgentFromAnotherBranch;
	}

	public PremiumChargeType getPremiumChargeType(){
		return premiumChargeType;
	}

	public AgentStatementStatus getAgentStatementStatus(){
		return agentStatementStatus;
	}

	public List<Object> getReceivedPaymentList(){
		return receivedPaymentList;
	}

	public int getContractCount(){
		return contractCount;
	}

	public SaleChannel getSaleChannel(){
		return saleChannel;
	}

	public int getLiabilitySum(){
		return liabilitySum;
	}

	public boolean isIsManualMatch(){
		return isManualMatch;
	}

	public BankIntermediary getBankIntermediary(){
		return bankIntermediary;
	}

	public int getPaymentCount(){
		return paymentCount;
	}

	public String getSapMigrationReasonCode(){
		return sapMigrationReasonCode;
	}

	public String getCommentary(){
		return commentary;
	}

	public String getCrcNumber(){
		return crcNumber;
	}

	public String getAgentContractId(){
		return agentContractId;
	}

	@Override
 	public String toString(){
		return 
			"AgentStatement{" + 
			"currencyType = '" + currencyType + '\'' + 
			",surcharge = '" + surcharge + '\'' + 
			",premiumChargedSum = '" + premiumChargedSum + '\'' + 
			",agent = '" + agent + '\'' + 
			",agentRoleList = '" + agentRoleList + '\'' + 
			",secondaryAgentsList = '" + secondaryAgentsList + '\'' + 
			",statementDate = '" + statementDate + '\'' + 
			",isCftPayInsEnabled = '" + isCftPayInsEnabled + '\'' + 
			",branch = '" + branch + '\'' + 
			",saleChannelList = '" + saleChannelList + '\'' + 
			",sapActiveDate = '" + sapActiveDate + '\'' + 
			",paymentType = '" + paymentType + '\'' + 
			",factAccruedPremiumDateStartDate = '" + factAccruedPremiumDateStartDate + '\'' + 
			",saleGroup = '" + saleGroup + '\'' + 
			",sysEditor = '" + sysEditor + '\'' + 
			",autoDealer = '" + autoDealer + '\'' + 
			",isStartMigrationEnrichment = '" + isStartMigrationEnrichment + '\'' + 
			",isShowAllCommissionsDisabled = '" + isShowAllCommissionsDisabled + '\'' + 
			",statementNumber = '" + statementNumber + '\'' + 
			",activeAgentRolesDate = '" + activeAgentRolesDate + '\'' + 
			",paymentStatus = '" + paymentStatus + '\'' + 
			",epsDate = '" + epsDate + '\'' + 
			",otherPartner = '" + otherPartner + '\'' + 
			",premiumCollectedSum = '" + premiumCollectedSum + '\'' + 
			",startMatchingDate = '" + startMatchingDate + '\'' + 
			",leasingCompany = '" + leasingCompany + '\'' + 
			",newKvActive = '" + newKvActive + '\'' + 
			",isActivateAgentFromAnotherBranch = '" + isActivateAgentFromAnotherBranch + '\'' + 
			",premiumChargeType = '" + premiumChargeType + '\'' + 
			",agentStatementStatus = '" + agentStatementStatus + '\'' + 
			",receivedPaymentList = '" + receivedPaymentList + '\'' + 
			",contractCount = '" + contractCount + '\'' + 
			",saleChannel = '" + saleChannel + '\'' + 
			",liabilitySum = '" + liabilitySum + '\'' + 
			",isManualMatch = '" + isManualMatch + '\'' + 
			",bankIntermediary = '" + bankIntermediary + '\'' + 
			",paymentCount = '" + paymentCount + '\'' + 
			",sapMigrationReasonCode = '" + sapMigrationReasonCode + '\'' + 
			",commentary = '" + commentary + '\'' + 
			",crcNumber = '" + crcNumber + '\'' + 
			",agentContractId = '" + agentContractId + '\'' + 
			"}";
		}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AgentStatement that = (AgentStatement) o;

        if (surcharge != that.surcharge) return false;
        if (premiumChargedSum != that.premiumChargedSum) return false;
        if (isCftPayInsEnabled != that.isCftPayInsEnabled) return false;
        if (isStartMigrationEnrichment != that.isStartMigrationEnrichment) return false;
        if (isShowAllCommissionsDisabled != that.isShowAllCommissionsDisabled) return false;
        if (premiumCollectedSum != that.premiumCollectedSum) return false;
        if (newKvActive != that.newKvActive) return false;
        if (isActivateAgentFromAnotherBranch != that.isActivateAgentFromAnotherBranch) return false;
        if (contractCount != that.contractCount) return false;
        if (liabilitySum != that.liabilitySum) return false;
        if (isManualMatch != that.isManualMatch) return false;
        if (paymentCount != that.paymentCount) return false;
        if (currencyType != null ? !currencyType.equals(that.currencyType) : that.currencyType != null) return false;
        if (agent != null ? !agent.equals(that.agent) : that.agent != null) return false;
        if (agentRoleList != null ? !agentRoleList.equals(that.agentRoleList) : that.agentRoleList != null)
            return false;
        if (secondaryAgentsList != null ? !secondaryAgentsList.equals(that.secondaryAgentsList) : that.secondaryAgentsList != null)
            return false;
        if (statementDate != null ? !statementDate.equals(that.statementDate) : that.statementDate != null)
            return false;
        if (branch != null ? !branch.equals(that.branch) : that.branch != null) return false;
        if (saleChannelList != null ? !saleChannelList.equals(that.saleChannelList) : that.saleChannelList != null)
            return false;
        if (sapActiveDate != null ? !sapActiveDate.equals(that.sapActiveDate) : that.sapActiveDate != null)
            return false;
        if (paymentType != null ? !paymentType.equals(that.paymentType) : that.paymentType != null) return false;
        if (factAccruedPremiumDateStartDate != null ? !factAccruedPremiumDateStartDate.equals(that.factAccruedPremiumDateStartDate) : that.factAccruedPremiumDateStartDate != null)
            return false;
        if (saleGroup != null ? !saleGroup.equals(that.saleGroup) : that.saleGroup != null) return false;
        if (sysEditor != null ? !sysEditor.equals(that.sysEditor) : that.sysEditor != null) return false;
        if (autoDealer != null ? !autoDealer.equals(that.autoDealer) : that.autoDealer != null) return false;
        if (statementNumber != null ? !statementNumber.equals(that.statementNumber) : that.statementNumber != null)
            return false;
        if (activeAgentRolesDate != null ? !activeAgentRolesDate.equals(that.activeAgentRolesDate) : that.activeAgentRolesDate != null)
            return false;
        if (paymentStatus != null ? !paymentStatus.equals(that.paymentStatus) : that.paymentStatus != null)
            return false;
        if (epsDate != null ? !epsDate.equals(that.epsDate) : that.epsDate != null) return false;
        if (otherPartner != null ? !otherPartner.equals(that.otherPartner) : that.otherPartner != null) return false;
        if (startMatchingDate != null ? !startMatchingDate.equals(that.startMatchingDate) : that.startMatchingDate != null)
            return false;
        if (leasingCompany != null ? !leasingCompany.equals(that.leasingCompany) : that.leasingCompany != null)
            return false;
        if (premiumChargeType != null ? !premiumChargeType.equals(that.premiumChargeType) : that.premiumChargeType != null)
            return false;
        if (agentStatementStatus != null ? !agentStatementStatus.equals(that.agentStatementStatus) : that.agentStatementStatus != null)
            return false;
        if (receivedPaymentList != null ? !receivedPaymentList.equals(that.receivedPaymentList) : that.receivedPaymentList != null)
            return false;
        if (saleChannel != null ? !saleChannel.equals(that.saleChannel) : that.saleChannel != null) return false;
        if (bankIntermediary != null ? !bankIntermediary.equals(that.bankIntermediary) : that.bankIntermediary != null)
            return false;
        if (sapMigrationReasonCode != null ? !sapMigrationReasonCode.equals(that.sapMigrationReasonCode) : that.sapMigrationReasonCode != null)
            return false;
        if (commentary != null ? !commentary.equals(that.commentary) : that.commentary != null) return false;
        if (crcNumber != null ? !crcNumber.equals(that.crcNumber) : that.crcNumber != null) return false;
        if (agentContractId != null ? !agentContractId.equals(that.agentContractId) : that.agentContractId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = currencyType != null ? currencyType.hashCode() : 0;
        result = 31 * result + (surcharge ? 1 : 0);
        result = 31 * result + premiumChargedSum;
        result = 31 * result + (agent != null ? agent.hashCode() : 0);
        result = 31 * result + (agentRoleList != null ? agentRoleList.hashCode() : 0);
        result = 31 * result + (secondaryAgentsList != null ? secondaryAgentsList.hashCode() : 0);
        result = 31 * result + (statementDate != null ? statementDate.hashCode() : 0);
        result = 31 * result + (isCftPayInsEnabled ? 1 : 0);
        result = 31 * result + (branch != null ? branch.hashCode() : 0);
        result = 31 * result + (saleChannelList != null ? saleChannelList.hashCode() : 0);
        result = 31 * result + (sapActiveDate != null ? sapActiveDate.hashCode() : 0);
        result = 31 * result + (paymentType != null ? paymentType.hashCode() : 0);
        result = 31 * result + (factAccruedPremiumDateStartDate != null ? factAccruedPremiumDateStartDate.hashCode() : 0);
        result = 31 * result + (saleGroup != null ? saleGroup.hashCode() : 0);
        result = 31 * result + (sysEditor != null ? sysEditor.hashCode() : 0);
        result = 31 * result + (autoDealer != null ? autoDealer.hashCode() : 0);
        result = 31 * result + (isStartMigrationEnrichment ? 1 : 0);
        result = 31 * result + (isShowAllCommissionsDisabled ? 1 : 0);
        result = 31 * result + (statementNumber != null ? statementNumber.hashCode() : 0);
        result = 31 * result + (activeAgentRolesDate != null ? activeAgentRolesDate.hashCode() : 0);
        result = 31 * result + (paymentStatus != null ? paymentStatus.hashCode() : 0);
        result = 31 * result + (epsDate != null ? epsDate.hashCode() : 0);
        result = 31 * result + (otherPartner != null ? otherPartner.hashCode() : 0);
        result = 31 * result + premiumCollectedSum;
        result = 31 * result + (startMatchingDate != null ? startMatchingDate.hashCode() : 0);
        result = 31 * result + (leasingCompany != null ? leasingCompany.hashCode() : 0);
        result = 31 * result + (newKvActive ? 1 : 0);
        result = 31 * result + (isActivateAgentFromAnotherBranch ? 1 : 0);
        result = 31 * result + (premiumChargeType != null ? premiumChargeType.hashCode() : 0);
        result = 31 * result + (agentStatementStatus != null ? agentStatementStatus.hashCode() : 0);
        result = 31 * result + (receivedPaymentList != null ? receivedPaymentList.hashCode() : 0);
        result = 31 * result + contractCount;
        result = 31 * result + (saleChannel != null ? saleChannel.hashCode() : 0);
        result = 31 * result + liabilitySum;
        result = 31 * result + (isManualMatch ? 1 : 0);
        result = 31 * result + (bankIntermediary != null ? bankIntermediary.hashCode() : 0);
        result = 31 * result + paymentCount;
        result = 31 * result + (sapMigrationReasonCode != null ? sapMigrationReasonCode.hashCode() : 0);
        result = 31 * result + (commentary != null ? commentary.hashCode() : 0);
        result = 31 * result + (crcNumber != null ? crcNumber.hashCode() : 0);
        result = 31 * result + (agentContractId != null ? agentContractId.hashCode() : 0);
        return result;
    }
}