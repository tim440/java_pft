package ru.rgs.APITests.tests.agentStatement;

import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.rgs.APITests.CreateObjects;
import ru.rgs.APITests.TestBase;
import ru.rgs.APITests.model.AgentStatement.AgentStatementSaveResult;
import ru.rgs.APITests.model.AgentStatement.Create.AgentStatementCreate;
import ru.rgs.APITests.model.AgentStatement.Submit.AgentStatementSubmit;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static org.testng.Assert.assertEquals;

@Feature("Отчет агента")
@Story("Создание отчета агента")
public class CreateAgentStatementTests extends TestBase {

    private static final String agentId = "72018535eb0c0a38211e7a7a2";
    private AgentStatementCreate agentStatementCreate;
    private String requestAgentSubmit;
    private Client client;

    @BeforeClass
    public void init(){
        client = storage.getClient();

    }

    @Test
    public void createAgentStatementRuTest(){
        createAgentStatement();
        String currencyName = agentStatementCreate.getCreateOperationResult().getCreateObject().getAgentStatement().getCurrencyType().getName();
        String currencyId = agentStatementCreate.getCreateOperationResult().getCreateObject().getAgentStatement().getCurrencyType().getId();
        String paymentName = agentStatementCreate.getCreateOperationResult().getCreateObject().getAgentStatement().getPaymentType().getName();
        String paymentId = agentStatementCreate.getCreateOperationResult().getCreateObject().getAgentStatement().getPaymentType().getId();
        String date = CurrentData();
        createRequestForAgentStatementSubmitRu(date, currencyName, currencyId, paymentName, paymentId);
        submitAgentStatement();
    }

    @Test
    public void createAgentStatementUSDTest(){
        storage.setSessionCookie(getSessionCookie());
        createAgentStatement();
        // TODO добавить правильные значения
        // Валюта
        String currencyName = "Доллар США";
        String currencyId = "USD";
        // Тип оплаты
        String paymentName = "Безналичный расчет";// Наличными в кассу Страховщика
        String paymentId = "3";//2
        // не забыть поменять дату ОА
        String date = CurrentData();
        createRequestForAgentStatementSubmitUSD(date, currencyName, currencyId, paymentName, paymentId);
        submitAgentStatement();
    }

    @Step("Сохранение отчета агента")
    public void submitAgentStatement() {
        target = client.target(BASE_URL + "private/data/module-agent/AgentStatementWs/store");
        Response saveAgentStatement = getInvocation(target, Entity.entity(requestAgentSubmit, MediaType.APPLICATION_FORM_URLENCODED_TYPE)).invoke();
        AgentStatementSaveResult agentStatementSaveResult = getAgentStatementSaveResult(saveAgentStatement);
        assertEquals(agentStatementSaveResult.isSuccess(), true);
    }

    @Step("Создание запроса для сохранения отчета агента из ответа создания")
    public void createRequestForAgentStatementSubmitRu(String date, String currencyName, String currencyId, String paymentName, String paymentId) {
        AgentStatementSubmit agentReportSubmit = CreateObjects.createAgentReportSubmit(agentStatementCreate, date, currencyName, currencyId, paymentName, paymentId);
        String jsonRequestSubmitAgentReport = gson.toJson(agentReportSubmit);
        requestAgentSubmit = "update=true&records=" + jsonRequestSubmitAgentReport + "&acceptedWarnings=%5B%5D";
        log("REQUEST AGENT STATEMENT:\n ==================\n" + requestAgentSubmit + "\n ==================\n");
    }

    @Step("Создание запроса для сохранения отчета агента USD из ответа создания")
    public void createRequestForAgentStatementSubmitUSD(String date, String currencyName, String currencyId, String paymentName, String paymentId) {
        AgentStatementSubmit agentReportSubmit = CreateObjects.createAgentReportSubmitUSD(agentStatementCreate, date, currencyName, currencyId, paymentName, paymentId);
        String jsonRequestSubmitAgentReport = gson.toJson(agentReportSubmit);
        requestAgentSubmit = "update=true&records=" + jsonRequestSubmitAgentReport + "&acceptedWarnings=%5B%5D";
        log("REQUEST AGENT STATEMENT:\n ==================\n" + requestAgentSubmit + "\n ==================\n");
    }

    @Step("Создание отчета агента и получение ответа с заполненными по умолчанию полями")
    public void createAgentStatement() {
        target = client.target(BASE_URL + "private/data/module-agent/AgentStatementWs/create");
        Response createAgentStatement = getInvocation(target, Entity.entity("agentId=" + agentId, MediaType.APPLICATION_FORM_URLENCODED_TYPE)).invoke();
        agentStatementCreate = getAgentStatementCreate(createAgentStatement);
    }
}