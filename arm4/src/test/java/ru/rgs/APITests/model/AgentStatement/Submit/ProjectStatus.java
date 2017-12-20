package ru.rgs.APITests.model.AgentStatement.Submit;

import com.google.gson.annotations.SerializedName;
import ru.rgs.APITests.model.AgentStatement.Create.AgentStatementCreate;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ProjectStatus {

	@SerializedName("code")
	private String code;

	@SerializedName("name")
	private String name;

	public ProjectStatus(AgentStatementCreate agentStatementCreate) {
		this.code = "";
		this.name = "";
	}

    public String getCode(){
		return code;
	}

	public String getName(){
		return name;
	}

	@Override
 	public String toString(){
		return 
			"PaymentStatus{" + 
			"code = '" + code + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProjectStatus that = (ProjectStatus) o;

        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = code != null ? code.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}