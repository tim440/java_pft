package ru.rgs.APITests.model;

public class ContractTypeList {

    private String id;
    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }

    private String name;
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private String sortOrder;
    public String getSortOrder() {
        return this.sortOrder;
    }
    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    private String startDate;
    public String getStartDate() {
        return this.startDate;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    private String endDate;
    public String getEndDate() {
        return this.endDate;
    }
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    private String code;
    public String getCode() {
        return this.code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    private String codeAndName;
    public String getCodeAndName() {
        return this.codeAndName;
    }
    public void setCodeAndName(String codeAndName) {
        this.codeAndName = codeAndName;
    }

    @Override
    public String toString() {
        return "ContractTypeList{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sortOrder='" + sortOrder + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", code='" + code + '\'' +
                ", codeAndName='" + codeAndName + '\'' +
                '}';
    }
}
