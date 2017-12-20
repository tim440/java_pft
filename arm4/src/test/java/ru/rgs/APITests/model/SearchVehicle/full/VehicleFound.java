package ru.rgs.APITests.model.SearchVehicle.full;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.List;

@Generated("com.robohorse.robopojogenerator")
public class VehicleFound{

	@SerializedName("success")
	private boolean success;

	@SerializedName("dataList")
	private List<VehicleFull> vehicles;

	@SerializedName("totalLength")
	private int totalLength;

	public boolean isSuccess(){
		return success;
	}

	public List<VehicleFull> getVehicles(){
		return vehicles;
	}

	public int getTotalLength(){
		return totalLength;
	}

	@Override
 	public String toString(){
		return 
			"VehicleFull{" + 
			"success = '" + success + '\'' + 
			",vehicles = '" + vehicles + '\'' +
			",totalLength = '" + totalLength + '\'' + 
			"}";
		}
}