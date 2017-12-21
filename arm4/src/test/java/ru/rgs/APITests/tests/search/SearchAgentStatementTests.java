package ru.rgs.APITests.tests.search;


import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.rgs.APITests.CreateObjects;
import ru.rgs.APITests.TestBase;
import ru.rgs.APITests.model.SearchAgentStatement.AgentStatement.AgentStatementPreview;
import ru.rgs.APITests.model.SearchAgentStatement.Request.RequestAgentStatementSerch;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static org.testng.Assert.assertEquals;

@Feature("Поиск")
@Story("ОА")
public class SearchAgentStatementTests extends TestBase {
  private Client client;

  @BeforeClass
  public void init(){
    client = storage.getClient();
  }
  @Test(description = "По номеру рублевого ОА и подразделению")
  public void searchAgentStatementTest(){
    String date = CurrentData();
    RequestAgentStatementSerch requestAgentStatementSerch = new RequestAgentStatementSerch("72018", "72850010-72850010" + CreateObjects.getAgentStatementDataRu(date));
    String jsonRequestAgentStatement = gson.toJson(requestAgentStatementSerch);
    String requestAgentStatementSearch = "constraints=" + jsonRequestAgentStatement + "&page=1&start=0&limit=100";
    target = client.target(BASE_URL + "private/data/module-search/AgentStatementSearchWs/find");
    Response agentStatementSearchResponse = getInvocation(target, Entity.entity(requestAgentStatementSearch, MediaType.APPLICATION_FORM_URLENCODED_TYPE)).invoke();
    checkStatusResponse(agentStatementSearchResponse);
    AgentStatementPreview agentStatementSearch = getAgentStatementSearch(agentStatementSearchResponse);
    storage.setAgentStatementSearch(agentStatementSearch);
    assertEquals(agentStatementSearch.isSuccess(), true);
  }

}
