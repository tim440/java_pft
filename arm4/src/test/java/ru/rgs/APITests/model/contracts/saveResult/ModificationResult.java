package ru.rgs.APITests.model.contracts.saveResult;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class ModificationResult{

	@SerializedName("details")
	private Details details;

	@SerializedName("id")
	private String id;

	@SerializedName("lastModified")
	private String lastModified;

	public Details getDetails(){
		return details;
	}

	public String getId(){
		return id;
	}

	public String getLastModified(){
		return lastModified;
	}

	@Override
 	public String toString(){
		return 
			"ModificationResult{" + 
			"details = '" + details + '\'' + 
			",id = '" + id + '\'' + 
			",lastModified = '" + lastModified + '\'' + 
			"}";
		}
}