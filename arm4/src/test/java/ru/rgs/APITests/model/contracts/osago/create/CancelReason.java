package ru.rgs.APITests.model.contracts.osago.create;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class CancelReason{

	@SerializedName("code")
	private String code;

	@SerializedName("contractStatus")
	private ContractStatus contractStatus;

	@SerializedName("endDate")
	private String endDate;

	@SerializedName("contractClassId")
	private String contractClassId;

	@SerializedName("sortOrder")
	private String sortOrder;

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

	public ContractStatus getContractStatus(){
		return contractStatus;
	}

	public String getEndDate(){
		return endDate;
	}

	public String getContractClassId(){
		return contractClassId;
	}

	public String getSortOrder(){
		return sortOrder;
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
			"CancelReason{" + 
			"code = '" + code + '\'' + 
			",contractStatus = '" + contractStatus + '\'' + 
			",endDate = '" + endDate + '\'' + 
			",contractClassId = '" + contractClassId + '\'' + 
			",sortOrder = '" + sortOrder + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",startDate = '" + startDate + '\'' + 
			",codeAndName = '" + codeAndName + '\'' + 
			"}";
		}
}