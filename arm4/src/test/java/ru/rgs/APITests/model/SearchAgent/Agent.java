package ru.rgs.APITests.model.SearchAgent;

public class Agent {

    private String id;
    public String getId() { return this.id; }
    public void setId(String id) { this.id = id; }

    private String displayName;
    public String getDisplayName() { return this.displayName; }
    public void setDisplayName(String displayName) { this.displayName = displayName; }

    private String active;
    public String getActive() { return this.active; }
    public void setActive(String active) { this.active = active; }

    private String bid;
    public String getBid() { return this.bid; }
    public void setBid(String bid) { this.bid = bid; }

    private String branchCode;
    public String getBranchCode() { return this.branchCode; }
    public void setBranchCode(String branchCode) { this.branchCode = branchCode; }

    private String branchId;
    public String getBranchId() { return this.branchId; }
    public void setBranchId(String branchId) { this.branchId = branchId; }

    private String branchName;
    public String getBranchName() { return this.branchName; }
    public void setBranchName(String branchName) { this.branchName = branchName; }

    private String agentCode;
    public String getAgentCode() { return this.agentCode; }
    public void setAgentCode(String agentCode) { this.agentCode = agentCode; }

    private String agentLevelId;
    public String getAgentLevelId() { return this.agentLevelId; }
    public void setAgentLevelId(String agentLevelId) { this.agentLevelId = agentLevelId; }

    private String agentLevelCode;
    public String getAgentLevelCode() { return this.agentLevelCode; }
    public void setAgentLevelCode(String agentLevelCode) { this.agentLevelCode = agentLevelCode; }

    private String agentLevelName;
    public String getAgentLevelName() { return this.agentLevelName; }
    public void setAgentLevelName(String agentLevelName) { this.agentLevelName = agentLevelName; }

    private String saleChannelTypeId;
    public String getSaleChannelTypeId() { return this.saleChannelTypeId; }
    public void setSaleChannelTypeId(String saleChannelTypeId) { this.saleChannelTypeId = saleChannelTypeId; }

    private String saleChannelTypeCode;
    public String getSaleChannelTypeCode() { return this.saleChannelTypeCode; }
    public void setSaleChannelTypeCode(String saleChannelTypeCode) { this.saleChannelTypeCode = saleChannelTypeCode; }

    private String saleChannelTypeName;
    public String getSaleChannelTypeName() { return this.saleChannelTypeName; }
    public void setSaleChannelTypeName(String saleChannelTypeName) { this.saleChannelTypeName = saleChannelTypeName; }

    private String personTypeId;
    public String getPersonTypeId() { return this.personTypeId; }
    public void setPersonTypeId(String personTypeId) { this.personTypeId = personTypeId; }

    private String personTypeCode;
    public String getPersonTypeCode() { return this.personTypeCode; }
    public void setPersonTypeCode(String personTypeCode) { this.personTypeCode = personTypeCode; }

    private String personTypeName;
    public String getPersonTypeName() { return this.personTypeName; }
    public void setPersonTypeName(String personTypeName) { this.personTypeName = personTypeName; }

    private String contractFormId;
    public String getContractFormId() { return this.contractFormId; }
    public void setContractFormId(String contractFormId) { this.contractFormId = contractFormId; }

    @Override
    public String toString() {
        return "Agent{" +
                "id='" + id + '\'' +
                ", displayName='" + displayName + '\'' +
                ", active='" + active + '\'' +
                ", bid='" + bid + '\'' +
                ", branchCode='" + branchCode + '\'' +
                ", branchId='" + branchId + '\'' +
                ", branchName='" + branchName + '\'' +
                ", agentCode='" + agentCode + '\'' +
                ", agentLevelId='" + agentLevelId + '\'' +
                ", agentLevelCode='" + agentLevelCode + '\'' +
                ", agentLevelName='" + agentLevelName + '\'' +
                ", saleChannelTypeId='" + saleChannelTypeId + '\'' +
                ", saleChannelTypeCode='" + saleChannelTypeCode + '\'' +
                ", saleChannelTypeName='" + saleChannelTypeName + '\'' +
                ", personTypeId='" + personTypeId + '\'' +
                ", personTypeCode='" + personTypeCode + '\'' +
                ", personTypeName='" + personTypeName + '\'' +
                ", contractFormId='" + contractFormId + '\'' +
                '}';
    }
}