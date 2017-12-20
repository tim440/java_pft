package ru.rgs.APITests.tests.search;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.rgs.APITests.TestBase;
import ru.rgs.APITests.model.SearchAgent.SearchAgent;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static org.testng.Assert.assertEquals;

@Feature("Поиск")
@Story("Агент")
public class SearchAgentTests extends TestBase {

    private Client client;

    @BeforeClass
    public void init(){
        client = storage.getClient();
    }

    @Test
    public void searchAgentTest() {
        target = client.target(BASE_URL + "private/data/module-search/AgentSimpleSearchWs/find");
        Response responseSearchAgent = getInvocation(target, Entity.entity(jsonRequest, MediaType.APPLICATION_FORM_URLENCODED_TYPE)).invoke();
        checkStatusResponse(responseSearchAgent);
        SearchAgent searchAgent = getSearchAgent(responseSearchAgent);
        storage.setSearchAgent(searchAgent);
        assertEquals(searchAgent.isSuccess(), true);
    }
}