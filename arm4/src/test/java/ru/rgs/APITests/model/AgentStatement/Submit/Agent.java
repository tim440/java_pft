package ru.rgs.APITests.model.AgentStatement.Submit;

import com.google.gson.annotations.SerializedName;
import ru.rgs.APITests.model.AgentStatement.Create.AgentStatementCreate;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Agent{

	@SerializedName("isMultiChannel")
	private boolean isMultiChannel;

	@SerializedName("personDisplayName")
	private String personDisplayName;

	@SerializedName("agentCode")
	private String agentCode;

	@SerializedName("partnerWithCommission")
	private boolean partnerWithCommission;

	@SerializedName("personTypeCode")
	private String personTypeCode;

	@SerializedName("id")
	private String id;

	@SerializedName("broker")
	private boolean broker;

    public Agent(AgentStatementCreate agentStatementCreate) {
        this.isMultiChannel = Boolean.parseBoolean(agentStatementCreate.getCreateOperationResult().getCreateObject().getAgentStatement().getAgent().getIsMultiChannel());
        this.personDisplayName = agentStatementCreate.getCreateOperationResult().getCreateObject().getAgentStatement().getAgent().getPersonDisplayName();
        this.agentCode = agentStatementCreate.getCreateOperationResult().getCreateObject().getAgentStatement().getAgent().getAgentCode();
        this.partnerWithCommission = Boolean.parseBoolean(agentStatementCreate.getCreateOperationResult().getCreateObject().getAgentStatement().getAgent().getPartnerWithCommission());
        this.personTypeCode = agentStatementCreate.getCreateOperationResult().getCreateObject().getAgentStatement().getAgent().getPersonTypeCode();
        this.id = agentStatementCreate.getCreateOperationResult().getCreateObject().getAgentStatement().getAgent().getId();
        this.broker = Boolean.parseBoolean(agentStatementCreate.getCreateOperationResult().getCreateObject().getAgentStatement().getAgent().getBroker());
    }

    public boolean isIsMultiChannel(){
		return isMultiChannel;
	}

	public String getPersonDisplayName(){
		return personDisplayName;
	}

	public String getAgentCode(){
		return agentCode;
	}

	public boolean isPartnerWithCommission(){
		return partnerWithCommission;
	}

	public String getPersonTypeCode(){
		return personTypeCode;
	}

	public String getId(){
		return id;
	}

	public boolean isBroker(){
		return broker;
	}

	@Override
 	public String toString(){
		return 
			"Agent{" + 
			"isMultiChannel = '" + isMultiChannel + '\'' + 
			",personDisplayName = '" + personDisplayName + '\'' + 
			",agentCode = '" + agentCode + '\'' + 
			",partnerWithCommission = '" + partnerWithCommission + '\'' + 
			",personTypeCode = '" + personTypeCode + '\'' + 
			",id = '" + id + '\'' + 
			",broker = '" + broker + '\'' + 
			"}";
		}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Agent agent = (Agent) o;

        if (isMultiChannel != agent.isMultiChannel) return false;
        if (partnerWithCommission != agent.partnerWithCommission) return false;
        if (broker != agent.broker) return false;
        if (personDisplayName != null ? !personDisplayName.equals(agent.personDisplayName) : agent.personDisplayName != null)
            return false;
        if (agentCode != null ? !agentCode.equals(agent.agentCode) : agent.agentCode != null) return false;
        if (personTypeCode != null ? !personTypeCode.equals(agent.personTypeCode) : agent.personTypeCode != null)
            return false;
        if (id != null ? !id.equals(agent.id) : agent.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (isMultiChannel ? 1 : 0);
        result = 31 * result + (personDisplayName != null ? personDisplayName.hashCode() : 0);
        result = 31 * result + (agentCode != null ? agentCode.hashCode() : 0);
        result = 31 * result + (partnerWithCommission ? 1 : 0);
        result = 31 * result + (personTypeCode != null ? personTypeCode.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (broker ? 1 : 0);
        return result;
    }
}