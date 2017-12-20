package ru.rgs.APITests.model.contracts.osago.submit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import ru.rgs.APITests.model.SearchInsurer.InsurerFull.FullInsurer;
import ru.rgs.APITests.model.SearchVehicle.full.VehicleFull;
import ru.rgs.APITests.model.contracts.osago.create.OsagoCreate;

import javax.annotation.Generated;
import java.util.List;

import static java.util.Arrays.asList;

@Generated("com.robohorse.robopojogenerator")
public class OsagoSubmit{

	@SerializedName("contractType")
	private ContractType contractType;

	@SerializedName("coInsuranceRole")
	private CoInsuranceRole coInsuranceRole;

	@SerializedName("removedChangeId")
	private String removedChangeId;

	@SerializedName("program")
	private Program program;

	@SerializedName("branch")
	private Branch branch;

	@SerializedName("parentContractOption")
	private ParentContractOption parentContractOption;

	@SerializedName("sapContractId")
	private String sapContractId;

	@SerializedName("validationLogList")
	private List<Object> validationLogList;

	@SerializedName("number")
	private String number;

	@SerializedName("currentContractChange")
	private CurrentContractChange currentContractChange;

	@SerializedName("autoDealer")
	private AutoDealer autoDealer;

	@SerializedName("principalInsuranceCompany")
	private PrincipalInsuranceCompany principalInsuranceCompany;

	@SerializedName("financialUnit")
	private FinancialUnit financialUnit;

	@SerializedName("id")
	private String id;

	@SerializedName("targetChangeTypeCode")
	private String targetChangeTypeCode;

	@SerializedName("sourceTchInspVehicleId")
	private String sourceTchInspVehicleId;

	@SerializedName("otherPartner")
	private OtherPartner otherPartner;

	@SerializedName("isReceivedPrimaryDoc")
	private boolean isReceivedPrimaryDoc;

	@SerializedName("premiumChargeType")
	private PremiumChargeType premiumChargeType;

	@SerializedName("insurerPersonTypeCode")
	private String insurerPersonTypeCode;

	@SerializedName("blankChangeReasonDto")
	private String blankChangeReasonDto;

	@SerializedName("rsaBonusMalusId")
	private String rsaBonusMalusId;

	@SerializedName("creationType")
	private CreationType creationType;

	@SerializedName("serviceStationList")
	private List<Object> serviceStationList;

	@SerializedName("saleChannel")
	private SaleChannel saleChannel;

	@SerializedName("bonusMalusCoeffValue")
	private int bonusMalusCoeffValue;

	@SerializedName("coInsuranceCompany")
	private CoInsuranceCompany coInsuranceCompany;

	@SerializedName("premiumChanged")
	private boolean premiumChanged;

	@SerializedName("status")
	private Status status;

	@SerializedName("noBlank")
	private boolean noBlank;

	@SerializedName("insuredVehicle")
	private InsuredVehicle insuredVehicle;

	@SerializedName("previousDocumentList")
	private String previousDocumentList;

	@SerializedName("vehicleName")
	private String vehicleName;

	@SerializedName("insuredVehicleId")
	private String insuredVehicleId;

	@SerializedName("lastContractDate")
	private Object lastContractDate;

	@SerializedName("isCoInsurance")
	private boolean isCoInsurance;

	@SerializedName("agentStatementNumber")
	private String agentStatementNumber;

	@SerializedName("debitWriteOffReason")
	private DebitWriteOffReason debitWriteOffReason;

	@SerializedName("vehicle")
	private Vehicle vehicle;

	@SerializedName("sapNotMigratedStatementNumberList")
	private String sapNotMigratedStatementNumberList;

	@SerializedName("premium")
	private int premium;

	@SerializedName("osagoChassisStartDate")
	private String osagoChassisStartDate;

	@SerializedName("insurer")
	private Insurer insurer;

	@SerializedName("insBridgeParamHash")
	private String insBridgeParamHash;

	@SerializedName("liabilityEndDate")
	private Object liabilityEndDate;

	@SerializedName("currency")
	private Currency currency;

	@SerializedName("cancelReason")
	private CancelReasonWithCode cancelReasonWithCode;

	@SerializedName("insbridgePremiumCalculateStartDate")
	private String insbridgePremiumCalculateStartDate;

	@SerializedName("osagoSchema17StartDate")
	private String osagoSchema17StartDate;

	@SerializedName("product")
	private Product product;

	@SerializedName("isStateProcurement")
	private boolean isStateProcurement;

	@SerializedName("rsaKbmStartDate")
	private String rsaKbmStartDate;

	@SerializedName("osagoStoaStartDate")
	private String osagoStoaStartDate;

	@SerializedName("parentId")
	private String parentId;

	@SerializedName("insurerId")
	private String insurerId;

	@SerializedName("agentStatementId")
	private String agentStatementId;

	@SerializedName("agentStatementDate")
	private String agentStatementDate;

