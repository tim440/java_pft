package ru.rgs.APITests.model.contracts.osago.submit;

import com.google.gson.annotations.SerializedName;
import ru.rgs.APITests.model.contracts.osago.create.OsagoCreate;

import javax.annotation.Generated;

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

	public Branch(OsagoCreate osagoCreate) {
		this.name = osagoCreate.getCreateOperationResult().getCreateObject().getBranch().getName();
		this.id = osagoCreate.getCreateOperationResult().getCreateObject().getBranch().getId();
		this.holdingCompany = new HoldingCompany();
		this.bid = osagoCreate.getCreateOperationResult().getCreateObject().getBranch().getBid();
		this.countrySubjectId = osagoCreate.getCreateOperationResult().getCreateObject().getBranch().getCountrySubjectId();
	}

	public String getName(){
		return name;
	}

	public String getId(){
		return id;
	}

	public HoldingCompany getHoldingCompany(){
		return holdingCompany;
	}

	public String getBid(){
		return bid;
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