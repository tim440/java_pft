package ru.rgs.APITests.model.contracts.osago.submit;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class PremiumChargeType{

	@SerializedName("code")
	private String code;

	public PremiumChargeType() {
		this.code = "1";
	}

	public String getCode(){
		return code;
	}

	@Override
 	public String toString(){
		return 
			"PremiumChargeType{" + 
			"code = '" + code + '\'' + 
			"}";
		}
}