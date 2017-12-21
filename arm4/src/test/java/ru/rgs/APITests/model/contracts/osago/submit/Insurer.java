package ru.rgs.APITests.model.contracts.osago.submit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import ru.rgs.APITests.model.SearchInsurer.InsurerFull.FullInsurer;

import javax.annotation.Generated;
import java.util.List;

@Generated("com.robohorse.robopojogenerator")
public class Insurer{

    transient Gson gson = new GsonBuilder().serializeNulls().create();

    @SerializedName("contractDate")
	private Object contractDate;

	@SerializedName("isNotResident")
	private boolean isNotResident;

	@SerializedName("isInboul")
	private boolean isInboul;

	@SerializedName("clientStatus")
	private ClientStatus clientStatus;

	@SerializedName("sectorEconomyList")
	private String sectorEconomyList;

	@SerializedName("sysEditor")
	private String sysEditor;

	@SerializedName("bankAccountList")
	private String bankAccountList;

	@SerializedName("entityChangeId")
	private String entityChangeId;

	@SerializedName("id")
	private String id;

	@SerializedName("contractEntityPurpose")
	private String contractEntityPurpose;

	@SerializedName("codeForeignOrganization")
	private String codeForeignOrganization;

	@SerializedName("contractTypeCode")
	private String contractTypeCode;

	@SerializedName("ogrn")
	private String ogrn;

	@SerializedName("kpp")
	private String kpp;

	@SerializedName("additionalDocumentTypeList")
	private List<AdditionalDocumentTypeListItem> additionalDocumentTypeList;

	@SerializedName("personChangeList")
	private List<PersonChangeListItem> personChangeList;

	@SerializedName("personProfileId")
	private String personProfileId;

	@SerializedName("firstName")
	private String firstName;

	@SerializedName("contactList")
	private List<ContactListItem> contactList;

	@SerializedName("nationality")
	private Nationality nationality;

	@SerializedName("name")
	private String name;

	@SerializedName("disabledFieldList")
	private String disabledFieldList;

	@SerializedName("isNotOkved")
	private boolean isNotOkved;

	@SerializedName("position")
	private String position;

	@SerializedName("primaryAddress")
	private PrimaryAddress primaryAddress;

	@SerializedName("shortName")
	private String shortName;

	@SerializedName("vipCode")
	private String vipCode;

	@SerializedName("lastName")
	private String lastName;

	@SerializedName("disabledTableList")
	private String disabledTableList;

	@SerializedName("foreignPublicPosition")
	private String foreignPublicPosition;

	@SerializedName("displayName")
	private String displayName;

	@SerializedName("roles")
	private String roles;

	@SerializedName("isOverload")
	private boolean isOverload;

	@SerializedName("propertyForm")
	private PropertyForm propertyForm;

	@SerializedName("birthPlace")
	private String birthPlace;

	@SerializedName("edrpou")
	private String edrpou;

	@SerializedName("isForeignPublic")
	private boolean isForeignPublic;

	@SerializedName("businessmanRgsAgent")
	private boolean businessmanRgsAgent;

	@SerializedName("personType")
	private PersonType personType;

	@SerializedName("secondName")
	private String secondName;

	@SerializedName("bonusMalusList")
	private List<BonusMalusListItem> bonusMalusList;

	@SerializedName("addressShortInfo")
	private String addressShortInfo;

	@SerializedName("isIpension")
	private boolean isIpension;

	@SerializedName("contractBid")
	private String contractBid;

	@SerializedName("primaryDocumentTypeList")
	private List<PrimaryDocumentTypeListItem> primaryDocumentTypeList;

	@SerializedName("sex")
	private String sex;

	@SerializedName("inn")
	private String inn;

	@SerializedName("birthDate")
	private String birthDate;

	@SerializedName("okpo")
	private String okpo;

	@SerializedName("fgsn")
	private String fgsn;

	@SerializedName("documentList")
	private List<DocumentListItem> documentList;

	@SerializedName("contractId")
	private String contractId;

	@SerializedName("contractReferenceList")
	private String contractReferenceList;

	@SerializedName("additionalAddress")
	private AdditionalAddress additionalAddress;

	@SerializedName("bid")
	private String bid;

	@SerializedName("isNotPrimaryDocContact")
	private boolean isNotPrimaryDocContact;

	@SerializedName("foreignRegCode")
	private String foreignRegCode;

	@SerializedName("snils")
	private String snils;

	@SerializedName("foreignTaxCode")
	private String foreignTaxCode;

