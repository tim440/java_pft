package ru.rgs.APITests.model.AgentStatement.Submit;

import com.google.gson.annotations.SerializedName;
import ru.rgs.APITests.model.AgentStatement.ContractTypeListItem;
import ru.rgs.APITests.model.AgentStatement.Create.AgentStatementCreate;

import javax.annotation.Generated;
import java.util.List;

@Generated("com.robohorse.robopojogenerator")
public class AgentStatementSubmit {

	@SerializedName("premiumCollectedSumCalculated")
	private int premiumCollectedSumCalculated;

	@SerializedName("contractTypeList")
	private List<ContractTypeListItem> contractTypeList;

	@SerializedName("officeCount")
	private int officeCount;

	@SerializedName("totalComissionCalculated")
	private int totalComissionCalculated;

	@SerializedName("statementBlankWriteOffShortList")
	private String statementBlankWriteOffShortList;

	@SerializedName("agentDebtMoney")
	private int agentDebtMoney;

	@SerializedName("existActiveAsyncRequest")
	private boolean existActiveAsyncRequest;

	@SerializedName("agentStatement")
	private AgentStatement agentStatement;

	@SerializedName("office")
	private Office office;

	@SerializedName("paymentList")
	private String paymentList;

	@SerializedName("totalReceivedPaymentCalculated")
	private int totalReceivedPaymentCalculated;

	@SerializedName("contractCountCalculated")
	private int contractCountCalculated;

	@SerializedName("id")
	private String id;

	@SerializedName("statementContractList")
	private String statementContractList;

    public AgentStatementSubmit(AgentStatementCreate agentStatementCreate, String agentStatementDate, String agentStatementNumberFromDate, String currencyName, String currencyId, String paymentName, String paymentId) {
		this.id = "";
		this.agentStatement = new AgentStatement(agentStatementCreate, agentStatementNumberFromDate, agentStatementDate, currencyName, currencyId, paymentName, paymentId);
		this.office = new Office(agentStatementCreate);
		this.officeCount = 0;
		this.agentDebtMoney = 0;
		this.contractCountCalculated = 0;
		this.premiumCollectedSumCalculated = 0;
		this.totalReceivedPaymentCalculated = 0;
		this.existActiveAsyncRequest = false;
		this.totalComissionCalculated = 0;
		this.statementContractList = "";
		this.statementBlankWriteOffShortList = "";
		this.paymentList = "";
        this.contractTypeList = agentStatementCreate.getCreateOperationResult().getCreateObject().getContractTypeList();
	}

	public int getPremiumCollectedSumCalculated(){
		return premiumCollectedSumCalculated;
	}

	public List<ContractTypeListItem> getContractTypeList(){
		return contractTypeList;
	}

	public int getOfficeCount(){
		return officeCount;
	}

	public int getTotalComissionCalculated(){
		return totalComissionCalculated;
	}

	public String getStatementBlankWriteOffShortList(){
		return statementBlankWriteOffShortList;
	}

	public int getAgentDebtMoney(){
		return agentDebtMoney;
	}

	public boolean isExistActiveAsyncRequest(){
		return existActiveAsyncRequest;
	}

	public AgentStatement getAgentStatement(){
		return agentStatement;
	}

	public Office getOffice(){
		return office;
	}

	public String getPaymentList(){
		return paymentList;
	}

	public int getTotalReceivedPaymentCalculated(){
		return totalReceivedPaymentCalculated;
	}

	public int getContractCountCalculated(){
		return contractCountCalculated;
	}

	public String getId(){
		return id;
	}

	public String getStatementContractList(){
		return statementContractList;
	}

	@Override
 	public String toString(){
		return 
			"AgentStatementSubmit{" +
			"premiumCollectedSumCalculated = '" + premiumCollectedSumCalculated + '\'' + 
			",contractTypeList = '" + contractTypeList + '\'' + 
			",officeCount = '" + officeCount + '\'' + 
			",totalComissionCalculated = '" + totalComissionCalculated + '\'' + 
			",statementBlankWriteOffShortList = '" + statementBlankWriteOffShortList + '\'' + 
			",agentDebtMoney = '" + agentDebtMoney + '\'' + 
			",existActiveAsyncRequest = '" + existActiveAsyncRequest + '\'' + 
			",agentStatement = '" + agentStatement + '\'' + 
			",office = '" + office + '\'' + 
			",paymentList = '" + paymentList + '\'' + 
			",totalReceivedPaymentCalculated = '" + totalReceivedPaymentCalculated + '\'' + 
			",contractCountCalculated = '" + contractCountCalculated + '\'' + 
			",id = '" + id + '\'' + 
			",statementContractList = '" + statementContractList + '\'' + 
			"}";
		}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AgentStatementSubmit that = (AgentStatementSubmit) o;

        if (premiumCollectedSumCalculated != that.premiumCollectedSumCalculated) return false;
        if (officeCount != that.officeCount) return false;
        if (totalComissionCalculated != that.totalComissionCalculated) return false;
        if (agentDebtMoney != that.agentDebtMoney) return false;
        if (existActiveAsyncRequest != that.existActiveAsyncRequest) return false;
        if (totalReceivedPaymentCalculated != that.totalReceivedPaymentCalculated) return false;
        if (contractCountCalculated != that.contractCountCalculated) return false;
        if (contractTypeList != null ? !contractTypeList.equals(that.contractTypeList) : that.contractTypeList != null)
            return false;
        if (statementBlankWriteOffShortList != null ? !statementBlankWriteOffShortList.equals(that.statementBlankWriteOffShortList) : that.statementBlankWriteOffShortList != null)
            return false;
        if (agentStatement != null ? !agentStatement.equals(that.agentStatement) : that.agentStatement != null)
            return false;
        if (office != null ? !office.equals(that.office) : that.office != null) return false;
        if (paymentList != null ? !paymentList.equals(that.paymentList) : that.paymentList != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (statementContractList != null ? !statementContractList.equals(that.statementContractList) : that.statementContractList != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = premiumCollectedSumCalculated;
        result = 31 * result + (contractTypeList != null ? contractTypeList.hashCode() : 0);
        result = 31 * result + officeCount;
        result = 31 * result + totalComissionCalculated;
        result = 31 * result + (statementBlankWriteOffShortList != null ? statementBlankWriteOffShortList.hashCode() : 0);
        result = 31 * result + agentDebtMoney;
        result = 31 * result + (existActiveAsyncRequest ? 1 : 0);
        result = 31 * result + (agentStatement != null ? agentStatement.hashCode() : 0);
        result = 31 * result + (office != null ? office.hashCode() : 0);
        result = 31 * result + (paymentList != null ? paymentList.hashCode() : 0);
        result = 31 * result + totalReceivedPaymentCalculated;
        result = 31 * result + contractCountCalculated;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (statementContractList != null ? statementContractList.hashCode() : 0);
        return result;
    }
}