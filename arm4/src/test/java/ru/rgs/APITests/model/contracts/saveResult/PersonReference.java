package ru.rgs.APITests.model.contracts.saveResult;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class PersonReference{

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
			"PersonReference{" + 
			"displayName = '" + displayName + '\'' + 
			",id = '" + id + '\'' + 
			",subjectType = '" + subjectType + '\'' + 
			"}";
		}
}