	@SerializedName("series")
	private String series;

	@SerializedName("coInsuranceTotalPremium")
	private int coInsuranceTotalPremium;

	@SerializedName("bonusMalus")
	private BonusMalus bonusMalus;

	@SerializedName("previousInsuranceCompany")
	private PreviousInsuranceCompany previousInsuranceCompany;

	@SerializedName("previousContractNumber")
	private String previousContractNumber;

	@SerializedName("contractDate")
	private String contractDate;

	@SerializedName("agentRoleList")
	private List<Object> agentRoleList;

	@SerializedName("contractChangeList")
	private String contractChangeList;

	@SerializedName("claimReturnList")
	private List<Object> claimReturnList;

	@SerializedName("coInsuranceStartDate")
	private String coInsuranceStartDate;

	@SerializedName("vehicleSysEditor")
	private String vehicleSysEditor;

	@SerializedName("project")
	private Project project;

	@SerializedName("office")
	private Office office;

	@SerializedName("insuranceActNumber")
	private String insuranceActNumber;

	@SerializedName("commissionList")
	private String commissionList;

	@SerializedName("driverList")
	private List<Object> driverList;

	@SerializedName("segmentActivateStartDate")
	private String segmentActivateStartDate;

	@SerializedName("sysEditor")
	private String sysEditor;

	@SerializedName("insurerIsOwner")
	private boolean insurerIsOwner;

	@SerializedName("reissueDate")
	private Object reissueDate;

	@SerializedName("sysCreator")
	private String sysCreator;

	@SerializedName("contractTypeClass")
	private ContractTypeClass contractTypeClass;

	@SerializedName("statementStatusCode")
	private String statementStatusCode;

	@SerializedName("sector")
	private Sector sector;

	@SerializedName("isServiceStation")
	private boolean isServiceStation;

	@SerializedName("ownerKbmRsaTypeId")
	private String ownerKbmRsaTypeId;

	@SerializedName("contractStartDate")
	private String contractStartDate;

	@SerializedName("insurerSysEditor")
	private String insurerSysEditor;

	@SerializedName("leasingCompany")
	private LeasingCompany leasingCompany;

	@SerializedName("isActivateAgentFromAnotherBranch")
	private boolean isActivateAgentFromAnotherBranch;

	@SerializedName("agentName")
	private String agentName;

	@SerializedName("debitWriteOffDate")
	private Object debitWriteOffDate;

	@SerializedName("isReinsure")
	private boolean isReinsure;

	@SerializedName("insurerHasCellPhone")
	private boolean insurerHasCellPhone;

	@SerializedName("productVariant")
	private ProductVariant productVariant;

	@SerializedName("isEmptySourceCheckSum")
	private boolean isEmptySourceCheckSum;

	@SerializedName("premiumCalcDate")
	private Object premiumCalcDate;

	@SerializedName("isCoInsuranceLeaderPayType")
	private Object isCoInsuranceLeaderPayType;

	@SerializedName("checkSum")
	private String checkSum;

	@SerializedName("lastModified")
	private Object lastModified;

	@SerializedName("bankIntermediary")
	private BankIntermediary bankIntermediary;

	@SerializedName("claimReturnSum")
	private int claimReturnSum;

	@SerializedName("sapMigrationReasonCode")
	private String sapMigrationReasonCode;

	@SerializedName("agentInsuranceCompany")
	private AgentInsuranceCompany agentInsuranceCompany;

	@SerializedName("agentId")
	private String agentId;

	@SerializedName("cancelDate")
	private Object cancelDate;

	@SerializedName("stateProcurementStartDate")
	private String stateProcurementStartDate;

	@SerializedName("existActiveAsyncRequest")
	private boolean existActiveAsyncRequest;

	@SerializedName("rsaPreviousInsuranceCompanyName")
	private String rsaPreviousInsuranceCompanyName;

	@SerializedName("hasViolations")
	private boolean hasViolations;

	@SerializedName("liabilityStartDate")
	private Object liabilityStartDate;

	@SerializedName("factAccruedPremiumDateStartDate")
	private String factAccruedPremiumDateStartDate;

	@SerializedName("saleGroup")
	private SaleGroup saleGroup;

	@SerializedName("segmentRequestStatusName")
	private String segmentRequestStatusName;

	@SerializedName("reinsureStartDate")
	private String reinsureStartDate;

	@SerializedName("factAccruedPremium")
	private int factAccruedPremium;

	@SerializedName("agentList")
	private List<Object> agentList;

	@SerializedName("department")
	private Department department;

	@SerializedName("kbmRsaId")
	private String kbmRsaId;

	@SerializedName("activeAgentRolesDate")
	private Object activeAgentRolesDate;

	@SerializedName("insurerChangeId")
	private String insurerChangeId;

	@SerializedName("comments")
	private String comments;

	@SerializedName("contractOption")
	private ContractOption contractOption;

	@SerializedName("targetChangeId")
	private String targetChangeId;

