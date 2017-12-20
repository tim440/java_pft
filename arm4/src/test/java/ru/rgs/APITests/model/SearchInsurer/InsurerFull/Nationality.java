package ru.rgs.APITests.model.SearchInsurer.InsurerFull;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Nationality{

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

	public String getLiteralDnsId(){
		return literalDnsId;
	}

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

	public String getShortName(){
		return shortName;
	}

	public String getStartDate(){
		return startDate;
	}

	public String getCodeAndName(){
		return codeAndName;
	}

	public String getLiteralIsoId(){
		return literalIsoId;
	}

	@Override
 	public String toString(){
		return 
			"Nationality{" + 
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