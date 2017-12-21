package ru.rgs.APITests.model.contracts.saveResult;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class InsuredVehicle{

	@SerializedName("equipmentAdded")
	private String equipmentAdded;

	@SerializedName("vehicleTypeId")
	private String vehicleTypeId;

	@SerializedName("vehicleUsagePurpose")
	private VehicleUsagePurpose vehicleUsagePurpose;

	@SerializedName("registrationMark")
	private String registrationMark;

	@SerializedName("isInTransit")
	private String isInTransit;

	@SerializedName("techInspectionMissing")
	private String techInspectionMissing;

	@SerializedName("blankHasOperator")
	private String blankHasOperator;

	@SerializedName("usePurposeList")
	private List<UsePurposeListItem> usePurposeList;

	@SerializedName("registrationCountry")
	private RegistrationCountry registrationCountry;

	@SerializedName("regDocumentSeries")
	private String regDocumentSeries;

	@SerializedName("subjectId")
	private String subjectId;

	@SerializedName("vehicleCategoryName")
	private String vehicleCategoryName;

	@SerializedName("kladrTerritoryId")
	private String kladrTerritoryId;

	@SerializedName("kladrTerritoryCode")
	private String kladrTerritoryCode;

	@SerializedName("registrationDate")
	private String registrationDate;

	@SerializedName("trailerUsed")
	private String trailerUsed;

	@SerializedName("tractorUsePeriodDate")
	private String tractorUsePeriodDate;

	@SerializedName("regDocTypeList")
	private List<RegDocTypeListItem> regDocTypeList;

	@SerializedName("kladrRussia")
	private String kladrRussia;

	@SerializedName("id")
	private String id;

	@SerializedName("owner")
	private Owner owner;

	@SerializedName("firstUsePeriod")
	private FirstUsePeriod firstUsePeriod;

	@SerializedName("bonusMalusList")
	private List<BonusMalusListItem> bonusMalusList;

	@SerializedName("considerWear")
	private String considerWear;

	@SerializedName("registrationCountryList")
	private List<RegistrationCountryListItem> registrationCountryList;

	@SerializedName("inspectionBlankIsMissing")
	private String inspectionBlankIsMissing;

	@SerializedName("regDocType")
	private RegDocType regDocType;

	@SerializedName("isNew")
	private String isNew;

	@SerializedName("isForeignRegistration")
	private String isForeignRegistration;

	@SerializedName("possessionGround")
	private PossessionGround possessionGround;

	@SerializedName("kladrTerritoryName")
	private String kladrTerritoryName;

	@SerializedName("usedForDangerousCargo")
	private String usedForDangerousCargo;

	@SerializedName("contractId")
	private String contractId;

	@SerializedName("regDocumentNumber")
	private String regDocumentNumber;

	@SerializedName("lastModified")
	private String lastModified;

	@SerializedName("bid")
	private String bid;

	@SerializedName("bonusMalus")
	private BonusMalus bonusMalus;

	@SerializedName("possessionGroundList")
	private List<PossessionGroundListItem> possessionGroundList;

	@SerializedName("territoryChanged")
	private String territoryChanged;

	@SerializedName("drivingLimitationType")
	private DrivingLimitationType drivingLimitationType;

	public String getEquipmentAdded(){
		return equipmentAdded;
	}

	public String getVehicleTypeId(){
		return vehicleTypeId;
	}

	public VehicleUsagePurpose getVehicleUsagePurpose(){
		return vehicleUsagePurpose;
	}

	public String getRegistrationMark(){
		return registrationMark;
	}

	public String getIsInTransit(){
		return isInTransit;
	}

	public String getTechInspectionMissing(){
		return techInspectionMissing;
	}

	public String getBlankHasOperator(){
		return blankHasOperator;
	}

	public List<UsePurposeListItem> getUsePurposeList(){
		return usePurposeList;
	}

	public RegistrationCountry getRegistrationCountry(){
		return registrationCountry;
	}

	public String getRegDocumentSeries(){
		return regDocumentSeries;
	}

	public String getSubjectId(){
		return subjectId;
	}

	public String getVehicleCategoryName(){
		return vehicleCategoryName;
	}

	public String getKladrTerritoryId(){
		return kladrTerritoryId;
	}

	public String getKladrTerritoryCode(){
		return kladrTerritoryCode;
	}

	public String getRegistrationDate(){
		return registrationDate;
	}

	public String getTrailerUsed(){
		return trailerUsed;
	}

	public String getTractorUsePeriodDate(){
		return tractorUsePeriodDate;
	}

	public List<RegDocTypeListItem> getRegDocTypeList(){
		return regDocTypeList;
	}

	public String getKladrRussia(){
		return kladrRussia;
	}

	public String getId(){
		return id;
	}

	public Owner getOwner(){
		return owner;
	}

	public FirstUsePeriod getFirstUsePeriod(){
		return firstUsePeriod;
	}

	public List<BonusMalusListItem> getBonusMalusList(){
		return bonusMalusList;
	}

	public String getConsiderWear(){
		return considerWear;
	}

	public List<RegistrationCountryListItem> getRegistrationCountryList(){
		return registrationCountryList;
	}

	public String getInspectionBlankIsMissing(){
		return inspectionBlankIsMissing;
	}

	public RegDocType getRegDocType(){
		return regDocType;
	}

	public String getIsNew(){
		return isNew;
	}

	public String getIsForeignRegistration(){
		return isForeignRegistration;
	}

	public PossessionGround getPossessionGround(){
		return possessionGround;
	}

	public String getKladrTerritoryName(){
		return kladrTerritoryName;
	}

	public String getUsedForDangerousCargo(){
		return usedForDangerousCargo;
	}

	public String getContractId(){
		return contractId;
	}

	public String getRegDocumentNumber(){
		return regDocumentNumber;
	}

	public String getLastModified(){
		return lastModified;
	}

	public String getBid(){
		return bid;
	}

	public BonusMalus getBonusMalus(){
		return bonusMalus;
	}

	public List<PossessionGroundListItem> getPossessionGroundList(){
		return possessionGroundList;
	}

	public String getTerritoryChanged(){
		return territoryChanged;
	}

	public DrivingLimitationType getDrivingLimitationType(){
		return drivingLimitationType;
	}

	@Override
 	public String toString(){
		return 
			"InsuredVehicle{" + 
			"equipmentAdded = '" + equipmentAdded + '\'' + 
			",vehicleTypeId = '" + vehicleTypeId + '\'' + 
			",vehicleUsagePurpose = '" + vehicleUsagePurpose + '\'' + 
			",registrationMark = '" + registrationMark + '\'' + 
			",isInTransit = '" + isInTransit + '\'' + 
			",techInspectionMissing = '" + techInspectionMissing + '\'' + 
			",blankHasOperator = '" + blankHasOperator + '\'' + 
			",usePurposeList = '" + usePurposeList + '\'' + 
			",registrationCountry = '" + registrationCountry + '\'' + 
			",regDocumentSeries = '" + regDocumentSeries + '\'' + 
			",subjectId = '" + subjectId + '\'' + 
			",vehicleCategoryName = '" + vehicleCategoryName + '\'' + 
			",kladrTerritoryId = '" + kladrTerritoryId + '\'' + 
			",kladrTerritoryCode = '" + kladrTerritoryCode + '\'' + 
			",registrationDate = '" + registrationDate + '\'' + 
			",trailerUsed = '" + trailerUsed + '\'' + 
			",tractorUsePeriodDate = '" + tractorUsePeriodDate + '\'' + 
			",regDocTypeList = '" + regDocTypeList + '\'' + 
			",kladrRussia = '" + kladrRussia + '\'' + 
			",id = '" + id + '\'' + 
			",owner = '" + owner + '\'' + 
			",firstUsePeriod = '" + firstUsePeriod + '\'' + 
			",bonusMalusList = '" + bonusMalusList + '\'' + 
			",considerWear = '" + considerWear + '\'' + 
			",registrationCountryList = '" + registrationCountryList + '\'' + 
			",inspectionBlankIsMissing = '" + inspectionBlankIsMissing + '\'' + 
			",regDocType = '" + regDocType + '\'' + 
			",isNew = '" + isNew + '\'' + 
			",isForeignRegistration = '" + isForeignRegistration + '\'' + 
			",possessionGround = '" + possessionGround + '\'' + 
			",kladrTerritoryName = '" + kladrTerritoryName + '\'' + 
			",usedForDangerousCargo = '" + usedForDangerousCargo + '\'' + 
			",contractId = '" + contractId + '\'' + 
			",regDocumentNumber = '" + regDocumentNumber + '\'' + 
			",lastModified = '" + lastModified + '\'' + 
			",bid = '" + bid + '\'' + 
			",bonusMalus = '" + bonusMalus + '\'' + 
			",possessionGroundList = '" + possessionGroundList + '\'' + 
			",territoryChanged = '" + territoryChanged + '\'' + 
			",drivingLimitationType = '" + drivingLimitationType + '\'' + 
			"}";
		}
}