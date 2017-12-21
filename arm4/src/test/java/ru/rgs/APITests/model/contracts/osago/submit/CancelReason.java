package ru.rgs.APITests.model.contracts.osago.submit;

import com.google.gson.annotations.SerializedName;
import ru.rgs.APITests.model.contracts.osago.create.CreateObject;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class CancelReason{

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private String id;

	public CancelReason(CreateObject createObject) {
		this.name = createObject.getCurrentContractChange().getCancelReason().getName();
		this.id = createObject.getCurrentContractChange().getCancelReason().getId();
	}

	public String getName(){
		return name;
	}

	public String getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"CancelReason{" + 
			",name = '" + name + '\'' +
			",id = '" + id + '\'' + 
			"}";
		}
}