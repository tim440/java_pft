package ru.rgs.APITests.model.contracts.osago.submit;

import com.google.gson.annotations.SerializedName;
import ru.rgs.APITests.model.contracts.osago.create.OsagoCreate;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class SaleChannel{

	@SerializedName("id")
	private String id;

	@SerializedName("codeAndName")
	private String codeAndName;

	@SerializedName("parentId")
	private String parentId;

	public SaleChannel(OsagoCreate osagoCreate) {
		this.id = osagoCreate.getCreateOperationResult().getCreateObject().getSaleChannel().getId();
		this.codeAndName = osagoCreate.getCreateOperationResult().getCreateObject().getSaleChannel().getCodeAndName();
		this.parentId = osagoCreate.getCreateOperationResult().getCreateObject().getSaleChannel().getParentId();
	}

	public String getId(){
		return id;
	}

	public String getCodeAndName(){
		return codeAndName;
	}

	public String getParentId(){
		return parentId;
	}

	@Override
 	public String toString(){
		return 
			"SaleChannel{" + 
			"id = '" + id + '\'' + 
			",codeAndName = '" + codeAndName + '\'' + 
			",parentId = '" + parentId + '\'' + 
			"}";
		}
}