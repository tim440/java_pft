package ru.rgs.APITests.model.SearchAgentStatement.AgentStatement;


import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class AgentStatementFound {

  @SerializedName("id")
  private String id;

  @SerializedName("bid")
  private String bid;

  @SerializedName("topBranchName")
  private String topBranchName;

  @SerializedName("agentId")
  private String agentId;

  @SerializedName("agentDisplayName")
  private String agentDisplayName;

  @SerializedName("statementNumber")
  private String statementNumber;

  @SerializedName("statementDate")
  private String statementDate;

  @SerializedName("statementStatus")
  private String statementStatus;

  @SerializedName("statusCode")
  private String statusCode;

  @SerializedName("statementPaymentStatus")
  private String statementPaymentStatus;

  @SerializedName("commissionViewStatus")
  private String commissionViewStatus;

  @SerializedName("commissionViewStatusCode")
  private String commissionViewStatusCode;

  @SerializedName("branchName")
  private String branchName;

  @SerializedName("branchCode")
  private String branchCode;

  @SerializedName("sysEditor")
  private String sysEditor;

  public String getId() {
    return id;
  }

  public String getBid() {
    return bid;
  }

  public String getTopBranchName() {
    return topBranchName;
  }

  public String getAgentId() {
    return agentId;
  }

  public String getAgentDisplayName() {
    return agentDisplayName;
  }

  public String getStatementNumber() {
    return statementNumber;
  }

  public String getStatementDate() {
    return statementDate;
  }

  public String getStatementStatus() {
    return statementStatus;
  }

  public String getStatusCode() {
    return statusCode;
  }

  public String getStatementPaymentStatus() {
    return statementPaymentStatus;
  }

  public String getCommissionViewStatus() {
    return commissionViewStatus;
  }

  public String getCommissionViewStatusCode() {
    return commissionViewStatusCode;
  }

  public String getBranchName() {
    return branchName;
  }

  public String getBranchCode() {
    return branchCode;
  }

  public String getSysEditor() {
    return sysEditor;
  }

  @Override
  public String toString() {
    return "AgentStatementFound{" +
            "id='" + id + '\'' +
            ", bid='" + bid + '\'' +
            ", topBranchName='" + topBranchName + '\'' +
            ", agentId='" + agentId + '\'' +
            ", agentDisplayName='" + agentDisplayName + '\'' +
            ", statementNumber='" + statementNumber + '\'' +
            ", statementDate='" + statementDate + '\'' +
            ", statementStatus='" + statementStatus + '\'' +
            ", statusCode='" + statusCode + '\'' +
            ", statementPaymentStatus='" + statementPaymentStatus + '\'' +
            ", commissionViewStatus='" + commissionViewStatus + '\'' +
            ", commissionViewStatusCode='" + commissionViewStatusCode + '\'' +
            ", branchName='" + branchName + '\'' +
            ", branchCode='" + branchCode + '\'' +
            ", sysEditor='" + sysEditor + '\'' +
            '}';
  }
}
