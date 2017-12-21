package ru.rgs.APITests.model.SearchVehicle.full;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Product{

	@SerializedName("code")
	private String code;

	@SerializedName("endDate")
	private String endDate;

	@SerializedName("contractType")
	private ContractType contractType;

	@SerializedName("sortOrder")
	private String sortOrder;

	@SerializedName("name")
	private String name;

	@SerializedName("personRole")
	private PersonRole personRole;

	@SerializedName("id")
	private String id;

	@SerializedName("productNumber")
	private String productNumber;

	@SerializedName("startDate")
	private String startDate;

	@SerializedName("codeAndName")
	private String codeAndName;

	@SerializedName("productType")
	private ProductType productType;

	public String getCode(){
		return code;
	}

	public String getEndDate(){
		return endDate;
	}

	public ContractType getContractType(){
		return contractType;
	}

	public String getSortOrder(){
		return sortOrder;
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

	public String getProductNumber(){
		return productNumber;
	}

	public String getStartDate(){
		return startDate;
	}

	public String getCodeAndName(){
		return codeAndName;
	}

	public ProductType getProductType(){
		return productType;
	}

	@Override
 	public String toString(){
		return 
			"Product{" + 
			"code = '" + code + '\'' + 
			",endDate = '" + endDate + '\'' + 
			",contractType = '" + contractType + '\'' + 
			",sortOrder = '" + sortOrder + '\'' + 
			",name = '" + name + '\'' + 
			",personRole = '" + personRole + '\'' + 
			",id = '" + id + '\'' + 
			",productNumber = '" + productNumber + '\'' + 
			",startDate = '" + startDate + '\'' + 
			",codeAndName = '" + codeAndName + '\'' + 
			",productType = '" + productType + '\'' + 
			"}";
		}
}