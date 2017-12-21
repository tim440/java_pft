package ru.rgs.APITests.tests.contracts.boxed;

import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.rgs.APITests.TestBase;
import ru.rgs.APITests.model.SearchContract.preview.ContractPreview;
import ru.rgs.APITests.model.contracts.delete.ContractDeleteResult;
import ru.rgs.APITests.model.contracts.termination.ContractTermination;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Feature("Договор КОРОБОЧНЫЙ")
@Story("Расторжение")
public class TerminationBoxedTests extends TestBase{

    private Client client;

    @BeforeClass
    public void init(){
        client = storage.getClient();
    }

    @Test(enabled = false, description = "На текущую дату")
    public void terminationBoxedTest(){
        createRequestBodyForTerminationContract();
    }

    @Step("Удаление договора")
    protected ContractDeleteResult removeContract(Client client, String id) {
        String requestDeleteContract = createRequestBodyForTerminationContract();
        Response responseContractDelete = makeRequestForDeleteContract(client, requestDeleteContract);
        return getDeletionResult(responseContractDelete);
    }

    @Step("Создаем тело запроса")
    private String createRequestBodyForTerminationContract() {
        ContractPreview contractPreview = new ContractPreview();
        ContractTermination contractTermination = new ContractTermination(contractPreview);
        String jsonContractDelete = gson.toJson(contractTermination);
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

    @Step("Расторжение договора КОРОБОЧНЫЙ")
    private void terminationBoxed() {
        client.target(BASE_URL);
    }
}