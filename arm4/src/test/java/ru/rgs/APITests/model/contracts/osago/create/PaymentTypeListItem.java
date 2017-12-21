package ru.rgs.APITests.model.contracts.osago.create;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class PaymentTypeListItem{

	@SerializedName("code")
	private String code;

	@SerializedName("endDate")
	private String endDate;

	//TODO исправить, когда будет исправлена бага
	@SerializedName("paymentDocuments")
	private /*List<PaymentDocumentsItem>*/ Object paymentDocuments;

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

	public String getEndDate(){
		return endDate;
	}

	public /*List<PaymentDocumentsItem>*/ Object getPaymentDocuments(){
		return paymentDocuments;
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
			"PaymentTypeListItem{" + 
			"code = '" + code + '\'' + 
			",endDate = '" + endDate + '\'' + 
			",paymentDocuments = '" + paymentDocuments + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",startDate = '" + startDate + '\'' + 
			",codeAndName = '" + codeAndName + '\'' + 
			"}";
		}
}