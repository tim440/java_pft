package ru.rgs.APITests.model.SearchInsurer.InsurerFull;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.List;

@Generated("com.robohorse.robopojogenerator")
public class FullInsurer{

	@SerializedName("lastName")
	private String lastName;

	@SerializedName("isNotResident")
	private String isNotResident;

	@SerializedName("isInboul")
	private String isInboul;

	@SerializedName("displayName")
	private String displayName;

	@SerializedName("isOverload")
	private String isOverload;

	@SerializedName("sysEditor")
	private String sysEditor;

	@SerializedName("isForeignPublic")
	private String isForeignPublic;

	@SerializedName("businessmanRgsAgent")
	private String businessmanRgsAgent;

	@SerializedName("entityChangeId")
	private String entityChangeId;

	@SerializedName("id")
	private String id;

	@SerializedName("personType")
	private PersonType personType;

	@SerializedName("secondName")
	private String secondName;

	@SerializedName("bonusMalusList")
	private List<BonusMalusListItem> bonusMalusList;

	@SerializedName("addressShortInfo")
	private String addressShortInfo;

	@SerializedName("isIpension")
	private String isIpension;

	@SerializedName("primaryDocumentTypeList")
	private List<PrimaryDocumentTypeListItem> primaryDocumentTypeList;

	@SerializedName("sex")
	private String sex;

	@SerializedName("additionalDocumentTypeList")
	private List<AdditionalDocumentTypeListItem> additionalDocumentTypeList;

	@SerializedName("vehicleTypeList")
	private List<VehicleTypeListItem> vehicleTypeList;

	@SerializedName("personChangeList")
	private List<PersonChangeListItem> personChangeList;

	@SerializedName("birthDate")
	private String birthDate;

	@SerializedName("personProfileId")
	private String personProfileId;

	@SerializedName("firstName")
	private String firstName;

	@SerializedName("contactList")
	private List<ContactListItem> contactList;

	@SerializedName("nationality")
	private Nationality nationality;

	@SerializedName("documentList")
	private List<DocumentListItem> documentList;

	@SerializedName("isNotOkved")
	private String isNotOkved;

	@SerializedName("primaryAddress")
	private PrimaryAddress primaryAddress;

	@SerializedName("additionalAddress")
	private AdditionalAddress additionalAddress;

	@SerializedName("lastModified")
	private String lastModified;

	@SerializedName("bid")
	private String bid;

	@SerializedName("vipCode")
	private String vipCode;

	@SerializedName("possessionGroundList")
	private List<PossessionGroundListItem> possessionGroundList;

	public String getLastName(){
		return lastName;
	}

	public String getIsNotResident(){
		return isNotResident;
	}

	public String getIsInboul(){
		return isInboul;
	}

	public String getDisplayName(){
		return displayName;
	}

	public String getIsOverload(){
		return isOverload;
	}

	public String getSysEditor(){
		return sysEditor;
	}

	public String getIsForeignPublic(){
		return isForeignPublic;
	}

	public String getBusinessmanRgsAgent(){
		return businessmanRgsAgent;
	}

	public String getEntityChangeId(){
		return entityChangeId;
	}

	public String getId(){
		return id;
	}

	public PersonType getPersonType(){
		return personType;
	}

	public String getSecondName(){
		return secondName;
	}

	public List<BonusMalusListItem> getBonusMalusList(){
		return bonusMalusList;
	}

	public String getAddressShortInfo(){
		return addressShortInfo;
	}

	public String getIsIpension(){
		return isIpension;
	}

	public List<PrimaryDocumentTypeListItem> getPrimaryDocumentTypeList(){
		return primaryDocumentTypeList;
	}

	public String getSex(){
		return sex;
	}

	public List<AdditionalDocumentTypeListItem> getAdditionalDocumentTypeList(){
		return additionalDocumentTypeList;
	}

	public List<VehicleTypeListItem> getVehicleTypeList(){
		return vehicleTypeList;
	}

	public List<PersonChangeListItem> getPersonChangeList(){
		return personChangeList;
	}

	public String getBirthDate(){
		return birthDate;
	}

	public String getPersonProfileId(){
		return personProfileId;
	}

	public String getFirstName(){
		return firstName;
	}

	public List<ContactListItem> getContactList(){
		return contactList;
	}

	public Nationality getNationality(){
		return nationality;
	}

	public List<DocumentListItem> getDocumentList(){
		return documentList;
	}

	public String getIsNotOkved(){
		return isNotOkved;
	}

	public PrimaryAddress getPrimaryAddress(){
		return primaryAddress;
	}

	public AdditionalAddress getAdditionalAddress(){
		return additionalAddress;
	}

	public String getLastModified(){
		return lastModified;
	}

	public String getBid(){
		return bid;
	}

	public String getVipCode(){
		return vipCode;
	}

	public List<PossessionGroundListItem> getPossessionGroundList(){
		return possessionGroundList;
	}

	@Override
 	public String toString(){
		return 
			"FullInsurer{" +
			"lastName = '" + lastName + '\'' + 
			",isNotResident = '" + isNotResident + '\'' + 
			",isInboul = '" + isInboul + '\'' + 
			",displayName = '" + displayName + '\'' + 
			",isOverload = '" + isOverload + '\'' + 
			",sysEditor = '" + sysEditor + '\'' + 
			",isForeignPublic = '" + isForeignPublic + '\'' + 
			",businessmanRgsAgent = '" + businessmanRgsAgent + '\'' + 
			",entityChangeId = '" + entityChangeId + '\'' + 
			",id = '" + id + '\'' + 
			",personType = '" + personType + '\'' + 
			",secondName = '" + secondName + '\'' + 
			",bonusMalusList = '" + bonusMalusList + '\'' + 
			",addressShortInfo = '" + addressShortInfo + '\'' + 
			",isIpension = '" + isIpension + '\'' + 
			",primaryDocumentTypeList = '" + primaryDocumentTypeList + '\'' + 
			",sex = '" + sex + '\'' + 
			",additionalDocumentTypeList = '" + additionalDocumentTypeList + '\'' + 
			",vehicleTypeList = '" + vehicleTypeList + '\'' + 
			",personChangeList = '" + personChangeList + '\'' + 
			",birthDate = '" + birthDate + '\'' + 
			",personProfileId = '" + personProfileId + '\'' + 
			",firstName = '" + firstName + '\'' + 
			",contactList = '" + contactList + '\'' + 
			",nationality = '" + nationality + '\'' + 
			",documentList = '" + documentList + '\'' + 
			",isNotOkved = '" + isNotOkved + '\'' + 
			",primaryAddress = '" + primaryAddress + '\'' + 
			",additionalAddress = '" + additionalAddress + '\'' + 
			",lastModified = '" + lastModified + '\'' + 
			",bid = '" + bid + '\'' + 
			",vipCode = '" + vipCode + '\'' + 
			",possessionGroundList = '" + possessionGroundList + '\'' + 
			"}";
		}
}