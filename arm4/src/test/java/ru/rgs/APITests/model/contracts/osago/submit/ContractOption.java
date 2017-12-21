package ru.rgs.APITests.model.contracts.osago.submit;

import com.google.gson.annotations.SerializedName;
import ru.rgs.APITests.model.contracts.osago.create.OsagoCreate;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ContractOption{

	@SerializedName("code")
	private String code;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private String id;

	public ContractOption(OsagoCreate osagoCreate) {
		this.code = osagoCreate.getCreateOperationResult().getCreateObject().getContractOption().getCode();
		this.name = osagoCreate.getCreateOperationResult().getCreateObject().getContractOption().getName();
		this.id = osagoCreate.getCreateOperationResult().getCreateObject().getContractOption().getId();
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
			"ContractOption{" + 
			"code = '" + code + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}