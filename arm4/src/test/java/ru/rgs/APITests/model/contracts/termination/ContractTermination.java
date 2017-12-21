package ru.rgs.APITests.model.contracts.termination;

import com.google.gson.annotations.SerializedName;
import ru.rgs.APITests.model.SearchContract.preview.ContractPreview;

import javax.annotation.Generated;
import java.util.List;

import static java.util.Arrays.asList;

@Generated("com.robohorse.robopojogenerator")
public class ContractTermination{

	@SerializedName("acceptedWarnings")
	private List<Object> acceptedWarnings;

	@SerializedName("contractChange")
	private ContractChange contractChange;

	public ContractTermination(ContractPreview contractPreview) {
		this.acceptedWarnings = asList();
		this.contractChange = new ContractChange(contractPreview);
	}

	public List<Object> getAcceptedWarnings(){
		return acceptedWarnings;
	}

	public ContractChange getContractChange(){
		return contractChange;
	}

	@Override
 	public String toString(){
		return 
			"ContractTermination{" + 
			"acceptedWarnings = '" + acceptedWarnings + '\'' + 
			",contractChange = '" + contractChange + '\'' + 
			"}";
		}
}