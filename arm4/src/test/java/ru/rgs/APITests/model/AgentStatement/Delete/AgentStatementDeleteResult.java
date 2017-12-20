package ru.rgs.APITests.model.AgentStatement.Delete;

import com.google.gson.annotations.SerializedName;


import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class AgentStatementDeleteResult {


  @SerializedName("deletionResult")
  private DeletionResult deletionResult;

  @SerializedName("success")
  private boolean success;


  public DeletionResult getDeletionAgentStatementResult() {
    return deletionResult;
  }

  public boolean isSuccess() {
    return success;
  }

  @Override
  public String toString() {
    return "AgentStatementDeleteResult{" +
            "deletionResult=" + deletionResult +
            ", success=" + success +
            '}';
  }
}
