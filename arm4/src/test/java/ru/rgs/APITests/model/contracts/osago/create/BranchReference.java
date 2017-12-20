package ru.rgs.APITests.model.contracts.osago.create;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class BranchReference{

	@SerializedName("displayName")
	private String displayName;

	@SerializedName("id")
	private String id;

	@SerializedName("bid")
	private String bid;

	public String getDisplayName(){
		return displayName;
	}

	public String getId(){
		return id;
	}

	public String getBid(){
		return bid;
	}

	@Override
 	public String toString(){
		return 
			"BranchReference{" + 
			"displayName = '" + displayName + '\'' + 
			",id = '" + id + '\'' + 
			",bid = '" + bid + '\'' + 
			"}";
		}
}