package ru.rgs.APITests.model.SearchInsurer.InsurerFull;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class AdditionalAddress{

	@SerializedName("zip")
	private String zip;

	@SerializedName("country")
	private Country country;

	@SerializedName("addressType")
	private AddressType addressType;

	@SerializedName("flatNumber")
	private String flatNumber;

	@SerializedName("kladrStreet")
	private KladrStreet kladrStreet;

	@SerializedName("exactAddress")
	private String exactAddress;

	@SerializedName("houseNumber")
	private String houseNumber;

	@SerializedName("isNotStreet")
	private String isNotStreet;

	@SerializedName("buildingNumber")
	private String buildingNumber;

	@SerializedName("id")
	private String id;

	@SerializedName("structureNumber")
	private String structureNumber;

	@SerializedName("territory")
	private Territory territory;

	public String getZip(){
		return zip;
	}

	public Country getCountry(){
		return country;
	}

	public AddressType getAddressType(){
		return addressType;
	}

	public String getFlatNumber(){
		return flatNumber;
	}

	public KladrStreet getKladrStreet(){
		return kladrStreet;
	}

	public String getExactAddress(){
		return exactAddress;
	}

	public String getHouseNumber(){
		return houseNumber;
	}

	public String getIsNotStreet(){
		return isNotStreet;
	}

	public String getBuildingNumber(){
		return buildingNumber;
	}

	public String getId(){
		return id;
	}

	public String getStructureNumber(){
		return structureNumber;
	}

	public Territory getTerritory(){
		return territory;
	}

	@Override
 	public String toString(){
		return 
			"AdditionalAddress{" + 
			"zip = '" + zip + '\'' + 
			",country = '" + country + '\'' + 
			",addressType = '" + addressType + '\'' + 
			",flatNumber = '" + flatNumber + '\'' + 
			",kladrStreet = '" + kladrStreet + '\'' + 
			",exactAddress = '" + exactAddress + '\'' + 
			",houseNumber = '" + houseNumber + '\'' + 
			",isNotStreet = '" + isNotStreet + '\'' + 
			",buildingNumber = '" + buildingNumber + '\'' + 
			",id = '" + id + '\'' + 
			",structureNumber = '" + structureNumber + '\'' + 
			",territory = '" + territory + '\'' + 
			"}";
		}
}