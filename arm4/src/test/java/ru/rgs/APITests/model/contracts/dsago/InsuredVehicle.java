package ru.rgs.APITests.model.contracts.dsago;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class InsuredVehicle{

	@SerializedName("owner")
	private Owner owner;

	@SerializedName("cascoVehicleUsagePurpose")
	private CascoVehicleUsagePurpose cascoVehicleUsagePurpose;

	@SerializedName("vehicleUsagePurpose")
	private VehicleUsagePurpose vehicleUsagePurpose;

	@SerializedName("registrationMark")
	private String registrationMark;

	@SerializedName("regDocType")
	private RegDocType regDocType;

	@SerializedName("isRent")
	private boolean isRent;

	@SerializedName("regDocumentSeries")
	private String regDocumentSeries;

	@SerializedName("subjectId")
	private String subjectId;

	@SerializedName("vehicleCategoryName")
	private String vehicleCategoryName;

	@SerializedName("sysEditor")
	private String sysEditor;

	@SerializedName("contractId")
	private String contractId;

	@SerializedName("registrationDate")
	private String registrationDate;

	@SerializedName("trailerUsed")
	private boolean trailerUsed;

	@SerializedName("regDocumentNumber")
	private String regDocumentNumber;

	@SerializedName("id")
	private String id;

	@SerializedName("bid")
	private String bid;

	@SerializedName("territoryChanged")
	private boolean territoryChanged;

	@SerializedName("drivingLimitationType")
	private DrivingLimitationType drivingLimitationType;

	@SerializedName("osagoTerritory")
	private OsagoTerritory osagoTerritory;

	public void setOwner(Owner owner){
		this.owner = owner;
	}

	public Owner getOwner(){
		return owner;
	}

	public void setCascoVehicleUsagePurpose(CascoVehicleUsagePurpose cascoVehicleUsagePurpose){
		this.cascoVehicleUsagePurpose = cascoVehicleUsagePurpose;
	}

	public CascoVehicleUsagePurpose getCascoVehicleUsagePurpose(){
		return cascoVehicleUsagePurpose;
	}

	public void setVehicleUsagePurpose(VehicleUsagePurpose vehicleUsagePurpose){
		this.vehicleUsagePurpose = vehicleUsagePurpose;
	}

	public VehicleUsagePurpose getVehicleUsagePurpose(){
		return vehicleUsagePurpose;
	}

	public void setRegistrationMark(String registrationMark){
		this.registrationMark = registrationMark;
	}

	public String getRegistrationMark(){
		return registrationMark;
	}

	public void setRegDocType(RegDocType regDocType){
		this.regDocType = regDocType;
	}

	public RegDocType getRegDocType(){
		return regDocType;
	}

	public void setIsRent(boolean isRent){
		this.isRent = isRent;
	}

	public boolean isIsRent(){
		return isRent;
	}

	public void setRegDocumentSeries(String regDocumentSeries){
		this.regDocumentSeries = regDocumentSeries;
	}

	public String getRegDocumentSeries(){
		return regDocumentSeries;
	}

	public void setSubjectId(String subjectId){
		this.subjectId = subjectId;
	}

	public String getSubjectId(){
		return subjectId;
	}

	public void setVehicleCategoryName(String vehicleCategoryName){
		this.vehicleCategoryName = vehicleCategoryName;
	}

	public String getVehicleCategoryName(){
		return vehicleCategoryName;
	}

	public void setSysEditor(String sysEditor){
		this.sysEditor = sysEditor;
	}

	public String getSysEditor(){
		return sysEditor;
	}

	public void setContractId(String contractId){
		this.contractId = contractId;
	}

	public String getContractId(){
		return contractId;
	}

	public void setRegistrationDate(String registrationDate){
		this.registrationDate = registrationDate;
	}

	public String getRegistrationDate(){
		return registrationDate;
	}

	public void setTrailerUsed(boolean trailerUsed){
		this.trailerUsed = trailerUsed;
	}

	public boolean isTrailerUsed(){
		return trailerUsed;
	}

	public void setRegDocumentNumber(String regDocumentNumber){
		this.regDocumentNumber = regDocumentNumber;
	}

	public String getRegDocumentNumber(){
		return regDocumentNumber;
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

	public void setTerritoryChanged(boolean territoryChanged){
		this.territoryChanged = territoryChanged;
	}

	public boolean isTerritoryChanged(){
		return territoryChanged;
	}

	public void setDrivingLimitationType(DrivingLimitationType drivingLimitationType){
		this.drivingLimitationType = drivingLimitationType;
	}

	public DrivingLimitationType getDrivingLimitationType(){
		return drivingLimitationType;
	}

	public void setOsagoTerritory(OsagoTerritory osagoTerritory){
		this.osagoTerritory = osagoTerritory;
	}

	public OsagoTerritory getOsagoTerritory(){
		return osagoTerritory;
	}

	@Override
 	public String toString(){
		return 
			"InsuredVehicle{" + 
			"owner = '" + owner + '\'' + 
			",cascoVehicleUsagePurpose = '" + cascoVehicleUsagePurpose + '\'' + 
			",vehicleUsagePurpose = '" + vehicleUsagePurpose + '\'' + 
			",registrationMark = '" + registrationMark + '\'' + 
			",regDocType = '" + regDocType + '\'' + 
			",isRent = '" + isRent + '\'' + 
			",regDocumentSeries = '" + regDocumentSeries + '\'' + 
			",subjectId = '" + subjectId + '\'' + 
			",vehicleCategoryName = '" + vehicleCategoryName + '\'' + 
			",sysEditor = '" + sysEditor + '\'' + 
			",contractId = '" + contractId + '\'' + 
			",registrationDate = '" + registrationDate + '\'' + 
			",trailerUsed = '" + trailerUsed + '\'' + 
			",regDocumentNumber = '" + regDocumentNumber + '\'' + 
			",id = '" + id + '\'' + 
			",bid = '" + bid + '\'' + 
			",territoryChanged = '" + territoryChanged + '\'' + 
			",drivingLimitationType = '" + drivingLimitationType + '\'' + 
			",osagoTerritory = '" + osagoTerritory + '\'' + 
			"}";
		}
}