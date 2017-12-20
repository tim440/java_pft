package ru.rgs.APITests.model.SearchVehicle.search;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.List;

import static java.util.Arrays.asList;

@Generated("com.robohorse.robopojogenerator")
public class VehicleSearch{

	@SerializedName("constraints")
	private List<ConstraintsItem> constraints;

	public VehicleSearch() {
		this.constraints = asList(new ConstraintsItem("ownerId", "72018b23cdb509fb111e7a927", "eq"),
                new ConstraintsItem("brandId", "002", "eq"));
	}

	public List<ConstraintsItem> getConstraints(){
		return constraints;
	}

	@Override
 	public String toString(){
		return 
			"VehicleSearch{" + 
			"constraints = '" + constraints + '\'' + 
			"}";
		}
}