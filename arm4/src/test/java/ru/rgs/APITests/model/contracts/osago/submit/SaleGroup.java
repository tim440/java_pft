package ru.rgs.APITests.model.contracts.osago.submit;

import com.google.gson.annotations.SerializedName;
import ru.rgs.APITests.model.contracts.osago.create.OsagoCreate;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class SaleGroup{

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private String id;

	public SaleGroup(OsagoCreate osagoCreate) {
		this.name = osagoCreate.getCreateOperationResult().getCreateObject().getSaleGroup().getName();
		this.id = osagoCreate.getCreateOperationResult().getCreateObject().getSaleGroup().getId();
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
}