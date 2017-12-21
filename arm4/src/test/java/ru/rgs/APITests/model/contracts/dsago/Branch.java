package ru.rgs.APITests.model.contracts.dsago;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Branch{

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private String id;

	@SerializedName("holdingCompany")
	private HoldingCompany holdingCompany;

	@SerializedName("bid")
	private String bid;

	@SerializedName("countrySubjectId")
	private String countrySubjectId;

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

	public void setHoldingCompany(HoldingCompany holdingCompany){
		this.holdingCompany = holdingCompany;
	}

	public HoldingCompany getHoldingCompany(){
		return holdingCompany;
	}

	public void setBid(String bid){
		this.bid = bid;
	}

	public String getBid(){
		return bid;
	}

	public void setCountrySubjectId(String countrySubjectId){
		this.countrySubjectId = countrySubjectId;
	}

	public String getCountrySubjectId(){
		return countrySubjectId;
	}

	@Override
 	public String toString(){
		return 
			"Branch{" + 
			"name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",holdingCompany = '" + holdingCompany + '\'' + 
			",bid = '" + bid + '\'' + 
			",countrySubjectId = '" + countrySubjectId + '\'' + 
			"}";
		}
}