package ru.rgs.APITests.model.SearchContract.search;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.List;

import static java.util.Arrays.asList;

@Generated("com.robohorse.robopojogenerator")
public class ContractSearch{

	@SerializedName("constraints")
	private List<ConstraintsItem> constraints;

	public ContractSearch(String series, String number) {
		this.constraints = asList(new ConstraintsItem("contractSeries", series),
				new ConstraintsItem("contractNumber", number));
	}

    public List<ConstraintsItem> getConstraints(){
		return constraints;
	}

	@Override
 	public String toString(){
		return 
			"ContractSearch{" + 
			"constraints = '" + constraints + '\'' + 
			"}";
		}
}