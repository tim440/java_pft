package ru.rgs.APITests.model.contracts.saveResult;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class SaleChannel{

	@SerializedName("code")
	private String code;

	@SerializedName("endDate")
	private String endDate;

	@SerializedName("sortOrder")
	private String sortOrder;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private String id;

	@SerializedName("isLeaf")
	private String isLeaf;

	@SerializedName("parentId")
	private String parentId;

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

	public String getSortOrder(){
		return sortOrder;
	}

	public String getName(){
		return name;
	}

	public String getId(){
		return id;
	}

	public String getIsLeaf(){
		return isLeaf;
	}

	public String getParentId(){
		return parentId;
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
			"SaleChannel{" + 
			"code = '" + code + '\'' + 
			",endDate = '" + endDate + '\'' + 
			",sortOrder = '" + sortOrder + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",isLeaf = '" + isLeaf + '\'' + 
			",parentId = '" + parentId + '\'' + 
			",startDate = '" + startDate + '\'' + 
			",codeAndName = '" + codeAndName + '\'' + 
			"}";
		}
}