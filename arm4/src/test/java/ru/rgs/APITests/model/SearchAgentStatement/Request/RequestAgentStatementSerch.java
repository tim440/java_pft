package ru.rgs.APITests.model.SearchAgentStatement.Request;

import com.google.gson.annotations.SerializedName;
import ru.rgs.APITests.model.SearchInsurer.Request.ConstraintsItem;
import ru.rgs.APITests.model.SearchInsurer.Request.EqualsIgnoreCase;

import javax.annotation.Generated;
import java.util.List;

import static java.util.Arrays.asList;

@Generated("com.robohorse.robopojogenerator")
public class RequestAgentStatementSerch {
  @SerializedName("constraints")
  private List<ConstraintsItem> constraints;

  public List<ConstraintsItem> getConstraints() {
    return constraints;
  }

  public RequestAgentStatementSerch(String bid, String statementNumber) {
    this.constraints = asList(new ConstraintsItem(new EqualsIgnoreCase("bid", bid)), new ConstraintsItem(new EqualsIgnoreCase("statementNumber", statementNumber)));
  }

  @Override
  public String toString() {
    return "RequestAgentStatementSerch{" +
            "constraints=" + constraints +
            '}';
  }
}
