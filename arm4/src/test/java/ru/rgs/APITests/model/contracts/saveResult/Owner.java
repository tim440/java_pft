package ru.rgs.APITests.model.contracts.saveResult;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Owner{

	@SerializedName("sysEditor")
	private String sysEditor;

	@SerializedName("displayName")
	private String displayName;

	@SerializedName("id")
	private String id;

	@SerializedName("subjectType")
	private SubjectType subjectType;

	public String getSysEditor(){
		return sysEditor;
	}

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
			"Owner{" + 
			"sysEditor = '" + sysEditor + '\'' + 
			",displayName = '" + displayName + '\'' + 
			",id = '" + id + '\'' + 
			",subjectType = '" + subjectType + '\'' + 
			"}";
		}
}