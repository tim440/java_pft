package ru.rgs.APITests.model.contracts.osago.submit;

import com.google.gson.annotations.SerializedName;
import ru.rgs.APITests.model.SearchInsurer.InsurerFull.FullInsurer;
import ru.rgs.APITests.model.SearchVehicle.full.VehicleFull;

import javax.annotation.Generated;
import java.util.List;

import static java.util.Arrays.asList;

@Generated("com.robohorse.robopojogenerator")
public class InsuredVehicle{

	@SerializedName("vehicleTypeId")
	private String vehicleTypeId;

	@SerializedName("vehicleUsagePurpose")
	private VehicleUsagePurpose vehicleUsagePurpose;

	@SerializedName("registrationMark")
	private String registrationMark;

	@SerializedName("techInspectionNextDate")
	private Object techInspectionNextDate;

	@SerializedName("isInTransit")
	private boolean isInTransit;

	@SerializedName("techInspectionMissing")
	private boolean techInspectionMissing;

	@SerializedName("blankHasOperator")
	private boolean blankHasOperator;

	@SerializedName("registrationCountry")
	private RegistrationCountry registrationCountry;

	@SerializedName("regDocumentSeries")
	private String regDocumentSeries;

	@SerializedName("subjectId")
	private String subjectId;

	@SerializedName("vehicleCategoryName")
	private String vehicleCategoryName;

	@SerializedName("sysEditor")
	private String sysEditor;

	@SerializedName("kladrTerritoryId")
	private String kladrTerritoryId;

	@SerializedName("registrationDate")
	private String registrationDate;

	@SerializedName("trailerUsed")
	private boolean trailerUsed;

	@SerializedName("kladrTerritoryCode")
	private String kladrTerritoryCode;

	@SerializedName("tractorUsePeriodDate")
	private String tractorUsePeriodDate;

	@SerializedName("kladrRussia")
	private boolean kladrRussia;

	@SerializedName("id")
	private String id;

	@SerializedName("thirdUsePeriod")
	private ThirdUsePeriod thirdUsePeriod;

	@SerializedName("actualCost")
	private String actualCost;

	@SerializedName("owner")
	private Owner owner;

	@SerializedName("firstUsePeriod")
	private FirstUsePeriod firstUsePeriod;

	@SerializedName("secondUsePeriod")
	private SecondUsePeriod secondUsePeriod;

	@SerializedName("inspectionBlankIsMissing")
	private boolean inspectionBlankIsMissing;

	@SerializedName("regDocType")
	private RegDocType regDocType;

	@SerializedName("techInspectionDate")
	private Object techInspectionDate;

	@SerializedName("isNew")
	private boolean isNew;

	@SerializedName("inspectionOperator")
	private InspectionOperator inspectionOperator;

	@SerializedName("isForeignRegistration")
	private boolean isForeignRegistration;

	@SerializedName("coeffValueList")
	private List<Object> coeffValueList;

	@SerializedName("possessionGround")
	private PossessionGround possessionGround;

	@SerializedName("techInspectionNumber")
	private String techInspectionNumber;

	@SerializedName("kladrTerritoryName")
	private String kladrTerritoryName;

	@SerializedName("usedForDangerousCargo")
	private boolean usedForDangerousCargo;

	@SerializedName("contractId")
	private String contractId;

	@SerializedName("regDocumentNumber")
	private String regDocumentNumber;

	@SerializedName("bid")
	private String bid;

	@SerializedName("bonusMalus")
	private BonusMalus bonusMalus;

	@SerializedName("territoryChanged")
	private boolean territoryChanged;

	@SerializedName("drivingLimitationType")
	private DrivingLimitationType drivingLimitationType;

	@SerializedName("osagoTerritory")
	private OsagoTerritory osagoTerritory;

