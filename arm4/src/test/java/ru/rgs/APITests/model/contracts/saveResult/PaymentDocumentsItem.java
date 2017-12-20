package ru.rgs.APITests.model.contracts.saveResult;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class PaymentDocumentsItem{

	@SerializedName("code")
	private String code;

	@SerializedName("paymentTypeId")
	private String paymentTypeId;

	@SerializedName("endDate")
	private String endDate;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private String id;

	@SerializedName("startDate")
	private String startDate;

	@SerializedName("codeAndName")
	private String codeAndName;

	public String getCode(){
		return code;
	}

	public String getPaymentTypeId(){
		return paymentTypeId;
	}

	public String getEndDate(){
		return endDate;
	}

	public String getName(){
		return name;
	}

	public String getId(){
		return id;
	}

	public String getStartDate(){
		return startDate;
	}

	public String getCodeAndName(){
		return codeAndName;
	}

	@Override
 	public String toString(){
		return 
			"PaymentDocumentsItem{" + 
			"code = '" + code + '\'' + 
			",paymentTypeId = '" + paymentTypeId + '\'' + 
			",endDate = '" + endDate + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",startDate = '" + startDate + '\'' + 
			",codeAndName = '" + codeAndName + '\'' + 
			"}";
		}
}