package ru.rgs.APITests.tests.contracts.express;

import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.rgs.APITests.TestBase;

import javax.ws.rs.client.Client;

@Feature("Договор ЭКСПРЕСС")
@Story("Расторжение")
public class TerminationExpressTests extends TestBase{

    private Client client;

    @BeforeClass
    public void init(){
        client = storage.getClient();
    }

    @Test(description = "На текущую дату")
    public void terminationExpressTest(){
        terminationExpress();
    }

    @Step("Расторжение договора ЭКСПРЕСС")
    private void terminationExpress() {
        client.target(BASE_URL);
    }
}