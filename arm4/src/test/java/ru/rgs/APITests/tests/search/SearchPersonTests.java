package ru.rgs.APITests.tests.search;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.rgs.APITests.TestBase;
import ru.rgs.APITests.model.SearchInsurer.Insurer.InsurerPreview;
import ru.rgs.APITests.model.SearchInsurer.Request.RequestInsurer;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static org.testng.Assert.assertEquals;

@Feature("Поиск")
@Story("Персона")
public class SearchPersonTests extends TestBase {

    private Client client;

    @BeforeClass
    public void init(){
        client = storage.getClient();
    }

    @Test(description = "По типу и ФИО")
    public void searchPersonTest(){
        RequestInsurer requestInsurer = new RequestInsurer("1", "Бах Бах Бах");
        String jsonRequestInsurer = gson.toJson(requestInsurer);
        String requestInsurerSearch = "constraints=" + jsonRequestInsurer + "&page=1&start=0&limit=100";
        target = client.target(BASE_URL + "private/data/module-search/PersonSearchWs/find");
        Response insurerSearchResponse = getInvocation(target, Entity.entity(requestInsurerSearch, MediaType.APPLICATION_FORM_URLENCODED_TYPE)).invoke();
        InsurerPreview insurerSearch = getInsurerSearch(insurerSearchResponse);
        storage.setInsurerSearch(insurerSearch);
        assertEquals(insurerSearch.isSuccess(), true);
    }
}