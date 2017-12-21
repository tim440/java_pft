package ru.rgs.APITests.model.SearchInsurer.Request;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.List;

import static java.util.Arrays.asList;

@Generated("com.robohorse.robopojogenerator")
public class RequestInsurer {

	@SerializedName("constraints")
	private List<ConstraintsItem> constraints;

	public List<ConstraintsItem> getConstraints(){
		return constraints;
	}

	public RequestInsurer(String type, String fio) {
		this.constraints = asList(new ConstraintsItem(new EqualsIgnoreCase("personTypeCode", type)),
				new ConstraintsItem(new EqualsIgnoreCase("displayName", fio)));
	}

	@Override
 	public String toString(){
		return 
			"RequestInsurer{" +
			"constraints = '" + constraints + '\'' + 
			"}";
		}
}