    public Insurer(FullInsurer fullInsurer) {
		this.id = fullInsurer.getId();
		this.entityChangeId = fullInsurer.getEntityChangeId();
		this.bid = fullInsurer.getBid();
		this.personType = new PersonType(fullInsurer.getPersonType().getCode(), fullInsurer.getPersonType().getName());
		this.lastName = fullInsurer.getLastName();
		this.firstName = fullInsurer.getFirstName();
		this.secondName = fullInsurer.getSecondName();
		this.name = "";
		this.shortName = "";
		this.contractDate = null;
		this.isNotResident = true;
		this.isInboul = false;
		this.clientStatus = new ClientStatus();
		this.sectorEconomyList = "";
        this.contactList = gson.fromJson(gson.toJson(fullInsurer.getContactList()),
                new TypeToken<ContactListItem>(){}.getType());
        this.primaryAddress = gson.fromJson(gson.toJson(fullInsurer.getPrimaryAddress()), PrimaryAddress.class);
        this.documentList = gson.fromJson(gson.toJson(fullInsurer.getDocumentList()),
                new TypeToken<List<DocumentListItem>>(){}.getType());
        this.additionalAddress = gson.fromJson(gson.toJson(fullInsurer.getAdditionalAddress()), AdditionalAddress.class);
        this.primaryDocumentTypeList = gson.fromJson(gson.toJson(fullInsurer.getPrimaryDocumentTypeList()),
                new TypeToken<List<PrimaryDocumentTypeListItem>>(){}.getType());
        this.additionalDocumentTypeList = gson.fromJson(gson.toJson(fullInsurer.getAdditionalDocumentTypeList()),
                new TypeToken<List<AdditionalDocumentTypeListItem>>(){}.getType());
        this.bonusMalusList = gson.fromJson(gson.toJson(fullInsurer.getBonusMalusList()),
                new TypeToken<List<BonusMalusListItem>>(){}.getType());
        this.personChangeList = gson.fromJson(gson.toJson(fullInsurer.getPersonChangeList()),
                new TypeToken<List<PersonChangeListItem>>(){}.getType());
        this.sysEditor = fullInsurer.getSysEditor();
		this.bankAccountList = "";
		this.contractEntityPurpose = "";
		this.codeForeignOrganization = "";
		this.contractTypeCode = "";
		this.ogrn = "";
		this.kpp = "";
		this.personProfileId = fullInsurer.getPersonProfileId();
		this.nationality = new Nationality();
		this.disabledFieldList = "";
		this.isNotOkved = false;
		this.position = "";
		this.vipCode = fullInsurer.getVipCode();
		this.disabledTableList = "";
		this.foreignPublicPosition = "";
		this.displayName = fullInsurer.getDisplayName();
		this.roles = "";
		this.isOverload = false;
		this.propertyForm = new PropertyForm();
		this.birthPlace = "";
		this.edrpou = "";
		this.isForeignPublic = false;
		this.businessmanRgsAgent = false;
		this.addressShortInfo = fullInsurer.getAddressShortInfo();
		this.isIpension = false;
		this.contractBid = "";
		this.sex = "1";
		this.inn = "";
		this.birthDate = fullInsurer.getBirthDate();
		this.okpo = "";
		this.fgsn = "";
        this.contractId = "";
		this.contractReferenceList = "";
		this.isNotPrimaryDocContact = false;
		this.foreignRegCode = "";
		this.snils = "";
		this.foreignTaxCode = "";
	}

	public Object getContractDate(){
		return contractDate;
	}

	public boolean isIsNotResident(){
		return isNotResident;
	}

	public boolean isIsInboul(){
		return isInboul;
	}

	public ClientStatus getClientStatus(){
		return clientStatus;
	}

	public String getSectorEconomyList(){
		return sectorEconomyList;
	}

	public String getSysEditor(){
		return sysEditor;
	}

	public String getBankAccountList(){
		return bankAccountList;
	}

	public String getEntityChangeId(){
		return entityChangeId;
	}

	public String getId(){
		return id;
	}

	public String getContractEntityPurpose(){
		return contractEntityPurpose;
	}

	public String getCodeForeignOrganization(){
		return codeForeignOrganization;
	}

	public String getContractTypeCode(){
		return contractTypeCode;
	}

	public String getOgrn(){
		return ogrn;
	}

	public String getKpp(){
		return kpp;
	}

	public List<AdditionalDocumentTypeListItem> getAdditionalDocumentTypeList(){
		return additionalDocumentTypeList;
	}

