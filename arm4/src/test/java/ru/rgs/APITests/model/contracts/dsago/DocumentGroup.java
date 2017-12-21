package ru.rgs.APITests.model.contracts.dsago;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class DocumentGroup{

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

	@SerializedName("startDate")
	private String startDate;

	@SerializedName("codeAndName")
	private String codeAndName;

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public void setEndDate(String endDate){
		this.endDate = endDate;
	}

	public String getEndDate(){
		return endDate;
	}

	public void setSortOrder(String sortOrder){
		this.sortOrder = sortOrder;
	}

	public String getSortOrder(){
		return sortOrder;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setStartDate(String startDate){
		this.startDate = startDate;
	}

	public String getStartDate(){
		return startDate;
	}

	public void setCodeAndName(String codeAndName){
		this.codeAndName = codeAndName;
	}

	public String getCodeAndName(){
		return codeAndName;
	}

	@Override
 	public String toString(){
		return 
			"DocumentGroup{" + 
			"code = '" + code + '\'' + 
			",endDate = '" + endDate + '\'' + 
			",sortOrder = '" + sortOrder + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",startDate = '" + startDate + '\'' + 
			",codeAndName = '" + codeAndName + '\'' + 
			"}";
		}
}