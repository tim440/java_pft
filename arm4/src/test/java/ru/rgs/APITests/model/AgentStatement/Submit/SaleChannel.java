package ru.rgs.APITests.model.AgentStatement.Submit;

import com.google.gson.annotations.SerializedName;
import ru.rgs.APITests.model.AgentStatement.Create.AgentStatementCreate;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class SaleChannel{

	@SerializedName("id")
	private String id;

	@SerializedName("codeAndName")
	private String codeAndName;

	public SaleChannel(AgentStatementCreate agentStatementCreate) {
		this.id = agentStatementCreate.getCreateOperationResult().getCreateObject().getAgentStatement().getSaleChannel().getId();
		this.codeAndName = agentStatementCreate.getCreateOperationResult().getCreateObject().getAgentStatement().getSaleChannel().getCodeAndName();
	}

    public String getId(){
		return id;
	}

	public String getCodeAndName(){
		return codeAndName;
	}

	@Override
 	public String toString(){
		return 
			"SaleChannel{" + 
			"id = '" + id + '\'' + 
			",codeAndName = '" + codeAndName + '\'' + 
			"}";
		}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SaleChannel that = (SaleChannel) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (codeAndName != null ? !codeAndName.equals(that.codeAndName) : that.codeAndName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (codeAndName != null ? codeAndName.hashCode() : 0);
        return result;
    }
}