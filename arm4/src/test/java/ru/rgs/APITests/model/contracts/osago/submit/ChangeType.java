package ru.rgs.APITests.model.contracts.osago.submit;

import com.google.gson.annotations.SerializedName;
import ru.rgs.APITests.model.contracts.osago.create.CreateObject;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ChangeType{

	@SerializedName("code")
	private String code;

	@SerializedName("name")
	private String name;

	public ChangeType(CreateObject createObject) {
		this.code = createObject.getCurrentContractChange().getChangeType().getCode();
		this.name = createObject.getCurrentContractChange().getChangeType().getName();
	}

    public String getCode(){
		return code;
	}

	public String getName(){
		return name;
	}

	@Override
 	public String toString(){
		return 
			"ChangeType{" + 
			"code = '" + code + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}