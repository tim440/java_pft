package ru.rgs.APITests.model.AgentStatement.Create;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class CreateOperationResult{

	@SerializedName("createObject")
	private CreateObject createObject;

	public CreateObject getCreateObject(){
		return createObject;
	}

	@Override
 	public String toString(){
		return 
			"CreateOperationResult{" + 
			"createObject = '" + createObject + '\'' + 
			"}";
		}
}