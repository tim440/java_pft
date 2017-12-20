package ru.rgs.APITests.model.AgentStatement.Submit;

import com.google.gson.annotations.SerializedName;
import ru.rgs.APITests.model.AgentStatement.Create.AgentStatementCreate;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class SaleGroup{

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private String id;

	public SaleGroup(AgentStatementCreate agentStatementCreate) {
		this.name = agentStatementCreate.getCreateOperationResult().getCreateObject().getAgentStatement().getSaleGroup().getName();
		this.id = agentStatementCreate.getCreateOperationResult().getCreateObject().getAgentStatement().getSaleGroup().getId();
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
			"SaleGroup{" + 
			"name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SaleGroup saleGroup = (SaleGroup) o;

        if (name != null ? !name.equals(saleGroup.name) : saleGroup.name != null) return false;
        if (id != null ? !id.equals(saleGroup.id) : saleGroup.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        return result;
    }
}