	@SerializedName("contractEndDate")
	private String contractEndDate;

	@SerializedName("cancelStatementDate")
	private Object cancelStatementDate;

	@SerializedName("requestSource")
	private RequestSource requestSource;

	@SerializedName("smsSubscription")
	private boolean smsSubscription;

	@SerializedName("insurerName")
	private String insurerName;

	@SerializedName("paymentList")
	private List<Object> paymentList;

	@SerializedName("contractTypeClassStartDate")
	private String contractTypeClassStartDate;

	@SerializedName("blankDto")
	private BlankDto blankDto;

	@SerializedName("premiumRur")
	private int premiumRur;

	@SerializedName("contractPremiumHash")
	private String contractPremiumHash;

	@SerializedName("entityPurpose")
	private String entityPurpose;

	@SerializedName("liabilitySum")
	private int liabilitySum;

	@SerializedName("calculatedPremium")
	private int calculatedPremium;

	@SerializedName("isProcessPersInfo")
	private boolean isProcessPersInfo;

	@SerializedName("personLinkList")
	private List<Object> personLinkList;

	@SerializedName("previousContractSeries")
	private String previousContractSeries;

	@SerializedName("kbmRsaManualId")
	private String kbmRsaManualId;

	@SerializedName("isProcessPersInfoEmpty")
	private boolean isProcessPersInfoEmpty;

