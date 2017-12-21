package ru.rgs.APITests.model.contracts.dsago;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Owner{

	@SerializedName("sysEditor")
	private String sysEditor;

	@SerializedName("displayName")
	private String displayName;

	@SerializedName("entityChangeId")
	private String entityChangeId;

	@SerializedName("id")
	private String id;

	@SerializedName("subjectType")
	private SubjectType subjectType;

	public void setSysEditor(String sysEditor){
		this.sysEditor = sysEditor;
	}

	public String getSysEditor(){
		return sysEditor;
	}

	public void setDisplayName(String displayName){
		this.displayName = displayName;
	}

	public String getDisplayName(){
		return displayName;
	}

	public void setEntityChangeId(String entityChangeId){
		this.entityChangeId = entityChangeId;
	}

	public String getEntityChangeId(){
		return entityChangeId;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setSubjectType(SubjectType subjectType){
		this.subjectType = subjectType;
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
			",entityChangeId = '" + entityChangeId + '\'' + 
			",id = '" + id + '\'' + 
			",subjectType = '" + subjectType + '\'' + 
			"}";
		}
}