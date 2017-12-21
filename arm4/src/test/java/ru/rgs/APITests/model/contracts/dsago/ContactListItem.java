package ru.rgs.APITests.model.contracts.dsago;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class ContactListItem{

	@SerializedName("isIdPregenerated")
	private String isIdPregenerated;

	@SerializedName("abonentName")
	private String abonentName;

	@SerializedName("sysEditor")
	private String sysEditor;

	@SerializedName("sysSource")
	private String sysSource;

	@SerializedName("contactLine")
	private String contactLine;

	@SerializedName("contactType")
	private ContactType contactType;

	@SerializedName("lastModified")
	private String lastModified;

	@SerializedName("sysUser")
	private String sysUser;

	@SerializedName("sysCreator")
	private String sysCreator;

	@SerializedName("id")
	private String id;

	public void setIsIdPregenerated(String isIdPregenerated){
		this.isIdPregenerated = isIdPregenerated;
	}

	public String getIsIdPregenerated(){
		return isIdPregenerated;
	}

	public void setAbonentName(String abonentName){
		this.abonentName = abonentName;
	}

	public String getAbonentName(){
		return abonentName;
	}

	public void setSysEditor(String sysEditor){
		this.sysEditor = sysEditor;
	}

	public String getSysEditor(){
		return sysEditor;
	}

	public void setSysSource(String sysSource){
		this.sysSource = sysSource;
	}

	public String getSysSource(){
		return sysSource;
	}

	public void setContactLine(String contactLine){
		this.contactLine = contactLine;
	}

	public String getContactLine(){
		return contactLine;
	}

	public void setContactType(ContactType contactType){
		this.contactType = contactType;
	}

	public ContactType getContactType(){
		return contactType;
	}

	public void setLastModified(String lastModified){
		this.lastModified = lastModified;
	}

	public String getLastModified(){
		return lastModified;
	}

	public void setSysUser(String sysUser){
		this.sysUser = sysUser;
	}

	public String getSysUser(){
		return sysUser;
	}

	public void setSysCreator(String sysCreator){
		this.sysCreator = sysCreator;
	}

	public String getSysCreator(){
		return sysCreator;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"ContactListItem{" + 
			"isIdPregenerated = '" + isIdPregenerated + '\'' + 
			",abonentName = '" + abonentName + '\'' + 
			",sysEditor = '" + sysEditor + '\'' + 
			",sysSource = '" + sysSource + '\'' + 
			",contactLine = '" + contactLine + '\'' + 
			",contactType = '" + contactType + '\'' + 
			",lastModified = '" + lastModified + '\'' + 
			",sysUser = '" + sysUser + '\'' + 
			",sysCreator = '" + sysCreator + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}