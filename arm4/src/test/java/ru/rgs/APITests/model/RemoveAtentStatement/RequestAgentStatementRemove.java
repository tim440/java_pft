package ru.rgs.APITests.model.RemoveAtentStatement;

import com.google.gson.annotations.SerializedName;
import ru.rgs.APITests.model.SearchInsurer.Request.ConstraintsItem;
import ru.rgs.APITests.model.SearchInsurer.Request.EqualsIgnoreCase;


import java.util.List;

import static java.util.Arrays.asList;


public class RequestAgentStatementRemove {
  @SerializedName("records")

  private List<String> records;

  public List<String> getRecords() {
    return records;
  }



  public RequestAgentStatementRemove(String statementId) {

    this.records = asList(statementId);

  }
  @Override
  public String toString() {
    return "RequestAgentStatementRemove{" +
            "records=" + records +
            '}';
  }
}

