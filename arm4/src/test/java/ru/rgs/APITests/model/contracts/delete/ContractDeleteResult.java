package ru.rgs.APITests.model.contracts.delete;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class ContractDeleteResult {

	@SerializedName("success")
	private boolean success;

	@SerializedName("deletionResult")
	private DeletionResult deletionResult;

	public boolean isSuccess(){
		return success;
	}

	public DeletionResult getDeletionResult(){
		return deletionResult;
	}

	@Override
 	public String toString(){
		return 
			"ContractDeleteResult{" +
			"success = '" + success + '\'' + 
			",deletionResult = '" + deletionResult + '\'' + 
			"}";
		}
}