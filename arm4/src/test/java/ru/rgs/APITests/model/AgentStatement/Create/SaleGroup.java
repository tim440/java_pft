package ru.rgs.APITests.model.AgentStatement.Create;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class SaleGroup{

	@SerializedName("sysEditor")
	private String sysEditor;

	@SerializedName("endDate")
	private String endDate;

	@SerializedName("sysSource")
	private String sysSource;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private String id;

	@SerializedName("startDate")
	private String startDate;

	public String getSysEditor(){
		return sysEditor;
	}

	public String getEndDate(){
		return endDate;
	}

	public String getSysSource(){
		return sysSource;
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

	@Override
 	public String toString(){
		return 
			"SaleGroup{" + 
			"sysEditor = '" + sysEditor + '\'' + 
			",endDate = '" + endDate + '\'' + 
			",sysSource = '" + sysSource + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",startDate = '" + startDate + '\'' + 
			"}";
		}
}