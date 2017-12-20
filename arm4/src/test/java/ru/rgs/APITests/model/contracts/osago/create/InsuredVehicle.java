package ru.rgs.APITests.model.contracts.osago.create;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class InsuredVehicle{

	@SerializedName("equipmentAdded")
	private String equipmentAdded;

	@SerializedName("bonusMalusList")
	private List<BonusMalusListItem> bonusMalusList;

	@SerializedName("vehicleUsagePurpose")
	private VehicleUsagePurpose vehicleUsagePurpose;

	@SerializedName("considerWear")
	private String considerWear;

	@SerializedName("registrationCountryList")
	private List<RegistrationCountryListItem> registrationCountryList;

	@SerializedName("inspectionBlankIsMissing")
	private String inspectionBlankIsMissing;

	@SerializedName("regDocType")
	private RegDocType regDocType;

	@SerializedName("isInTransit")
	private String isInTransit;

	@SerializedName("isNew")
	private String isNew;

	@SerializedName("techInspectionMissing")
	private String techInspectionMissing;

	@SerializedName("blankHasOperator")
	private String blankHasOperator;

	@SerializedName("isForeignRegistration")
	private String isForeignRegistration;

	@SerializedName("usePurposeList")
	private List<UsePurposeListItem> usePurposeList;

	@SerializedName("registrationCountry")
	private RegistrationCountry registrationCountry;

	@SerializedName("possessionGround")
	private PossessionGround possessionGround;

	@SerializedName("usedForDangerousCargo")
	private String usedForDangerousCargo;

	@SerializedName("trailerUsed")
	private String trailerUsed;

	@SerializedName("tractorUsePeriodDate")
	private String tractorUsePeriodDate;

	@SerializedName("regDocTypeList")
	private List<RegDocTypeListItem> regDocTypeList;

	@SerializedName("kladrRussia")
	private String kladrRussia;

	@SerializedName("possessionGroundList")
	private List<PossessionGroundListItem> possessionGroundList;

	@SerializedName("territoryChanged")
	private String territoryChanged;

	public String getEquipmentAdded(){
		return equipmentAdded;
	}

	public List<BonusMalusListItem> getBonusMalusList(){
		return bonusMalusList;
	}

	public VehicleUsagePurpose getVehicleUsagePurpose(){
		return vehicleUsagePurpose;
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

	public String getIsInTransit(){
		return isInTransit;
	}

	public String getIsNew(){
		return isNew;
	}

	public String getTechInspectionMissing(){
		return techInspectionMissing;
	}

	public String getBlankHasOperator(){
		return blankHasOperator;
	}

	public String getIsForeignRegistration(){
		return isForeignRegistration;
	}

	public List<UsePurposeListItem> getUsePurposeList(){
		return usePurposeList;
	}

	public RegistrationCountry getRegistrationCountry(){
		return registrationCountry;
	}

	public PossessionGround getPossessionGround(){
		return possessionGround;
	}

	public String getUsedForDangerousCargo(){
		return usedForDangerousCargo;
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

	public List<PossessionGroundListItem> getPossessionGroundList(){
		return possessionGroundList;
	}

	public String getTerritoryChanged(){
		return territoryChanged;
	}

	@Override
 	public String toString(){
		return 
			"InsuredVehicle{" + 
			"equipmentAdded = '" + equipmentAdded + '\'' + 
			",bonusMalusList = '" + bonusMalusList + '\'' + 
			",vehicleUsagePurpose = '" + vehicleUsagePurpose + '\'' + 
			",considerWear = '" + considerWear + '\'' + 
			",registrationCountryList = '" + registrationCountryList + '\'' + 
			",inspectionBlankIsMissing = '" + inspectionBlankIsMissing + '\'' + 
			",regDocType = '" + regDocType + '\'' + 
			",isInTransit = '" + isInTransit + '\'' + 
			",isNew = '" + isNew + '\'' + 
			",techInspectionMissing = '" + techInspectionMissing + '\'' + 
			",blankHasOperator = '" + blankHasOperator + '\'' + 
			",isForeignRegistration = '" + isForeignRegistration + '\'' + 
			",usePurposeList = '" + usePurposeList + '\'' + 
			",registrationCountry = '" + registrationCountry + '\'' + 
			",possessionGround = '" + possessionGround + '\'' + 
			",usedForDangerousCargo = '" + usedForDangerousCargo + '\'' + 
			",trailerUsed = '" + trailerUsed + '\'' + 
			",tractorUsePeriodDate = '" + tractorUsePeriodDate + '\'' + 
			",regDocTypeList = '" + regDocTypeList + '\'' + 
			",kladrRussia = '" + kladrRussia + '\'' + 
			",possessionGroundList = '" + possessionGroundList + '\'' + 
			",territoryChanged = '" + territoryChanged + '\'' + 
			"}";
		}
}