	public InsuredVehicle(VehicleFull vehicleFull, FullInsurer fullInsurer, String contractStartDate, String contractEndDate) {
		this.vehicleTypeId = vehicleFull.getVehicleType().getId();
		this.vehicleUsagePurpose = new VehicleUsagePurpose();
		this.registrationMark = "А111АА750";
		this.techInspectionNextDate = null;
		this.isInTransit = false;
		this.techInspectionMissing = true;
		this.blankHasOperator = false;
		this.registrationCountry = new RegistrationCountry();
		this.regDocType = new RegDocType();
		this.regDocumentSeries = "456456";
		this.regDocumentNumber = "48464544";
		this.registrationDate = "2000-01-01T00:00:00";
		this.subjectId = vehicleFull.getId();
		this.vehicleCategoryName = "Категория B";
		this.sysEditor = vehicleFull.getSysEditor();
        this.kladrRussia = true;
        this.kladrTerritoryId = "22216";
        this.kladrTerritoryName = "Алтайский край, г. Алейск";
        this.kladrTerritoryCode = "";
        this.trailerUsed = false;
		this.tractorUsePeriodDate = "2014-01-01T00:00:00";
		this.id = "";
		this.actualCost = "";
		this.owner = new Owner(fullInsurer);
		this.firstUsePeriod = new FirstUsePeriod(contractStartDate, contractEndDate);
		this.secondUsePeriod = new SecondUsePeriod();
        this.thirdUsePeriod = new ThirdUsePeriod();
        this.inspectionBlankIsMissing = false;
		this.techInspectionDate = null;
		this.isNew = false;
		this.inspectionOperator = new InspectionOperator();
		this.isForeignRegistration = false;
		this.coeffValueList = asList();
		this.possessionGround = new PossessionGround();
		this.techInspectionNumber = "";
		this.usedForDangerousCargo = false;
		this.contractId = "";
		this.bid = vehicleFull.getBid();
		this.bonusMalus = new BonusMalus("M");
		this.territoryChanged = false;
		this.drivingLimitationType = new DrivingLimitationType();
		this.osagoTerritory = new OsagoTerritory();
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

	public Object getTechInspectionNextDate(){
		return techInspectionNextDate;
	}

	public boolean isIsInTransit(){
		return isInTransit;
	}

	public boolean isTechInspectionMissing(){
		return techInspectionMissing;
	}

	public boolean isBlankHasOperator(){
		return blankHasOperator;
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

	public String getSysEditor(){
		return sysEditor;
	}

	public String getKladrTerritoryId(){
		return kladrTerritoryId;
	}

	public String getRegistrationDate(){
		return registrationDate;
	}

	public boolean isTrailerUsed(){
		return trailerUsed;
	}

	public String getKladrTerritoryCode(){
		return kladrTerritoryCode;
	}

	public String getTractorUsePeriodDate(){
		return tractorUsePeriodDate;
	}

	public boolean isKladrRussia(){
		return kladrRussia;
	}

	public String getId(){
		return id;
	}

	public ThirdUsePeriod getThirdUsePeriod(){
		return thirdUsePeriod;
	}

	public String getActualCost(){
		return actualCost;
	}

	public Owner getOwner(){
		return owner;
	}

	public FirstUsePeriod getFirstUsePeriod(){
		return firstUsePeriod;
	}

	public SecondUsePeriod getSecondUsePeriod(){
		return secondUsePeriod;
	}

	public boolean isInspectionBlankIsMissing(){
		return inspectionBlankIsMissing;
	}

	public RegDocType getRegDocType(){
		return regDocType;
	}

	public Object getTechInspectionDate(){
		return techInspectionDate;
	}

	public boolean isIsNew(){
		return isNew;
	}

	public InspectionOperator getInspectionOperator(){
		return inspectionOperator;
	}

	public boolean isIsForeignRegistration(){
		return isForeignRegistration;
	}

	public List<Object> getCoeffValueList(){
		return coeffValueList;
	}

	public PossessionGround getPossessionGround(){
		return possessionGround;
	}

	public String getTechInspectionNumber(){
		return techInspectionNumber;
	}

	public String getKladrTerritoryName(){
		return kladrTerritoryName;
	}

	public boolean isUsedForDangerousCargo(){
		return usedForDangerousCargo;
	}

	public String getContractId(){
		return contractId;
	}

	public String getRegDocumentNumber(){
		return regDocumentNumber;
	}

	public String getBid(){
		return bid;
	}

	public BonusMalus getBonusMalus(){
		return bonusMalus;
	}

	public boolean isTerritoryChanged(){
		return territoryChanged;
	}

	public DrivingLimitationType getDrivingLimitationType(){
		return drivingLimitationType;
	}

	public OsagoTerritory getOsagoTerritory(){
		return osagoTerritory;
	}

	@Override
 	public String toString(){
		return 
			"InsuredVehicle{" + 
			"vehicleTypeId = '" + vehicleTypeId + '\'' + 
			",vehicleUsagePurpose = '" + vehicleUsagePurpose + '\'' + 
			",registrationMark = '" + registrationMark + '\'' + 
			",techInspectionNextDate = '" + techInspectionNextDate + '\'' + 
			",isInTransit = '" + isInTransit + '\'' + 
			",techInspectionMissing = '" + techInspectionMissing + '\'' + 
			",blankHasOperator = '" + blankHasOperator + '\'' + 
			",registrationCountry = '" + registrationCountry + '\'' + 
			",regDocumentSeries = '" + regDocumentSeries + '\'' + 
			",subjectId = '" + subjectId + '\'' + 
			",vehicleCategoryName = '" + vehicleCategoryName + '\'' + 
			",sysEditor = '" + sysEditor + '\'' + 
			",kladrTerritoryId = '" + kladrTerritoryId + '\'' + 
			",registrationDate = '" + registrationDate + '\'' + 
			",trailerUsed = '" + trailerUsed + '\'' + 
			",kladrTerritoryCode = '" + kladrTerritoryCode + '\'' + 
			",tractorUsePeriodDate = '" + tractorUsePeriodDate + '\'' + 
			",kladrRussia = '" + kladrRussia + '\'' + 
			",id = '" + id + '\'' + 
			",thirdUsePeriod = '" + thirdUsePeriod + '\'' + 
			",actualCost = '" + actualCost + '\'' + 
			",owner = '" + owner + '\'' + 
			",firstUsePeriod = '" + firstUsePeriod + '\'' + 
			",secondUsePeriod = '" + secondUsePeriod + '\'' + 
			",inspectionBlankIsMissing = '" + inspectionBlankIsMissing + '\'' + 
			",regDocType = '" + regDocType + '\'' + 
			",techInspectionDate = '" + techInspectionDate + '\'' + 
			",isNew = '" + isNew + '\'' + 
			",inspectionOperator = '" + inspectionOperator + '\'' + 
			",isForeignRegistration = '" + isForeignRegistration + '\'' + 
			",coeffValueList = '" + coeffValueList + '\'' + 
			",possessionGround = '" + possessionGround + '\'' + 
			",techInspectionNumber = '" + techInspectionNumber + '\'' + 
			",kladrTerritoryName = '" + kladrTerritoryName + '\'' + 
			",usedForDangerousCargo = '" + usedForDangerousCargo + '\'' + 
			",contractId = '" + contractId + '\'' + 
			",regDocumentNumber = '" + regDocumentNumber + '\'' + 
			",bid = '" + bid + '\'' + 
			",bonusMalus = '" + bonusMalus + '\'' + 
			",territoryChanged = '" + territoryChanged + '\'' + 
			",drivingLimitationType = '" + drivingLimitationType + '\'' + 
			",osagoTerritory = '" + osagoTerritory + '\'' + 
			"}";
		}
}