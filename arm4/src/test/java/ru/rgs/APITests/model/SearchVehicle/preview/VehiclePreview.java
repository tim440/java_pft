package ru.rgs.APITests.model.SearchVehicle.preview;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.List;

@Generated("com.robohorse.robopojogenerator")
public class VehiclePreview{

	@SerializedName("offset")
	private String offset;

	@SerializedName("success")
	private boolean success;

	@SerializedName("dataList")
	private List<Vehicle> vehicles;

	@SerializedName("totalLength")
	private String totalLength;

	public String getOffset(){
		return offset;
	}

	public boolean isSuccess(){
		return success;
	}

	public List<Vehicle> getVehicles(){
		return vehicles;
	}

	public String getTotalLength(){
		return totalLength;
	}

	@Override
 	public String toString(){
		return 
			"VehiclePreview{" + 
			"offset = '" + offset + '\'' + 
			",success = '" + success + '\'' + 
			",vehicles = '" + vehicles + '\'' +
			",totalLength = '" + totalLength + '\'' + 
			"}";
		}
}