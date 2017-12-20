package ru.rgs.APITests.model.SearchVehicle.full;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class MainClientReference{

	@SerializedName("displayName")
	private String displayName;

	@SerializedName("id")
	private String id;

	@SerializedName("subjectType")
	private SubjectType subjectType;

	public String getDisplayName(){
		return displayName;
	}

	public String getId(){
		return id;
	}

	public SubjectType getSubjectType(){
		return subjectType;
	}

	@Override
 	public String toString(){
		return 
			"MainClientReference{" + 
			"displayName = '" + displayName + '\'' + 
			",id = '" + id + '\'' + 
			",subjectType = '" + subjectType + '\'' + 
			"}";
		}
}