package ru.rgs.APITests.model.AgentStatement.Create;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class AgentOfficeInfoListItem{

	@SerializedName("officeName")
	private String officeName;

	@SerializedName("address")
	private String address;

	@SerializedName("officeId")
	private String officeId;

	@SerializedName("endDate")
	private String endDate;

	@SerializedName("id")
	private String id;

	@SerializedName("startDate")
	private String startDate;

	public String getOfficeName(){
		return officeName;
	}

	public String getAddress(){
		return address;
	}

	public String getOfficeId(){
		return officeId;
	}

	public String getEndDate(){
		return endDate;
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
			"AgentOfficeInfoListItem{" + 
			"officeName = '" + officeName + '\'' + 
			",address = '" + address + '\'' + 
			",officeId = '" + officeId + '\'' + 
			",endDate = '" + endDate + '\'' + 
			",id = '" + id + '\'' + 
			",startDate = '" + startDate + '\'' + 
			"}";
		}
}