    public OsagoSubmit(OsagoCreate osagoCreate, FullInsurer fullInsurer, VehicleFull vehicleFull) {
    	Gson gson = new GsonBuilder().serializeNulls().create();
        this.series = "ЕЕЕ";
        this.number = "2000000001";
        this.contractDate = "2017-11-01T00:00:00";
        this.contractStartDate = "2017-11-01T00:00:00";
        this.contractEndDate = "2018-10-31T00:00:00";
        this.insurerId = fullInsurer.getId();
        this.insurerChangeId = fullInsurer.getEntityChangeId();
        this.insurerName = fullInsurer.getDisplayName();
        this.insurerHasCellPhone = true;
        this.insurerPersonTypeCode = fullInsurer.getPersonType().getCode();
        this.insurerSysEditor = "";
        this.contractType = new ContractType(osagoCreate);
        this.coInsuranceRole = new CoInsuranceRole();
        this.removedChangeId = "";
        this.program = new Program();
        this.branch = new Branch(osagoCreate);
        this.parentContractOption = new ParentContractOption();
        this.sapContractId = "";
        this.validationLogList = asList();
        this.currentContractChange = new CurrentContractChange(osagoCreate);
        this.autoDealer = new AutoDealer();
        this.principalInsuranceCompany = new PrincipalInsuranceCompany();
        this.financialUnit = new FinancialUnit();
        this.id = "";
        this.targetChangeTypeCode = "";
        this.sourceTchInspVehicleId = "";
        this.otherPartner = new OtherPartner();
        this.isReceivedPrimaryDoc = false;
        this.premiumChargeType = new PremiumChargeType();
        this.blankChangeReasonDto = "";
        this.rsaBonusMalusId = "";
        this.creationType = new CreationType();
        this.serviceStationList = asList();
        this.saleChannel = new SaleChannel(osagoCreate);
        this.bonusMalusCoeffValue = 0;
        this.coInsuranceCompany = new CoInsuranceCompany();
        this.premiumChanged = false;
        this.status = new Status();
        this.noBlank = false;
        this.insuredVehicle = new InsuredVehicle(vehicleFull, fullInsurer, this.contractStartDate, this.contractEndDate);
        this.previousDocumentList = "";
        this.vehicleName = "";
        this.insuredVehicleId = "";
        this.lastContractDate = null;
        this.isCoInsurance = false;
        this.agentStatementId = osagoCreate.getCreateOperationResult().getCreateObject().getAgentStatementId();
        this.agentStatementDate = osagoCreate.getCreateOperationResult().getCreateObject().getAgentStatementDate();
        this.agentStatementNumber = osagoCreate.getCreateOperationResult().getCreateObject().getAgentStatementNumber();
        this.debitWriteOffReason = new DebitWriteOffReason();
        this.vehicle = new Vehicle();
        this.sapNotMigratedStatementNumberList = "";
        this.premium = 10000;
        this.osagoChassisStartDate = osagoCreate.getCreateOperationResult().getCreateObject().getOsagoStoaStartDate();
        this.insurer = new Insurer(fullInsurer);
        this.insBridgeParamHash = "";
        this.liabilityEndDate = null;
        this.currency = new Currency(osagoCreate);
        this.cancelReasonWithCode = new CancelReasonWithCode();
        this.insbridgePremiumCalculateStartDate = osagoCreate.getCreateOperationResult().getCreateObject().getInsbridgePremiumCalculateStartDate();
        this.osagoSchema17StartDate = osagoCreate.getCreateOperationResult().getCreateObject().getOsagoSchema17StartDate();
        this.product = new Product(osagoCreate);
        this.isStateProcurement = false;
        this.rsaKbmStartDate = osagoCreate.getCreateOperationResult().getCreateObject().getRsaKbmStartDate();
        this.osagoStoaStartDate = osagoCreate.getCreateOperationResult().getCreateObject().getOsagoStoaStartDate();
        this.parentId = "";
        this.coInsuranceTotalPremium = 0;
        this.bonusMalus = new BonusMalus("M");
        this.previousInsuranceCompany = new PreviousInsuranceCompany();
        this.previousContractNumber = "";
        this.agentRoleList = asList();
        this.contractChangeList = "";
        this.claimReturnList = asList();
        this.coInsuranceStartDate = osagoCreate.getCreateOperationResult().getCreateObject().getCoInsuranceStartDate();
        this.vehicleSysEditor = "";
        this.project = new Project();
        this.office = new Office(osagoCreate);
        this.insuranceActNumber = "";
        this.commissionList = "";
        this.driverList = asList();
        this.segmentActivateStartDate = osagoCreate.getCreateOperationResult().getCreateObject().getSegmentActivateStartDate();
        this.sysEditor = osagoCreate.getCreateOperationResult().getCreateObject().getSysEditor();
        this.insurerIsOwner = false;
        this.reissueDate = null;
        this.sysCreator = "1";
        this.contractTypeClass = new ContractTypeClass(osagoCreate);
        this.statementStatusCode = osagoCreate.getCreateOperationResult().getCreateObject().getStatementStatusCode();
        this.sector = new Sector();
        this.isServiceStation = false;
        this.ownerKbmRsaTypeId = "";
        this.leasingCompany = new LeasingCompany();
        this.isActivateAgentFromAnotherBranch = true;
        this.agentName = osagoCreate.getCreateOperationResult().getCreateObject().getAgentName();
        this.agentId = osagoCreate.getCreateOperationResult().getCreateObject().getAgentId();
        this.debitWriteOffDate = null;
        this.isReinsure = false;
        this.productVariant = new ProductVariant();
        this.isEmptySourceCheckSum = true;
        this.premiumCalcDate = null;
        this.isCoInsuranceLeaderPayType = null;
        this.checkSum = "";
        this.lastModified = null;
        this.bankIntermediary = new BankIntermediary();
        this.claimReturnSum = 0;
        this.sapMigrationReasonCode = "";
        this.agentInsuranceCompany = new AgentInsuranceCompany();
        this.cancelDate = null;
        this.stateProcurementStartDate = osagoCreate.getCreateOperationResult().getCreateObject().getStateProcurementStartDate();
        this.existActiveAsyncRequest = false;
        this.rsaPreviousInsuranceCompanyName = "";
        this.hasViolations = false;
        this.liabilityStartDate = null;
        this.factAccruedPremiumDateStartDate = "2017-05-01T00:00:00";
        this.saleGroup = new SaleGroup(osagoCreate);
        this.segmentRequestStatusName = "Сегменты не определены";
        this.reinsureStartDate = osagoCreate.getCreateOperationResult().getCreateObject().getReinsureStartDate();
        this.factAccruedPremium = 0;
        this.agentList = asList();
        this.department = new Department();
        this.kbmRsaId = "";
        this.activeAgentRolesDate = null;
        this.comments = "";
        this.contractOption = new ContractOption(osagoCreate);
        this.targetChangeId = "";
        this.cancelStatementDate = null;
        this.requestSource = new RequestSource();
        this.smsSubscription = false;
        this.paymentList = asList();
        this.contractTypeClassStartDate = osagoCreate.getCreateOperationResult().getCreateObject().getContractTypeClassStartDate();
        this.blankDto = new BlankDto();
        this.premiumRur = 0;
        this.contractPremiumHash = "";
        this.entityPurpose = "1";
        this.liabilitySum = 0;
        this.calculatedPremium = 0;
        this.isProcessPersInfo = true;
        this.personLinkList = asList();
        this.previousContractSeries = "";
        this.kbmRsaManualId = "";
        this.isProcessPersInfoEmpty = false;
    }

    public ContractType getContractType(){
		return contractType;
	}

	public CoInsuranceRole getCoInsuranceRole(){
		return coInsuranceRole;
	}

	public String getRemovedChangeId(){
		return removedChangeId;
	}

	public Program getProgram(){
		return program;
	}

	public Branch getBranch(){
		return branch;
	}

	public ParentContractOption getParentContractOption(){
		return parentContractOption;
	}

	public String getSapContractId(){
		return sapContractId;
	}

	public List<Object> getValidationLogList(){
		return validationLogList;
	}

	public String getNumber(){
		return number;
	}

	public CurrentContractChange getCurrentContractChange(){
		return currentContractChange;
	}

	public AutoDealer getAutoDealer(){
		return autoDealer;
	}

