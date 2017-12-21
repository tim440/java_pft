package ru.rgs.APITests.model.contracts.saveResult;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class DocumentListItem{

	@SerializedName("sysCreateDate")
	private String sysCreateDate;

	@SerializedName("documentType")
	private DocumentType documentType;

	@SerializedName("sysSource")
	private String sysSource;

	@SerializedName("sysCreateUser")
	private String sysCreateUser;

	@SerializedName("documentGroup")
	private DocumentGroup documentGroup;

	@SerializedName("issueOrganization")
	private String issueOrganization;

	@SerializedName("isIdPregenerated")
	private String isIdPregenerated;

	@SerializedName("number")
	private String number;

	@SerializedName("sysEditor")
	private String sysEditor;

	@SerializedName("series")
	private String series;

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

	@SerializedName("issueDate")
	private String issueDate;

	public String getSysCreateDate(){
		return sysCreateDate;
	}

	public DocumentType getDocumentType(){
		return documentType;
	}

	public String getSysSource(){
		return sysSource;
	}

	public String getSysCreateUser(){
		return sysCreateUser;
	}

	public DocumentGroup getDocumentGroup(){
		return documentGroup;
	}

	public String getIssueOrganization(){
		return issueOrganization;
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

	public String getIssueDate(){
		return issueDate;
	}

	@Override
 	public String toString(){
		return 
			"DocumentListItem{" + 
			"sysCreateDate = '" + sysCreateDate + '\'' + 
			",documentType = '" + documentType + '\'' + 
			",sysSource = '" + sysSource + '\'' + 
			",sysCreateUser = '" + sysCreateUser + '\'' + 
			",documentGroup = '" + documentGroup + '\'' + 
			",issueOrganization = '" + issueOrganization + '\'' + 
			",isIdPregenerated = '" + isIdPregenerated + '\'' + 
			",number = '" + number + '\'' + 
			",sysEditor = '" + sysEditor + '\'' + 
			",series = '" + series + '\'' + 
			",personId = '" + personId + '\'' + 
			",lastModified = '" + lastModified + '\'' + 
			",sysUser = '" + sysUser + '\'' + 
			",sysCreator = '" + sysCreator + '\'' + 
			",id = '" + id + '\'' + 
			",bid = '" + bid + '\'' + 
			",issueDate = '" + issueDate + '\'' + 
			"}";
		}
}