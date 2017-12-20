package ru.rgs.APITests.model.contracts.saveResult;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class SaveResult{

	@SerializedName("modificationResult")
	private ModificationResult modificationResult;

	@SerializedName("success")
	private boolean success;

	public ModificationResult getModificationResult(){
		return modificationResult;
	}

	public boolean isSuccess(){
		return success;
	}

	@Override
 	public String toString(){
		return 
			"SaveResult{" + 
			"modificationResult = '" + modificationResult + '\'' + 
			",success = '" + success + '\'' + 
			"}";
		}
}