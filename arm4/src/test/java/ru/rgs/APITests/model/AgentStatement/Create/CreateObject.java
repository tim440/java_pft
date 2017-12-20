package ru.rgs.APITests.model.AgentStatement.Create;

import com.google.gson.annotations.SerializedName;
import ru.rgs.APITests.model.AgentStatement.ContractTypeListItem;

import javax.annotation.Generated;
import java.util.List;

@Generated("com.robohorse.robopojogenerator")
public class CreateObject{

	@SerializedName("contractTypeList")
	private List<ContractTypeListItem> contractTypeList;

	@SerializedName("existActiveAsyncRequest")
	private String existActiveAsyncRequest;

	@SerializedName("agentStatement")
	private AgentStatement agentStatement;

	@SerializedName("office")
	private Office office;

	public List<ContractTypeListItem> getContractTypeList(){
		return contractTypeList;
	}

	public String getExistActiveAsyncRequest(){
		return existActiveAsyncRequest;
	}

	public AgentStatement getAgentStatement(){
		return agentStatement;
	}

	public Office getOffice(){
		return office;
	}

	@Override
 	public String toString(){
		return 
			"CreateObject{" + 
			"contractTypeList = '" + contractTypeList + '\'' + 
			",existActiveAsyncRequest = '" + existActiveAsyncRequest + '\'' + 
			",agentStatement = '" + agentStatement + '\'' + 
			",office = '" + office + '\'' + 
			"}";
		}
}