	public List<PersonChangeListItem> getPersonChangeList(){
		return personChangeList;
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

	public String getName(){
		return name;
	}

	public String getDisabledFieldList(){
		return disabledFieldList;
	}

	public boolean isIsNotOkved(){
		return isNotOkved;
	}

	public String getPosition(){
		return position;
	}

	public PrimaryAddress getPrimaryAddress(){
		return primaryAddress;
	}

	public String getShortName(){
		return shortName;
	}

	public String getVipCode(){
		return vipCode;
	}

	public String getLastName(){
		return lastName;
	}

	public String getDisabledTableList(){
		return disabledTableList;
	}

	public String getForeignPublicPosition(){
		return foreignPublicPosition;
	}

	public String getDisplayName(){
		return displayName;
	}

	public String getRoles(){
		return roles;
	}

	public boolean isIsOverload(){
		return isOverload;
	}

	public PropertyForm getPropertyForm(){
		return propertyForm;
	}

	public String getBirthPlace(){
		return birthPlace;
	}

	public String getEdrpou(){
		return edrpou;
	}

	public boolean isIsForeignPublic(){
		return isForeignPublic;
	}

	public boolean isBusinessmanRgsAgent(){
		return businessmanRgsAgent;
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

	public boolean isIsIpension(){
		return isIpension;
	}

	public String getContractBid(){
		return contractBid;
	}

	public List<PrimaryDocumentTypeListItem> getPrimaryDocumentTypeList(){
		return primaryDocumentTypeList;
	}

	public String getSex(){
		return sex;
	}

	public String getInn(){
		return inn;
	}

	public String getBirthDate(){
		return birthDate;
	}

	public String getOkpo(){
		return okpo;
	}

	public String getFgsn(){
		return fgsn;
	}

	public List<DocumentListItem> getDocumentList(){
		return documentList;
	}

	public String getContractId(){
		return contractId;
	}

	public String getContractReferenceList(){
		return contractReferenceList;
	}

	public AdditionalAddress getAdditionalAddress(){
		return additionalAddress;
	}

	public String getBid(){
		return bid;
	}

	public boolean isIsNotPrimaryDocContact(){
		return isNotPrimaryDocContact;
	}

	public String getForeignRegCode(){
		return foreignRegCode;
	}

	public String getSnils(){
		return snils;
	}

	public String getForeignTaxCode(){
		return foreignTaxCode;
	}

	@Override
 	public String toString(){
		return 
			"InsurerPreview{" +
			"contractDate = '" + contractDate + '\'' + 
			",isNotResident = '" + isNotResident + '\'' + 
			",isInboul = '" + isInboul + '\'' + 
			",clientStatus = '" + clientStatus + '\'' + 
			",sectorEconomyList = '" + sectorEconomyList + '\'' + 
			",sysEditor = '" + sysEditor + '\'' + 
			",bankAccountList = '" + bankAccountList + '\'' + 
			",entityChangeId = '" + entityChangeId + '\'' + 
			",id = '" + id + '\'' + 
			",contractEntityPurpose = '" + contractEntityPurpose + '\'' + 
			",codeForeignOrganization = '" + codeForeignOrganization + '\'' + 
			",contractTypeCode = '" + contractTypeCode + '\'' + 
			",ogrn = '" + ogrn + '\'' + 
			",kpp = '" + kpp + '\'' + 
			",additionalDocumentTypeList = '" + additionalDocumentTypeList + '\'' + 
			",personChangeList = '" + personChangeList + '\'' + 
			",personProfileId = '" + personProfileId + '\'' + 
			",firstName = '" + firstName + '\'' + 
			",contactList = '" + contactList + '\'' + 
			",nationality = '" + nationality + '\'' + 
			",name = '" + name + '\'' + 
			",disabledFieldList = '" + disabledFieldList + '\'' + 
			",isNotOkved = '" + isNotOkved + '\'' + 
			",position = '" + position + '\'' + 
			",primaryAddress = '" + primaryAddress + '\'' + 
			",shortName = '" + shortName + '\'' + 
			",vipCode = '" + vipCode + '\'' + 
			",lastName = '" + lastName + '\'' + 
			",disabledTableList = '" + disabledTableList + '\'' + 
			",foreignPublicPosition = '" + foreignPublicPosition + '\'' + 
			",displayName = '" + displayName + '\'' + 
			",roles = '" + roles + '\'' + 
			",isOverload = '" + isOverload + '\'' + 
			",propertyForm = '" + propertyForm + '\'' + 
			",birthPlace = '" + birthPlace + '\'' + 
			",edrpou = '" + edrpou + '\'' + 
			",isForeignPublic = '" + isForeignPublic + '\'' + 
			",businessmanRgsAgent = '" + businessmanRgsAgent + '\'' + 
			",personType = '" + personType + '\'' + 
			",secondName = '" + secondName + '\'' + 
			",bonusMalusList = '" + bonusMalusList + '\'' + 
			",addressShortInfo = '" + addressShortInfo + '\'' + 
			",isIpension = '" + isIpension + '\'' + 
			",contractBid = '" + contractBid + '\'' + 
			",primaryDocumentTypeList = '" + primaryDocumentTypeList + '\'' + 
			",sex = '" + sex + '\'' + 
			",inn = '" + inn + '\'' + 
			",birthDate = '" + birthDate + '\'' + 
			",okpo = '" + okpo + '\'' + 
			",fgsn = '" + fgsn + '\'' + 
			",documentList = '" + documentList + '\'' + 
			",contractId = '" + contractId + '\'' + 
			",contractReferenceList = '" + contractReferenceList + '\'' + 
			",additionalAddress = '" + additionalAddress + '\'' + 
			",bid = '" + bid + '\'' + 
			",isNotPrimaryDocContact = '" + isNotPrimaryDocContact + '\'' + 
			",foreignRegCode = '" + foreignRegCode + '\'' + 
			",snils = '" + snils + '\'' + 
			",foreignTaxCode = '" + foreignTaxCode + '\'' + 
			"}";
		}
}