	public PrincipalInsuranceCompany getPrincipalInsuranceCompany(){
		return principalInsuranceCompany;
	}

	public FinancialUnit getFinancialUnit(){
		return financialUnit;
	}

	public String getId(){
		return id;
	}

	public String getTargetChangeTypeCode(){
		return targetChangeTypeCode;
	}

	public String getSourceTchInspVehicleId(){
		return sourceTchInspVehicleId;
	}

	public OtherPartner getOtherPartner(){
		return otherPartner;
	}

	public boolean isIsReceivedPrimaryDoc(){
		return isReceivedPrimaryDoc;
	}

	public PremiumChargeType getPremiumChargeType(){
		return premiumChargeType;
	}

	public String getInsurerPersonTypeCode(){
		return insurerPersonTypeCode;
	}

	public String getBlankChangeReasonDto(){
		return blankChangeReasonDto;
	}

	public String getRsaBonusMalusId(){
		return rsaBonusMalusId;
	}

	public CreationType getCreationType(){
		return creationType;
	}

	public List<Object> getServiceStationList(){
		return serviceStationList;
	}

	public SaleChannel getSaleChannel(){
		return saleChannel;
	}

	public int getBonusMalusCoeffValue(){
		return bonusMalusCoeffValue;
	}

	public CoInsuranceCompany getCoInsuranceCompany(){
		return coInsuranceCompany;
	}

	public boolean isPremiumChanged(){
		return premiumChanged;
	}

	public Status getStatus(){
		return status;
	}

	public boolean isNoBlank(){
		return noBlank;
	}

	public InsuredVehicle getInsuredVehicle(){
		return insuredVehicle;
	}

	public String getPreviousDocumentList(){
		return previousDocumentList;
	}

	public String getVehicleName(){
		return vehicleName;
	}

	public String getInsuredVehicleId(){
		return insuredVehicleId;
	}

	public Object getLastContractDate(){
		return lastContractDate;
	}

	public boolean isIsCoInsurance(){
		return isCoInsurance;
	}

	public String getAgentStatementNumber(){
		return agentStatementNumber;
	}

	public DebitWriteOffReason getDebitWriteOffReason(){
		return debitWriteOffReason;
	}

	public Vehicle getVehicle(){
		return vehicle;
	}

	public String getSapNotMigratedStatementNumberList(){
		return sapNotMigratedStatementNumberList;
	}

	public int getPremium(){
		return premium;
	}

	public String getOsagoChassisStartDate(){
		return osagoChassisStartDate;
	}

	public Insurer getInsurer(){
		return insurer;
	}

	public String getInsBridgeParamHash(){
		return insBridgeParamHash;
	}

	public Object getLiabilityEndDate(){
		return liabilityEndDate;
	}

	public Currency getCurrency(){
		return currency;
	}

	public CancelReasonWithCode getCancelReasonWithCode(){
		return cancelReasonWithCode;
	}

	public String getInsbridgePremiumCalculateStartDate(){
		return insbridgePremiumCalculateStartDate;
	}

	public String getOsagoSchema17StartDate(){
		return osagoSchema17StartDate;
	}

	public Product getProduct(){
		return product;
	}

	public boolean isIsStateProcurement(){
		return isStateProcurement;
	}

	public String getRsaKbmStartDate(){
		return rsaKbmStartDate;
	}

	public String getOsagoStoaStartDate(){
		return osagoStoaStartDate;
	}

	public String getParentId(){
		return parentId;
	}

	public String getInsurerId(){
		return insurerId;
	}

	public String getAgentStatementId(){
		return agentStatementId;
	}

	public String getAgentStatementDate(){
		return agentStatementDate;
	}

	public String getSeries(){
		return series;
	}

	public int getCoInsuranceTotalPremium(){
		return coInsuranceTotalPremium;
	}

	public BonusMalus getBonusMalus(){
		return bonusMalus;
	}

	public PreviousInsuranceCompany getPreviousInsuranceCompany(){
		return previousInsuranceCompany;
	}

	public String getPreviousContractNumber(){
		return previousContractNumber;
	}

	public String getContractDate(){
		return contractDate;
	}

	public List<Object> getAgentRoleList(){
		return agentRoleList;
	}

	public String getContractChangeList(){
		return contractChangeList;
	}

	public List<Object> getClaimReturnList(){
		return claimReturnList;
	}

	public String getCoInsuranceStartDate(){
		return coInsuranceStartDate;
	}

	public String getVehicleSysEditor(){
		return vehicleSysEditor;
	}

	public Project getProject(){
		return project;
	}

	public Office getOffice(){
		return office;
	}

	public String getInsuranceActNumber(){
		return insuranceActNumber;
	}

	public String getCommissionList(){
		return commissionList;
	}

	public List<Object> getDriverList(){
		return driverList;
	}

	public String getSegmentActivateStartDate(){
		return segmentActivateStartDate;
	}

	public String getSysEditor(){
		return sysEditor;
	}

