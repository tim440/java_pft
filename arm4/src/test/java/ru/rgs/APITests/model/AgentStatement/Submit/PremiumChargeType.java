package ru.rgs.APITests.model.AgentStatement.Submit;

import com.google.gson.annotations.SerializedName;
import ru.rgs.APITests.model.AgentStatement.Create.AgentStatementCreate;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class PremiumChargeType{

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private String id;

	public PremiumChargeType(AgentStatementCreate agentStatementCreate) {
		this.name = agentStatementCreate.getCreateOperationResult().getCreateObject().getAgentStatement().getPremiumChargeType().getName();
		this.id = agentStatementCreate.getCreateOperationResult().getCreateObject().getAgentStatement().getPremiumChargeType().getId();
	}

	public String getName(){
		return name;
	}

	public String getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"PremiumChargeType{" + 
			"name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		PremiumChargeType that = (PremiumChargeType) o;

		if (name != null ? !name.equals(that.name) : that.name != null) return false;
		if (id != null ? !id.equals(that.id) : that.id != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = name != null ? name.hashCode() : 0;
		result = 31 * result + (id != null ? id.hashCode() : 0);
		return result;
	}
}