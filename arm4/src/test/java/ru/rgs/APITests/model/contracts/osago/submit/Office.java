package ru.rgs.APITests.model.contracts.osago.submit;

import com.google.gson.annotations.SerializedName;
import ru.rgs.APITests.model.contracts.osago.create.OsagoCreate;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Office{

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private String id;

	public Office(OsagoCreate osagoCreate) {
		this.id = osagoCreate.getCreateOperationResult().getCreateObject().getOffice().getId();
		this.name = osagoCreate.getCreateOperationResult().getCreateObject().getOffice().getName();
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
}