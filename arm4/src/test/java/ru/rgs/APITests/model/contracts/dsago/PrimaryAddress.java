package ru.rgs.APITests.model.contracts.dsago;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class PrimaryAddress{

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

	public void setZip(String zip){
		this.zip = zip;
	}

	public String getZip(){
		return zip;
	}

	public void setCountry(Country country){
		this.country = country;
	}

	public Country getCountry(){
		return country;
	}

	public void setAddressType(AddressType addressType){
		this.addressType = addressType;
	}

	public AddressType getAddressType(){
		return addressType;
	}

	public void setFlatNumber(String flatNumber){
		this.flatNumber = flatNumber;
	}

	public String getFlatNumber(){
		return flatNumber;
	}

	public void setKladrStreet(KladrStreet kladrStreet){
		this.kladrStreet = kladrStreet;
	}

	public KladrStreet getKladrStreet(){
		return kladrStreet;
	}

	public void setExactAddress(String exactAddress){
		this.exactAddress = exactAddress;
	}

	public String getExactAddress(){
		return exactAddress;
	}

	public void setHouseNumber(String houseNumber){
		this.houseNumber = houseNumber;
	}

	public String getHouseNumber(){
		return houseNumber;
	}

	public void setIsNotStreet(String isNotStreet){
		this.isNotStreet = isNotStreet;
	}

	public String getIsNotStreet(){
		return isNotStreet;
	}

	public void setBuildingNumber(String buildingNumber){
		this.buildingNumber = buildingNumber;
	}

	public String getBuildingNumber(){
		return buildingNumber;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setStructureNumber(String structureNumber){
		this.structureNumber = structureNumber;
	}

	public String getStructureNumber(){
		return structureNumber;
	}

	public void setTerritory(Territory territory){
		this.territory = territory;
	}

	public Territory getTerritory(){
		return territory;
	}

	@Override
 	public String toString(){
		return 
			"PrimaryAddress{" + 
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