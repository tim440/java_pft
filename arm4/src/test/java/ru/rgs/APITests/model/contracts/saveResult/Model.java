package ru.rgs.APITests.model.contracts.saveResult;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Model{

	@SerializedName("vehicleGroup")
	private VehicleGroup vehicleGroup;

	@SerializedName("code")
	private String code;

	@SerializedName("endDate")
	private String endDate;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private String id;

	@SerializedName("brand")
	private Brand brand;

	@SerializedName("startDate")
	private String startDate;

	@SerializedName("codeAndName")
	private String codeAndName;

	@SerializedName("vehicleType")
	private VehicleType vehicleType;

	public VehicleGroup getVehicleGroup(){
		return vehicleGroup;
	}

	public String getCode(){
		return code;
	}

	public String getEndDate(){
		return endDate;
	}

	public String getName(){
		return name;
	}

	public String getId(){
		return id;
	}

	public Brand getBrand(){
		return brand;
	}

	public String getStartDate(){
		return startDate;
	}

	public String getCodeAndName(){
		return codeAndName;
	}

	public VehicleType getVehicleType(){
		return vehicleType;
	}

	@Override
 	public String toString(){
		return 
			"Model{" + 
			"vehicleGroup = '" + vehicleGroup + '\'' + 
			",code = '" + code + '\'' + 
			",endDate = '" + endDate + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",brand = '" + brand + '\'' + 
			",startDate = '" + startDate + '\'' + 
			",codeAndName = '" + codeAndName + '\'' + 
			",vehicleType = '" + vehicleType + '\'' + 
			"}";
		}
}