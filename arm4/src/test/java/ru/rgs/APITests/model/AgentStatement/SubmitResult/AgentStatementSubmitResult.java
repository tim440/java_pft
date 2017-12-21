package ru.rgs.APITests.model.AgentStatement.SubmitResult;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class AgentStatementSubmitResult{

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
			"AgentStatementSubmitResult{" + 
			"modificationResult = '" + modificationResult + '\'' + 
			",success = '" + success + '\'' + 
			"}";
		}
}