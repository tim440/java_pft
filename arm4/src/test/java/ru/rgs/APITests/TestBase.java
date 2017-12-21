package ru.rgs.APITests;

import com.google.common.collect.ImmutableMap;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.qameta.allure.Step;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.ClientProperties;
import org.testng.annotations.BeforeClass;
import ru.rgs.APITests.model.AgentStatement.AgentStatementSaveResult;
import ru.rgs.APITests.model.AgentStatement.Create.AgentStatementCreate;
import ru.rgs.APITests.model.AgentStatement.Delete.AgentStatementDeleteResult;
import ru.rgs.APITests.model.SearchAgentStatement.AgentStatement.AgentStatementPreview;
import ru.rgs.APITests.model.SearchContract.preview.ContractPreview;
import ru.rgs.APITests.model.SearchInsurer.Insurer.InsurerPreview;
import ru.rgs.APITests.model.SearchInsurer.InsurerFull.FullInsurerResponse;
import ru.rgs.APITests.model.SearchVehicle.full.VehicleFound;
import ru.rgs.APITests.model.SearchVehicle.preview.VehiclePreview;
import ru.rgs.APITests.model.contracts.delete.ContractDeleteResult;
import ru.rgs.APITests.model.contracts.osago.create.OsagoCreate;
import ru.rgs.APITests.model.contracts.saveResult.SaveResult;
import ru.rgs.APITests.model.SearchAgent.SearchAgent;

