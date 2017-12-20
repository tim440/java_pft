package ru.rgs.APITests.model.contracts.osago.submit;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class DocumentListItem{

	@SerializedName("versionEndDate")
	private String versionEndDate;

	@SerializedName("documentType")
	private DocumentType documentType;

	@SerializedName("sysSource")
	private String sysSource;

	@SerializedName("documentGroup")
	private DocumentGroup documentGroup;

	@SerializedName("isIdPregenerated")
	private String isIdPregenerated;

	@SerializedName("number")
	private String number;

	@SerializedName("sysEditor")
	private String sysEditor;

	@SerializedName("series")
	private String series;

	@SerializedName("versionStartDate")
	private String versionStartDate;

	@SerializedName("entityChangeId")
	private String entityChangeId;

	@SerializedName("personId")
	private String personId;

	@SerializedName("lastModified")
	private String lastModified;

	@SerializedName("sysUser")
	private String sysUser;

	@SerializedName("sysCreator")
	private String sysCreator;

	@SerializedName("id")
	private String id;

	@SerializedName("bid")
	private String bid;

	public String getVersionEndDate(){
		return versionEndDate;
	}

	public DocumentType getDocumentType(){
		return documentType;
	}

	public String getSysSource(){
		return sysSource;
	}

	public DocumentGroup getDocumentGroup(){
		return documentGroup;
	}

	public String getIsIdPregenerated(){
		return isIdPregenerated;
	}

	public String getNumber(){
		return number;
	}

	public String getSysEditor(){
		return sysEditor;
	}

	public String getSeries(){
		return series;
	}

	public String getVersionStartDate(){
		return versionStartDate;
	}

	public String getEntityChangeId(){
		return entityChangeId;
	}

	public String getPersonId(){
		return personId;
	}

	public String getLastModified(){
		return lastModified;
	}

	public String getSysUser(){
		return sysUser;
	}

	public String getSysCreator(){
		return sysCreator;
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
			"DocumentListItem{" + 
			"versionEndDate = '" + versionEndDate + '\'' + 
			",documentType = '" + documentType + '\'' + 
			",sysSource = '" + sysSource + '\'' + 
			",documentGroup = '" + documentGroup + '\'' + 
			",isIdPregenerated = '" + isIdPregenerated + '\'' + 
			",number = '" + number + '\'' + 
			",sysEditor = '" + sysEditor + '\'' + 
			",series = '" + series + '\'' + 
			",versionStartDate = '" + versionStartDate + '\'' + 
			",entityChangeId = '" + entityChangeId + '\'' + 
			",personId = '" + personId + '\'' + 
			",lastModified = '" + lastModified + '\'' + 
			",sysUser = '" + sysUser + '\'' + 
			",sysCreator = '" + sysCreator + '\'' + 
			",id = '" + id + '\'' + 
			",bid = '" + bid + '\'' + 
			"}";
		}
}