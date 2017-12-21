package ru.rgs.APITests.model.AgentStatement;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class AgentStatementSaveResult {

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
			"AgentStatementSaveResult{" +
			"modificationResult = '" + modificationResult + '\'' + 
			",success = '" + success + '\'' + 
			"}";
		}
}