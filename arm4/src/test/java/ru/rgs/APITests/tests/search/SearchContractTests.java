package ru.rgs.APITests.tests.search;

import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.rgs.APITests.TestBase;
import ru.rgs.APITests.model.SearchContract.preview.ContractPreview;
import ru.rgs.APITests.model.SearchContract.search.ContractSearch;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static org.testng.Assert.assertEquals;

@Feature("Поиск")
@Story("Договор")
public class SearchContractTests extends TestBase{

    private Client client;
    private String requestContractSearch;
    private Response responseContractSearch;

    @BeforeClass
    public void init(){
        client = storage.getClient();
    }

    @Test(description = "По серии и номеру")
    public void searchContractTest(){
        createRequestBody();
        makeRequest();
        getContractPreviewAndSaveInStorage();
        assertEquals(storage.getContractPreview().isSuccess(), true);
    }

    @Step("Получаем список договоров и записываем его в хранилище")
    private ContractPreview getContractPreviewAndSaveInStorage() {
        ContractPreview contractPreview = getContractPreview(responseContractSearch);
        storage.setContractPreview(contractPreview);
        return contractPreview;
    }

    @Step("Делаем запрос")
    private void makeRequest() {
        target = client.target(BASE_URL + "private/data/module-search/ContractSearchWs/find");
        responseContractSearch = getInvocation(target, Entity.entity(requestContractSearch, MediaType.APPLICATION_FORM_URLENCODED_TYPE)).invoke();
    }

    @Step("Создаем тело запроса")
    private void createRequestBody() {
        ContractSearch contractSearch = new ContractSearch("ЕЕЕ", "2000000002");
        String jsonContractSearch = gson.toJson(contractSearch);
        requestContractSearch = "constraints=" + jsonContractSearch + "&page=1&start=0&limit=100";
    }
}