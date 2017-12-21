package ru.rgs.APITests.model.AgentStatement.Submit;

import com.google.gson.annotations.SerializedName;
import ru.rgs.APITests.model.AgentStatement.Create.AgentStatementCreate;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Office{

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private String id;

	public Office(AgentStatementCreate agentStatementCreate) {
		this.id = agentStatementCreate.getCreateOperationResult().getCreateObject().getOffice().getId();
		this.name = agentStatementCreate.getCreateOperationResult().getCreateObject().getOffice().getName();
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
			"Office{" + 
			"name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Office office = (Office) o;

        if (name != null ? !name.equals(office.name) : office.name != null) return false;
        if (id != null ? !id.equals(office.id) : office.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        return result;
    }
}