	public boolean isInsurerIsOwner(){
		return insurerIsOwner;
	}

	public Object getReissueDate(){
		return reissueDate;
	}

	public String getSysCreator(){
		return sysCreator;
	}

	public ContractTypeClass getContractTypeClass(){
		return contractTypeClass;
	}

	public String getStatementStatusCode(){
		return statementStatusCode;
	}

	public Sector getSector(){
		return sector;
	}

	public boolean isIsServiceStation(){
		return isServiceStation;
	}

	public String getOwnerKbmRsaTypeId(){
		return ownerKbmRsaTypeId;
	}

	public String getContractStartDate(){
		return contractStartDate;
	}

	public String getInsurerSysEditor(){
		return insurerSysEditor;
	}

	public LeasingCompany getLeasingCompany(){
		return leasingCompany;
	}

	public boolean isIsActivateAgentFromAnotherBranch(){
		return isActivateAgentFromAnotherBranch;
	}

	public String getAgentName(){
		return agentName;
	}

	public Object getDebitWriteOffDate(){
		return debitWriteOffDate;
	}

	public boolean isIsReinsure(){
		return isReinsure;
	}

	public boolean isInsurerHasCellPhone(){
		return insurerHasCellPhone;
	}

	public ProductVariant getProductVariant(){
		return productVariant;
	}

	public boolean isIsEmptySourceCheckSum(){
		return isEmptySourceCheckSum;
	}

	public Object getPremiumCalcDate(){
		return premiumCalcDate;
	}

	public Object getIsCoInsuranceLeaderPayType(){
		return isCoInsuranceLeaderPayType;
	}

	public String getCheckSum(){
		return checkSum;
	}

	public Object getLastModified(){
		return lastModified;
	}

	public BankIntermediary getBankIntermediary(){
		return bankIntermediary;
	}

	public int getClaimReturnSum(){
		return claimReturnSum;
	}

	public String getSapMigrationReasonCode(){
		return sapMigrationReasonCode;
	}

	public AgentInsuranceCompany getAgentInsuranceCompany(){
		return agentInsuranceCompany;
	}

	public String getAgentId(){
		return agentId;
	}

	public Object getCancelDate(){
		return cancelDate;
	}

	public String getStateProcurementStartDate(){
		return stateProcurementStartDate;
	}

	public boolean isExistActiveAsyncRequest(){
		return existActiveAsyncRequest;
	}

	public String getRsaPreviousInsuranceCompanyName(){
		return rsaPreviousInsuranceCompanyName;
	}

	public boolean isHasViolations(){
		return hasViolations;
	}

	public Object getLiabilityStartDate(){
		return liabilityStartDate;
	}

	public String getFactAccruedPremiumDateStartDate(){
		return factAccruedPremiumDateStartDate;
	}

	public SaleGroup getSaleGroup(){
		return saleGroup;
	}

	public String getSegmentRequestStatusName(){
		return segmentRequestStatusName;
	}

	public String getReinsureStartDate(){
		return reinsureStartDate;
	}

	public int getFactAccruedPremium(){
		return factAccruedPremium;
	}

	public List<Object> getAgentList(){
		return agentList;
	}

	public Department getDepartment(){
		return department;
	}

	public String getKbmRsaId(){
		return kbmRsaId;
	}

	public Object getActiveAgentRolesDate(){
		return activeAgentRolesDate;
	}

	public String getInsurerChangeId(){
		return insurerChangeId;
	}

	public String getComments(){
		return comments;
	}

	public ContractOption getContractOption(){
		return contractOption;
	}

	public String getTargetChangeId(){
		return targetChangeId;
	}

	public String getContractEndDate(){
		return contractEndDate;
	}

	public Object getCancelStatementDate(){
		return cancelStatementDate;
	}

	public RequestSource getRequestSource(){
		return requestSource;
	}

	public boolean isSmsSubscription(){
		return smsSubscription;
	}

	public String getInsurerName(){
		return insurerName;
	}

	public List<Object> getPaymentList(){
		return paymentList;
	}

	public String getContractTypeClassStartDate(){
		return contractTypeClassStartDate;
	}

	public BlankDto getBlankDto(){
		return blankDto;
	}

	public int getPremiumRur(){
		return premiumRur;
	}

	public String getContractPremiumHash(){
		return contractPremiumHash;
	}

	public String getEntityPurpose(){
		return entityPurpose;
	}

	public int getLiabilitySum(){
		return liabilitySum;
	}

	public int getCalculatedPremium(){
		return calculatedPremium;
	}

	public boolean isIsProcessPersInfo(){
		return isProcessPersInfo;
	}

	public List<Object> getPersonLinkList(){
		return personLinkList;
	}

	public String getPreviousContractSeries(){
		return previousContractSeries;
	}

	public String getKbmRsaManualId(){
		return kbmRsaManualId;
	}

	public boolean isIsProcessPersInfoEmpty(){
		return isProcessPersInfoEmpty;
	}

