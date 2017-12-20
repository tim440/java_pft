package ru.rgs.APITests.model.contracts.osago.create;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class OsagoCreate {

	@SerializedName("createOperationResult")
	private CreateOperationResult createOperationResult;

	@SerializedName("success")
	private boolean success;

	public CreateOperationResult getCreateOperationResult(){
		return createOperationResult;
	}

	public boolean isSuccess(){
		return success;
	}

	@Override
 	public String toString(){
		return 
			"OsagoCreate{" +
			"createOperationResult = '" + createOperationResult + '\'' + 
			",success = '" + success + '\'' + 
			"}";
		}
}