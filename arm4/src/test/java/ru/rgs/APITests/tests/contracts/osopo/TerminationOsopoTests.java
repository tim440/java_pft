package ru.rgs.APITests.tests.contracts.osopo;

import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.rgs.APITests.TestBase;

import javax.ws.rs.client.Client;

@Feature("Договор ОСОПО")
@Story("Расторжение")
public class TerminationOsopoTests extends TestBase{

    private Client client;

    @BeforeClass
    public void init(){
        client = storage.getClient();
    }

    @Test(description = "На текущую дату")
    public void terminationOsopoTest(){
        terminationOsopo();
    }

    @Step("Расторжение договора ОСОПО")
    private void terminationOsopo() {
        client.target(BASE_URL);
    }
}