	@Override
 	public String toString(){
		return 
			"OsagoSubmit{" + 
			"contractType = '" + contractType + '\'' + 
			",coInsuranceRole = '" + coInsuranceRole + '\'' + 
			",removedChangeId = '" + removedChangeId + '\'' + 
			",program = '" + program + '\'' + 
			",branch = '" + branch + '\'' + 
			",parentContractOption = '" + parentContractOption + '\'' + 
			",sapContractId = '" + sapContractId + '\'' + 
			",validationLogList = '" + validationLogList + '\'' + 
			",number = '" + number + '\'' + 
			",currentContractChange = '" + currentContractChange + '\'' + 
			",autoDealer = '" + autoDealer + '\'' + 
			",principalInsuranceCompany = '" + principalInsuranceCompany + '\'' + 
			",financialUnit = '" + financialUnit + '\'' + 
			",id = '" + id + '\'' + 
			",targetChangeTypeCode = '" + targetChangeTypeCode + '\'' + 
			",sourceTchInspVehicleId = '" + sourceTchInspVehicleId + '\'' + 
			",otherPartner = '" + otherPartner + '\'' + 
			",isReceivedPrimaryDoc = '" + isReceivedPrimaryDoc + '\'' + 
			",premiumChargeType = '" + premiumChargeType + '\'' + 
			",insurerPersonTypeCode = '" + insurerPersonTypeCode + '\'' + 
			",blankChangeReasonDto = '" + blankChangeReasonDto + '\'' + 
			",rsaBonusMalusId = '" + rsaBonusMalusId + '\'' + 
			",creationType = '" + creationType + '\'' + 
			",serviceStationList = '" + serviceStationList + '\'' + 
			",saleChannel = '" + saleChannel + '\'' + 
			",bonusMalusCoeffValue = '" + bonusMalusCoeffValue + '\'' + 
			",coInsuranceCompany = '" + coInsuranceCompany + '\'' + 
			",premiumChanged = '" + premiumChanged + '\'' + 
			",status = '" + status + '\'' + 
			",noBlank = '" + noBlank + '\'' + 
			",insuredVehicle = '" + insuredVehicle + '\'' + 
			",previousDocumentList = '" + previousDocumentList + '\'' + 
			",vehicleName = '" + vehicleName + '\'' + 
			",insuredVehicleId = '" + insuredVehicleId + '\'' + 
			",lastContractDate = '" + lastContractDate + '\'' + 
			",isCoInsurance = '" + isCoInsurance + '\'' + 
			",agentStatementNumber = '" + agentStatementNumber + '\'' + 
			",debitWriteOffReason = '" + debitWriteOffReason + '\'' + 
			",vehicle = '" + vehicle + '\'' + 
			",sapNotMigratedStatementNumberList = '" + sapNotMigratedStatementNumberList + '\'' + 
			",premium = '" + premium + '\'' + 
			",osagoChassisStartDate = '" + osagoChassisStartDate + '\'' + 
			",insurer = '" + insurer + '\'' + 
			",insBridgeParamHash = '" + insBridgeParamHash + '\'' + 
			",liabilityEndDate = '" + liabilityEndDate + '\'' + 
			",currency = '" + currency + '\'' + 
			",cancelReason = '" + cancelReasonWithCode + '\'' +
			",insbridgePremiumCalculateStartDate = '" + insbridgePremiumCalculateStartDate + '\'' + 
			",osagoSchema17StartDate = '" + osagoSchema17StartDate + '\'' + 
			",product = '" + product + '\'' + 
			",isStateProcurement = '" + isStateProcurement + '\'' + 
			",rsaKbmStartDate = '" + rsaKbmStartDate + '\'' + 
			",osagoStoaStartDate = '" + osagoStoaStartDate + '\'' + 
			",parentId = '" + parentId + '\'' + 
			",insurerId = '" + insurerId + '\'' + 
			",agentStatementId = '" + agentStatementId + '\'' + 
			",agentStatementDate = '" + agentStatementDate + '\'' + 
			",series = '" + series + '\'' + 
			",coInsuranceTotalPremium = '" + coInsuranceTotalPremium + '\'' + 
			",bonusMalus = '" + bonusMalus + '\'' + 
			",previousInsuranceCompany = '" + previousInsuranceCompany + '\'' + 
			",previousContractNumber = '" + previousContractNumber + '\'' + 
			",contractDate = '" + contractDate + '\'' + 
			",agentRoleList = '" + agentRoleList + '\'' + 
			",contractChangeList = '" + contractChangeList + '\'' + 
			",claimReturnList = '" + claimReturnList + '\'' + 
			",coInsuranceStartDate = '" + coInsuranceStartDate + '\'' + 
			",vehicleSysEditor = '" + vehicleSysEditor + '\'' + 
			",project = '" + project + '\'' + 
			",office = '" + office + '\'' + 
			",insuranceActNumber = '" + insuranceActNumber + '\'' + 
			",commissionList = '" + commissionList + '\'' + 
			",driverList = '" + driverList + '\'' + 
			",segmentActivateStartDate = '" + segmentActivateStartDate + '\'' + 
			",sysEditor = '" + sysEditor + '\'' + 
			",insurerIsOwner = '" + insurerIsOwner + '\'' + 
			",reissueDate = '" + reissueDate + '\'' + 
			",sysCreator = '" + sysCreator + '\'' + 
			",contractTypeClass = '" + contractTypeClass + '\'' + 
			",statementStatusCode = '" + statementStatusCode + '\'' + 
			",sector = '" + sector + '\'' + 
			",isServiceStation = '" + isServiceStation + '\'' + 
			",ownerKbmRsaTypeId = '" + ownerKbmRsaTypeId + '\'' + 
			",contractStartDate = '" + contractStartDate + '\'' + 
			",insurerSysEditor = '" + insurerSysEditor + '\'' + 
			",leasingCompany = '" + leasingCompany + '\'' + 
			",isActivateAgentFromAnotherBranch = '" + isActivateAgentFromAnotherBranch + '\'' + 
			",agentName = '" + agentName + '\'' + 
			",debitWriteOffDate = '" + debitWriteOffDate + '\'' + 
			",isReinsure = '" + isReinsure + '\'' + 
			",insurerHasCellPhone = '" + insurerHasCellPhone + '\'' + 
			",productVariant = '" + productVariant + '\'' + 
			",isEmptySourceCheckSum = '" + isEmptySourceCheckSum + '\'' + 
			",premiumCalcDate = '" + premiumCalcDate + '\'' + 
			",isCoInsuranceLeaderPayType = '" + isCoInsuranceLeaderPayType + '\'' + 
			",checkSum = '" + checkSum + '\'' + 
			",lastModified = '" + lastModified + '\'' + 
			",bankIntermediary = '" + bankIntermediary + '\'' + 
			",claimReturnSum = '" + claimReturnSum + '\'' + 
			",sapMigrationReasonCode = '" + sapMigrationReasonCode + '\'' + 
			",agentInsuranceCompany = '" + agentInsuranceCompany + '\'' + 
			",agentId = '" + agentId + '\'' + 
			",cancelDate = '" + cancelDate + '\'' + 
			",stateProcurementStartDate = '" + stateProcurementStartDate + '\'' + 
			",existActiveAsyncRequest = '" + existActiveAsyncRequest + '\'' + 
			",rsaPreviousInsuranceCompanyName = '" + rsaPreviousInsuranceCompanyName + '\'' + 
			",hasViolations = '" + hasViolations + '\'' + 
			",liabilityStartDate = '" + liabilityStartDate + '\'' + 
			",factAccruedPremiumDateStartDate = '" + factAccruedPremiumDateStartDate + '\'' + 
			",saleGroup = '" + saleGroup + '\'' + 
			",segmentRequestStatusName = '" + segmentRequestStatusName + '\'' + 
			",reinsureStartDate = '" + reinsureStartDate + '\'' + 
			",factAccruedPremium = '" + factAccruedPremium + '\'' + 
			",agentList = '" + agentList + '\'' + 
			",department = '" + department + '\'' + 
			",kbmRsaId = '" + kbmRsaId + '\'' + 
			",activeAgentRolesDate = '" + activeAgentRolesDate + '\'' + 
			",insurerChangeId = '" + insurerChangeId + '\'' + 
			",comments = '" + comments + '\'' + 
			",contractOption = '" + contractOption + '\'' + 
			",targetChangeId = '" + targetChangeId + '\'' + 
			",contractEndDate = '" + contractEndDate + '\'' + 
			",cancelStatementDate = '" + cancelStatementDate + '\'' + 
			",requestSource = '" + requestSource + '\'' + 
			",smsSubscription = '" + smsSubscription + '\'' + 
			",insurerName = '" + insurerName + '\'' + 
			",paymentList = '" + paymentList + '\'' + 
			",contractTypeClassStartDate = '" + contractTypeClassStartDate + '\'' + 
			",blankDto = '" + blankDto + '\'' + 
			",premiumRur = '" + premiumRur + '\'' + 
			",contractPremiumHash = '" + contractPremiumHash + '\'' + 
			",entityPurpose = '" + entityPurpose + '\'' + 
			",liabilitySum = '" + liabilitySum + '\'' + 
			",calculatedPremium = '" + calculatedPremium + '\'' + 
			",isProcessPersInfo = '" + isProcessPersInfo + '\'' + 
			",personLinkList = '" + personLinkList + '\'' + 
			",previousContractSeries = '" + previousContractSeries + '\'' + 
			",kbmRsaManualId = '" + kbmRsaManualId + '\'' + 
			",isProcessPersInfoEmpty = '" + isProcessPersInfoEmpty + '\'' + 
			"}";
		}
}