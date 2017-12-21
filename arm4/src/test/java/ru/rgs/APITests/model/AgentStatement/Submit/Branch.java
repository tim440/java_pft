package ru.rgs.APITests.model.AgentStatement.Submit;

import com.google.gson.annotations.SerializedName;
import ru.rgs.APITests.model.AgentStatement.Create.AgentStatementCreate;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Branch{

	@SerializedName("code")
	private String code;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private String id;

	@SerializedName("bid")
	private String bid;

	@SerializedName("countrySubjectId")
	private String countrySubjectId;

	public Branch(AgentStatementCreate agentStatementCreate) {
		this.bid = agentStatementCreate.getCreateOperationResult().getCreateObject().getAgentStatement().getBranch().getBid();
		this.name = agentStatementCreate.getCreateOperationResult().getCreateObject().getAgentStatement().getBranch().getName();
		this.id = agentStatementCreate.getCreateOperationResult().getCreateObject().getAgentStatement().getBranch().getId();
		this.code = agentStatementCreate.getCreateOperationResult().getCreateObject().getAgentStatement().getBranch().getCode();
		this.countrySubjectId = agentStatementCreate.getCreateOperationResult().getCreateObject().getAgentStatement().getBranch().getCountrySubjectId();
	}

    public String getCode(){
		return code;
	}

	public String getName(){
		return name;
	}

	public String getId(){
		return id;
	}

	public String getBid(){
		return bid;
	}

	public String getCountrySubjectId(){
		return countrySubjectId;
	}

	@Override
 	public String toString(){
		return 
			"Branch{" + 
			"code = '" + code + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",bid = '" + bid + '\'' + 
			",countrySubjectId = '" + countrySubjectId + '\'' + 
			"}";
		}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Branch branch = (Branch) o;

		if (code != null ? !code.equals(branch.code) : branch.code != null) return false;
		if (name != null ? !name.equals(branch.name) : branch.name != null) return false;
		if (id != null ? !id.equals(branch.id) : branch.id != null) return false;
		if (bid != null ? !bid.equals(branch.bid) : branch.bid != null) return false;
		if (countrySubjectId != null ? !countrySubjectId.equals(branch.countrySubjectId) : branch.countrySubjectId != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = code != null ? code.hashCode() : 0;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (id != null ? id.hashCode() : 0);
		result = 31 * result + (bid != null ? bid.hashCode() : 0);
		result = 31 * result + (countrySubjectId != null ? countrySubjectId.hashCode() : 0);
		return result;
	}
}