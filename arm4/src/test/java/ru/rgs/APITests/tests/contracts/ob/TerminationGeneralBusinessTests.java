package ru.rgs.APITests.tests.contracts.ob;

import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.rgs.APITests.TestBase;

import javax.ws.rs.client.Client;

@Feature("Договор ОБ")
@Story("Расторжение")
public class TerminationGeneralBusinessTests extends TestBase{

    private Client client;

    @BeforeClass
    public void init(){
        client = storage.getClient();
    }

    @Test
    public void terminationGeneralBusinessTest(){
        terminationGeneralBusiness();
    }

    @Step("Расторжение договора ОБ")
    private void terminationGeneralBusiness() {
        client.target(BASE_URL);
    }
}