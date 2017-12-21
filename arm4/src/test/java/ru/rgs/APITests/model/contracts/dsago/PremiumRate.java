package ru.rgs.APITests.model.contracts.dsago;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class PremiumRate{

	@SerializedName("rateForOne")
	private Object rateForOne;

	public void setRateForOne(Object rateForOne){
		this.rateForOne = rateForOne;
	}

	public Object getRateForOne(){
		return rateForOne;
	}

	@Override
 	public String toString(){
		return 
			"PremiumRate{" + 
			"rateForOne = '" + rateForOne + '\'' + 
			"}";
		}
}