package ru.rgs.APITests.model.contracts.dsago;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Country{

	@SerializedName("literalDnsId")
	private String literalDnsId;

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

	@SerializedName("shortName")
	private String shortName;

	@SerializedName("startDate")
	private String startDate;

	@SerializedName("codeAndName")
	private String codeAndName;

	@SerializedName("literalIsoId")
	private String literalIsoId;

	public void setLiteralDnsId(String literalDnsId){
		this.literalDnsId = literalDnsId;
	}

	public String getLiteralDnsId(){
		return literalDnsId;
	}

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

	public void setShortName(String shortName){
		this.shortName = shortName;
	}

	public String getShortName(){
		return shortName;
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

	public void setLiteralIsoId(String literalIsoId){
		this.literalIsoId = literalIsoId;
	}

	public String getLiteralIsoId(){
		return literalIsoId;
	}

	@Override
 	public String toString(){
		return 
			"Country{" + 
			"literalDnsId = '" + literalDnsId + '\'' + 
			",code = '" + code + '\'' + 
			",endDate = '" + endDate + '\'' + 
			",sortOrder = '" + sortOrder + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",shortName = '" + shortName + '\'' + 
			",startDate = '" + startDate + '\'' + 
			",codeAndName = '" + codeAndName + '\'' + 
			",literalIsoId = '" + literalIsoId + '\'' + 
			"}";
		}
}