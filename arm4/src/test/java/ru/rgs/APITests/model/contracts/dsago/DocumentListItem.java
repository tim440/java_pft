package ru.rgs.APITests.model.contracts.dsago;

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

	public void setSysCreateDate(String sysCreateDate){
		this.sysCreateDate = sysCreateDate;
	}

	public String getSysCreateDate(){
		return sysCreateDate;
	}

	public void setDocumentType(DocumentType documentType){
		this.documentType = documentType;
	}

	public DocumentType getDocumentType(){
		return documentType;
	}

	public void setSysSource(String sysSource){
		this.sysSource = sysSource;
	}

	public String getSysSource(){
		return sysSource;
	}

	public void setSysCreateUser(String sysCreateUser){
		this.sysCreateUser = sysCreateUser;
	}

	public String getSysCreateUser(){
		return sysCreateUser;
	}

	public void setDocumentGroup(DocumentGroup documentGroup){
		this.documentGroup = documentGroup;
	}

	public DocumentGroup getDocumentGroup(){
		return documentGroup;
	}

	public void setIssueOrganization(String issueOrganization){
		this.issueOrganization = issueOrganization;
	}

	public String getIssueOrganization(){
		return issueOrganization;
	}

	public void setIsIdPregenerated(String isIdPregenerated){
		this.isIdPregenerated = isIdPregenerated;
	}

	public String getIsIdPregenerated(){
		return isIdPregenerated;
	}

	public void setNumber(String number){
		this.number = number;
	}

	public String getNumber(){
		return number;
	}

	public void setSysEditor(String sysEditor){
		this.sysEditor = sysEditor;
	}

	public String getSysEditor(){
		return sysEditor;
	}

	public void setSeries(String series){
		this.series = series;
	}

	public String getSeries(){
		return series;
	}

	public void setPersonId(String personId){
		this.personId = personId;
	}

	public String getPersonId(){
		return personId;
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

	public void setBid(String bid){
		this.bid = bid;
	}

	public String getBid(){
		return bid;
	}

	public void setIssueDate(String issueDate){
		this.issueDate = issueDate;
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