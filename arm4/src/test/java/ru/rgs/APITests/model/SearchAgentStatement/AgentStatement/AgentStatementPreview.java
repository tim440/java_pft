package ru.rgs.APITests.model.SearchAgentStatement.AgentStatement;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("com.robohorse.robopojogenerator")
public class AgentStatementPreview {
  @SerializedName("offset")
  private String offset;

  @SerializedName("totalLength")
  private String totalLength;

  @SerializedName("dataList")

  private  List<AgentStatementFound> dataList;

  @SerializedName("success")
  private boolean success;


  public String getOffset() {
    return offset;
  }

  public boolean isSuccess() {
    return success;
  }

   public List<AgentStatementFound> getDataList() { return dataList;}




  public String getTotalLength() {
    return totalLength;
  }

  @Override
  public String toString() {
    return "AgentStatementPreview{" +
            "offset='" + offset + '\'' +
            ", totalLength='" + totalLength + '\'' +
            ", dataList=" + dataList +
            ", success=" + success +
            '}';
  }
}
