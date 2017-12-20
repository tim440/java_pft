package ru.rgs.APITests.model.SearchVehicle.full;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.List;

@Generated("com.robohorse.robopojogenerator")
public class VehicleFull {

	@SerializedName("displayName")
	private String displayName;

	@SerializedName("enginePowerHp")
	private String enginePowerHp;

	@SerializedName("subjectType")
	private SubjectType subjectType;

	@SerializedName("isNotVinSpecified")
	private String isNotVinSpecified;

	@SerializedName("enginePowerKw")
	private String enginePowerKw;

	@SerializedName("sysEditor")
	private String sysEditor;

	@SerializedName("contractList")
	private List<ContractListItem> contractList;

	@SerializedName("model")
	private Model model;

	@SerializedName("vin")
	private String vin;

	@SerializedName("id")
	private String id;

	@SerializedName("lastModified")
	private String lastModified;

	@SerializedName("bid")
	private String bid;

	@SerializedName("brand")
	private Brand brand;

	@SerializedName("vehicleType")
	private VehicleType vehicleType;

	@SerializedName("constructionDate")
	private String constructionDate;

	public String getDisplayName(){
		return displayName;
	}

	public String getEnginePowerHp(){
		return enginePowerHp;
	}

	public SubjectType getSubjectType(){
		return subjectType;
	}

	public String getIsNotVinSpecified(){
		return isNotVinSpecified;
	}

	public String getEnginePowerKw(){
		return enginePowerKw;
	}

	public String getSysEditor(){
		return sysEditor;
	}

	public List<ContractListItem> getContractList(){
		return contractList;
	}

	public Model getModel(){
		return model;
	}

	public String getVin(){
		return vin;
	}

	public String getId(){
		return id;
	}

	public String getLastModified(){
		return lastModified;
	}

	public String getBid(){
		return bid;
	}

	public Brand getBrand(){
		return brand;
	}

	public VehicleType getVehicleType(){
		return vehicleType;
	}

	public String getConstructionDate(){
		return constructionDate;
	}

	@Override
 	public String toString(){
		return 
			"VehicleFound{" +
			"displayName = '" + displayName + '\'' + 
			",enginePowerHp = '" + enginePowerHp + '\'' + 
			",subjectType = '" + subjectType + '\'' + 
			",isNotVinSpecified = '" + isNotVinSpecified + '\'' + 
			",enginePowerKw = '" + enginePowerKw + '\'' + 
			",sysEditor = '" + sysEditor + '\'' + 
			",contractList = '" + contractList + '\'' + 
			",model = '" + model + '\'' + 
			",vin = '" + vin + '\'' + 
			",id = '" + id + '\'' + 
			",lastModified = '" + lastModified + '\'' + 
			",bid = '" + bid + '\'' + 
			",brand = '" + brand + '\'' + 
			",vehicleType = '" + vehicleType + '\'' + 
			",constructionDate = '" + constructionDate + '\'' + 
			"}";
		}
}