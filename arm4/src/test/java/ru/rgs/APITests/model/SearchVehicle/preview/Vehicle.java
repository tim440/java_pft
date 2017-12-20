package ru.rgs.APITests.model.SearchVehicle.preview;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Vehicle{

	@SerializedName("modelName")
	private String modelName;

	@SerializedName("brandName")
	private String brandName;

	@SerializedName("sysEditor")
	private String sysEditor;

	@SerializedName("ownerDisplayName")
	private String ownerDisplayName;

	@SerializedName("topBranchName")
	private String topBranchName;

	@SerializedName("branchName")
	private String branchName;

	@SerializedName("vin")
	private String vin;

	@SerializedName("id")
	private String id;

	@SerializedName("bid")
	private String bid;

	@SerializedName("vehicleTypeName")
	private String vehicleTypeName;

	@SerializedName("constructionDate")
	private String constructionDate;

	public String getModelName(){
		return modelName;
	}

	public String getBrandName(){
		return brandName;
	}

	public String getSysEditor(){
		return sysEditor;
	}

	public String getOwnerDisplayName(){
		return ownerDisplayName;
	}

	public String getTopBranchName(){
		return topBranchName;
	}

	public String getBranchName(){
		return branchName;
	}

	public String getVin(){
		return vin;
	}

	public String getId(){
		return id;
	}

	public String getBid(){
		return bid;
	}

	public String getVehicleTypeName(){
		return vehicleTypeName;
	}

	public String getConstructionDate(){
		return constructionDate;
	}

	@Override
 	public String toString(){
		return 
			"Vehicle{" +
			"modelName = '" + modelName + '\'' + 
			",brandName = '" + brandName + '\'' + 
			",sysEditor = '" + sysEditor + '\'' + 
			",ownerDisplayName = '" + ownerDisplayName + '\'' + 
			",topBranchName = '" + topBranchName + '\'' + 
			",branchName = '" + branchName + '\'' + 
			",vin = '" + vin + '\'' + 
			",id = '" + id + '\'' + 
			",bid = '" + bid + '\'' + 
			",vehicleTypeName = '" + vehicleTypeName + '\'' + 
			",constructionDate = '" + constructionDate + '\'' + 
			"}";
		}
}