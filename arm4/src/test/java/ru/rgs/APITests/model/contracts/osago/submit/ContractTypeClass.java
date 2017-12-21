package ru.rgs.APITests.model.contracts.osago.submit;

import com.google.gson.annotations.SerializedName;
import ru.rgs.APITests.model.contracts.osago.create.OsagoCreate;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ContractTypeClass{

	@SerializedName("code")
	private String code;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private String id;

	public ContractTypeClass(OsagoCreate osagoCreate) {
		this.code = osagoCreate.getCreateOperationResult().getCreateObject().getContractTypeClass().getCode();
		this.name = osagoCreate.getCreateOperationResult().getCreateObject().getContractTypeClass().getName();
		this.id = osagoCreate.getCreateOperationResult().getCreateObject().getContractTypeClass().getId();
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

	@Override
 	public String toString(){
		return 
			"ContractTypeClass{" + 
			"code = '" + code + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}