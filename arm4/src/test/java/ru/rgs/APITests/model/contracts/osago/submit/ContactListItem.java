package ru.rgs.APITests.model.contracts.osago.submit;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class ContactListItem{

	@SerializedName("versionEndDate")
	private String versionEndDate;

	@SerializedName("sysSource")
	private String sysSource;

	@SerializedName("contactType")
	private ContactType contactType;

	@SerializedName("isIdPregenerated")
	private String isIdPregenerated;

	@SerializedName("abonentName")
	private String abonentName;

	@SerializedName("sysEditor")
	private String sysEditor;

	@SerializedName("abonentPosition")
	private String abonentPosition;

	@SerializedName("contactLine")
	private String contactLine;

	@SerializedName("versionStartDate")
	private String versionStartDate;

	@SerializedName("entityChangeId")
	private String entityChangeId;

	@SerializedName("lastModified")
	private String lastModified;

	@SerializedName("sysUser")
	private String sysUser;

	@SerializedName("sysCreator")
	private String sysCreator;

	@SerializedName("id")
	private String id;

	public String getVersionEndDate(){
		return versionEndDate;
	}

	public String getSysSource(){
		return sysSource;
	}

	public ContactType getContactType(){
		return contactType;
	}

	public String getIsIdPregenerated(){
		return isIdPregenerated;
	}

	public String getAbonentName(){
		return abonentName;
	}

	public String getSysEditor(){
		return sysEditor;
	}

	public String getAbonentPosition(){
		return abonentPosition;
	}

	public String getContactLine(){
		return contactLine;
	}

	public String getVersionStartDate(){
		return versionStartDate;
	}

	public String getEntityChangeId(){
		return entityChangeId;
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

	@Override
 	public String toString(){
		return 
			"ContactListItem{" + 
			"versionEndDate = '" + versionEndDate + '\'' + 
			",sysSource = '" + sysSource + '\'' + 
			",contactType = '" + contactType + '\'' + 
			",isIdPregenerated = '" + isIdPregenerated + '\'' + 
			",abonentName = '" + abonentName + '\'' + 
			",sysEditor = '" + sysEditor + '\'' + 
			",abonentPosition = '" + abonentPosition + '\'' + 
			",contactLine = '" + contactLine + '\'' + 
			",versionStartDate = '" + versionStartDate + '\'' + 
			",entityChangeId = '" + entityChangeId + '\'' + 
			",lastModified = '" + lastModified + '\'' + 
			",sysUser = '" + sysUser + '\'' + 
			",sysCreator = '" + sysCreator + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}