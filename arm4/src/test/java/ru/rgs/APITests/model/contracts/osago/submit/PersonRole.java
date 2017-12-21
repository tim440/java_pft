package ru.rgs.APITests.model.contracts.osago.submit;

import com.google.gson.annotations.SerializedName;
import ru.rgs.APITests.model.contracts.osago.create.*;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class PersonRole{

	@SerializedName("code")
	private String code;

	public PersonRole(OsagoCreate osagoCreate) {
		this.code = osagoCreate.getCreateOperationResult().getCreateObject().getProduct().getPersonRole().getCode();
	}

	public String getCode(){
		return code;
	}

	@Override
 	public String toString(){
		return 
			"PersonRole{" + 
			"code = '" + code + '\'' + 
			"}";
		}
}