import javax.ws.rs.client.*;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TestBase {

    /** Url по которому доступна аутентификация. */
    protected static final String BASE_URL = "http://arm4-test3-web.tengry.com/armweb/";
    private static final String AUTH_URL = BASE_URL + "auth/login";
    private static final String LOGIN = "Autotest";
    private static final String PASSWORD = "2wsx2WSX";
    protected static Storage storage;
    /** Запрос полученный из хрома, F12 -> Вкладка Network -> Выбрать нужный запрос -> Вкладка Headers, секция FormData -> нажать на view source. */
    //protected static final String jsonRequest = "page=1&start=0&limit=100&filter=%5B%7B%22property%22%3A%22personTypeCode%22%2C%22value%22%3A%221%22%7D%2C%7B%22property%22%3A%22id%22%2C%22value%22%3A%22720183fb442407b3511e69c2c%22%7D%5D";
    protected static final String jsonRequest = "page=1&start=0&limit=100&filter=%5B%7B%22property%22%3A%22agentCode%22%2C%22value%22%3A%2272850010%22%7D%2C%7B%22property%22%3A%22displayName%22%2C%22value%22%3A%22%5Cu0410%5Cu0432%5Cu0442%5Cu043e%5Cu0442%5Cu0435%5Cu0441%5Cu0442%20%5Cu0424%5Cu0438%5Cu0437%20%5Cu041b%5Cu0438%5Cu0446%22%7D%5D";
    /** Наименование куки сессии. */
    private static String JSESSIONID_COOKIE_NAME = "JSESSIONID";
    public Gson gson = new GsonBuilder().serializeNulls().create();
    protected WebTarget target;

    /** Создаем http-клиента. Объект тяжелый для создания, потокобезопасный. Значит его создаем 1 раз и всегда переиспользуем. */
    private static Client initClient() {
        ClientConfig config = new ClientConfig();
        config.property(ClientProperties.FOLLOW_REDIRECTS, false);
        return ClientBuilder.newClient(config);
    }

    @BeforeClass
    public void setUp(){
        storage = new Storage();
        storage.setClient(initClient());
        storage.setSessionCookie(getSessionCookie());
    }

    public Invocation getInvocation(WebTarget target, Entity<String> entity) {
        return target.request(MediaType.APPLICATION_JSON_TYPE)
                .cookie(storage.getSessionCookie())
                .buildPost(entity);
    }

    /** Получит куку сессии. */
    public Cookie getSessionCookie() {
        WebTarget w = storage.getClient().target(TestBase.AUTH_URL);

        Form form = new Form();
        form.param("j_username", TestBase.LOGIN);
        form.param("j_password", TestBase.PASSWORD);

        Response response = w.request(MediaType.TEXT_HTML_TYPE)
                             .post(Entity.form(form));

        //302 Moved temporarily после успешной аутентификаци нас перенаправляют на страницу для принятия пользовательского соглашения
        if (Response.Status.FOUND.getStatusCode() != response.getStatus()) {
            // Редирект на страницу аутентификации?
            if (response.getHeaderString("location").contains("login.jsp")) {
                throw new IllegalStateException("Auth error.");
            }
        }


        // Получаем куку сесссии.
        return response.getCookies().get(TestBase.JSESSIONID_COOKIE_NAME);
    }

    @Step("{0}")
    public void log(String s){
        System.out.println(s);
    }

    protected String getResponseString(Response response) {
        String responseString = response.readEntity(String.class);
        log("ОТВЕТ: " + responseString);
        return responseString;
    }

    protected SaveResult getSaveResult(Response response) {
        String responseString = getResponseString(response);
        SaveResult saveResult = gson.fromJson(responseString, SaveResult.class);
        log("SAVE RESULT RESPONSE INFO:\n ==================\n" + saveResult + "\n ==================\n");
        return saveResult;
    }

    protected VehicleFound getVehicleFull(Response response) {
        String responseString = getResponseString(response);
        VehicleFound vehicleFound = gson.fromJson(responseString, VehicleFound.class);
        log("VEHICLE FULL RESPONSE INFO:\n ==================\n" + vehicleFound + "\n ==================\n");
        return vehicleFound;
    }

    protected VehiclePreview getVehiclePreview(Response response) {
        String responseString = getResponseString(response);
        VehiclePreview vehiclePreview = gson.fromJson(responseString, VehiclePreview.class);
        log("VEHICLE PREVIEW RESPONSE INFO:\n ==================\n" + vehiclePreview + "\n ==================\n");
        return vehiclePreview;
    }

    protected ContractPreview getContractPreview(Response response) {
        String responseString = getResponseString(response);
        ContractPreview contractPreview = gson.fromJson(responseString, ContractPreview.class);
        log("CONTRACT PREVIEW RESPONSE INFO:\n ==================\n" + contractPreview + "\n ==================\n");
        return contractPreview;
    }

    protected ContractDeleteResult getDeleteContractResult(Response response) {
        String responseString = getResponseString(response);
        ContractDeleteResult deleteContractResult = gson.fromJson(responseString, ContractDeleteResult.class);
        log("DELETE CONTRACT RESULT RESPONSE INFO:\n ==================\n" + deleteContractResult + "\n ==================\n");
        return deleteContractResult;
    }

    protected FullInsurerResponse getFullInsurerResponse(Response response) {
        String responseString = getResponseString(response);
        FullInsurerResponse fullInsurerResponse = gson.fromJson(responseString, FullInsurerResponse.class);
        log("FULL INSURER RESPONSE INFO:\n ==================\n" + fullInsurerResponse + "\n ==================\n");
        return fullInsurerResponse;
    }

    protected InsurerPreview getInsurerSearch(Response response) {
        String responseString = getResponseString(response);
        InsurerPreview insurerSearch = gson.fromJson(responseString, InsurerPreview.class);
        log("INSURER SEARCH INFO:\n ==================\n" + insurerSearch + "\n ==================\n");
        return insurerSearch;
    }



    protected OsagoCreate getOsagoCreate(Response createOsago) {
        String responseString = getResponseString(createOsago);
        OsagoCreate osagoCreate = gson.fromJson(responseString, OsagoCreate.class);
        log("AGENT STATEMENT INFO:\n ==================\n" + osagoCreate + "\n ==================\n");
        return osagoCreate;
    }

    @Step("Выполняем сохранение отчета агента и получаем ответ")
    protected AgentStatementSaveResult getAgentStatementSaveResult(Response response) {
        String responseString = getResponseString(response);
        AgentStatementSaveResult agentStatementInfo = gson.fromJson(responseString, AgentStatementSaveResult.class);
        log("AGENT STATEMENT INFO:\n ==================\n" + agentStatementInfo + "\n ==================\n");
        return agentStatementInfo;
    }



    @Step("Выполняем запрос поиска агентов и получаем ответ")
    protected SearchAgent getSearchAgent(Response searchAgent) {
        String responseSearchAgent = searchAgent.readEntity(String.class);
        SearchAgent searchResponse = gson.fromJson(responseSearchAgent, SearchAgent.class);
        log("SEARCH RESPONSE:\n ==================\n" + searchResponse + "\n ==================\n");
        assertTrue(searchResponse.getAgents().size() == 1);
        log("ПРОВЕРКА: в списке один агент");
        return searchResponse;
    }
    @Step("Выполняем запрос поиска ОА и получаем ответ")
    protected AgentStatementPreview getAgentStatementSearch(Response response) {
        String responseString = getResponseString(response);
        AgentStatementPreview agentStatementSearch = gson.fromJson(responseString, AgentStatementPreview.class);
        log("AGENT STATEMENT SEARCH INFO:\n ==================\n" + agentStatementSearch + "\n ==================\n");
        return agentStatementSearch;
    }
    @Step("Выполняем запрос поиска ОА для удаления и получаем ответ")
    protected AgentStatementPreview getAgentStatementSearchForDel(Response response) {
        String responseString = getResponseString(response);
        AgentStatementPreview agentStatementSearch = gson.fromJson(responseString, AgentStatementPreview.class);
        log("AGENT SEARCH INFO:\n ==================\n" + agentStatementSearch + "\n ==================\n");
        assertTrue(agentStatementSearch.getDataList().size() == 1);
        log("ПРОВЕРКА: в списке один ОА");
        return agentStatementSearch;

    }
    @Step("Результат удаления ОА")
    protected AgentStatementDeleteResult getDeletionAgentStatementResult(Response response) {
        String responseString = getResponseString(response);
        AgentStatementDeleteResult deleteAgentStatementResult = gson.fromJson(responseString, AgentStatementDeleteResult.class);
        log("DELETE CONTRACT RESULT RESPONSE INFO:\n ==================\n" + deleteAgentStatementResult + "\n ==================\n");
        return deleteAgentStatementResult;
    }
    @Step("Выполняем создание отчета агента и получаем ответ")
    protected AgentStatementCreate getAgentStatementCreate(Response response) {
        String responseString = getResponseString(response);
        AgentStatementCreate agentStatementCreate = gson.fromJson(responseString, AgentStatementCreate.class);
        log("AGENT STATEMENT:\n ==================\n" + agentStatementCreate + "\n ==================\n");
        return agentStatementCreate;
    }

    @Step("ПРОВЕРКА: Статус ответа 200")
    protected void checkStatusResponse(Response response) {
        int status = response.getStatus();
        System.out.println(response.toString());
        log("STATUS = " + status);
        assertEquals(status, 200);
        log("ПРОВЕРКА: статус ответа = 200");
    }

    @Step("Удаление договора")
    protected ContractDeleteResult removeContract(Client client, String id) {
        String requestDeleteContract = createRequestBodyForDeleteContract(id);
        Response responseContractDelete = makeRequestForDeleteContract(client, requestDeleteContract);
        return getDeletionResult(responseContractDelete);
    }

    @Step("Создаем тело запроса")
    private String createRequestBodyForDeleteContract(String id) {
        String jsonContractDelete = gson.toJson(ImmutableMap.of("id", id));
        return "records=" + jsonContractDelete;
    }

    @Step("Делаем запрос")
    private Response makeRequestForDeleteContract(Client client, String requestDeleteContract) {
        target = client.target(BASE_URL + "private/data/module-primarybusiness/PrimaryBusinessWs/delete");
        return getInvocation(target, Entity.entity(requestDeleteContract, MediaType.APPLICATION_FORM_URLENCODED_TYPE)).invoke();
    }

    @Step("Получение ответа")
    private ContractDeleteResult getDeletionResult(Response responseContractDelete) {
        return getDeleteContractResult(responseContractDelete);
    }

  @Step("Текущая дата")
  protected String CurrentData() {
      Date currentDate = new Date();
      currentDate.setHours(0);
      currentDate.setMinutes(0);
      currentDate.setSeconds(0);
      DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
      return df.format(currentDate);
  }


}