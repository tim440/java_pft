package ru.rgs.APITests.model.contracts.osago.submit;

import com.google.gson.annotations.SerializedName;
import ru.rgs.APITests.model.SearchInsurer.InsurerFull.FullInsurer;

import javax.annotation.Generated;

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

	public Owner(FullInsurer fullInsurer) {
		this.sysEditor = fullInsurer.getSysEditor();
		this.displayName = fullInsurer.getDisplayName();
		this.entityChangeId = fullInsurer.getEntityChangeId();
		this.id = fullInsurer.getId();
		this.subjectType = new SubjectType();
	}

	public String getSysEditor(){
		return sysEditor;
	}

	public String getDisplayName(){
		return displayName;
	}

	public String getEntityChangeId(){
		return entityChangeId;
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
			",entityChangeId = '" + entityChangeId + '\'' + 
			",id = '" + id + '\'' + 
			",subjectType = '" + subjectType + '\'' + 
			"}";
		}
}