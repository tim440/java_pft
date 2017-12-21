package ru.rgs.APITests.model.contracts.osago.submit;

import com.google.gson.annotations.SerializedName;
import ru.rgs.APITests.model.contracts.osago.create.OsagoCreate;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Product{

	@SerializedName("code")
	private String code;

	@SerializedName("name")
	private String name;

	@SerializedName("personRole")
	private PersonRole personRole;

	@SerializedName("id")
	private String id;

	public Product(OsagoCreate osagoCreate) {
		this.code = osagoCreate.getCreateOperationResult().getCreateObject().getProduct().getCode();
		this.name = osagoCreate.getCreateOperationResult().getCreateObject().getProduct().getName();
		this.personRole = new PersonRole(osagoCreate);
		this.id = osagoCreate.getCreateOperationResult().getCreateObject().getProduct().getId();
	}

	public String getCode(){
		return code;
	}

	public String getName(){
		return name;
	}

	public PersonRole getPersonRole(){
		return personRole;
	}

	public String getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"Product{" + 
			"code = '" + code + '\'' + 
			",name = '" + name + '\'' + 
			",personRole = '" + personRole + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}