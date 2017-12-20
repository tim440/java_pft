package ru.rgs.APITests.tests.agentStatement;

import com.google.common.collect.ImmutableMap;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.rgs.APITests.TestBase;
import ru.rgs.APITests.model.AgentStatement.Delete.AgentStatementDeleteResult;
import ru.rgs.APITests.model.SearchAgentStatement.AgentStatement.AgentStatementPreview;
import ru.rgs.APITests.model.SearchAgentStatement.Request.RequestAgentStatementSerch;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static org.testng.Assert.assertEquals;


@Feature("Отчет агента")
@Story("Удаление")
public class RemoveAgentStatementNoDelTests extends TestBase {

  private Client client;


  @BeforeClass
  public void init() {
    client = storage.getClient();
  }


  @Test(description = "Удаление не удаляемого ОА")
  public void removeAgentStatementNonDelTest() {
    storage.setSessionCookie(getSessionCookie());

    searchAgentStatement("72850010-72850010-021117");
    AgentStatementPreview agentStatementSearch = storage.getAgentStatementSearch();
    String statementId = agentStatementSearch.getDataList().get(0).getId();
    removeAgentStatement(statementId);
  }

  @Step("Поиск ОА для удаления")
  protected void searchAgentStatement(String statementNumber) {
    String requestAgentStatementSearch = requestStatement(statementNumber);
    responseStatement(requestAgentStatementSearch);
  }

  @Step("Удаление отчета агента")
  private void removeAgentStatement(String statementId) {
    String requestAgentStatementDel = requestStatementRemove(statementId);
    responseStatementRemove(requestAgentStatementDel);
  }


  @Step("обработка ответа на удаление ОА")
  private void responseStatementRemove(String requestAgentStatementDel) {
    Response agentStatementRemoveResponse = getInvocation
            (target, Entity.entity(requestAgentStatementDel, MediaType.APPLICATION_FORM_URLENCODED_TYPE)).invoke();
    checkStatusResponse(agentStatementRemoveResponse);
    AgentStatementDeleteResult deleteAgentStatement = getDeletionAgentStatementResult(agentStatementRemoveResponse);
    assertEquals(deleteAgentStatement.isSuccess(), false);
  }

  @Step("обработка запроса на удаление ОА")
  private String requestStatementRemove(String statementId) {
    String jsonRequestAgentStatementRemove = gson.toJson(ImmutableMap.of("id", statementId));
    String requestAgentStatementDel = "records=" + jsonRequestAgentStatementRemove;
    target = client.target(BASE_URL + "private/data/module-agent/AgentStatementWs/delete");
    return requestAgentStatementDel;
  }


  @Step("Обработка результата поиска ОА")
  protected void responseStatement(String requestAgentStatementSearch) {
    Response agentStatementSearchResponse = getInvocation(target, Entity.entity(requestAgentStatementSearch, MediaType.APPLICATION_FORM_URLENCODED_TYPE)).invoke();
    AgentStatementPreview agentStatementSearch = getAgentStatementSearchForDel(agentStatementSearchResponse);
    storage.setAgentStatementSearch(agentStatementSearch);
    assertEquals(agentStatementSearch.isSuccess(), true);
  }

  @Step("Обработка запроса поиска ОА")
  protected String requestStatement(String statementNumber) {
    RequestAgentStatementSerch requestAgentStatementSerch = new RequestAgentStatementSerch("72018", statementNumber);
    String jsonRequestAgentStatement = gson.toJson(requestAgentStatementSerch);
    String requestAgentStatementSearch = "constraints=" + jsonRequestAgentStatement + "&page=1&start=0&limit=100";
    target = client.target(BASE_URL + "private/data/module-search/AgentStatementSearchWs/find");
    return requestAgentStatementSearch;
  }
}