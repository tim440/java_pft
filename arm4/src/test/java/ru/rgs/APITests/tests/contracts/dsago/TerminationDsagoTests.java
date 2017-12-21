package ru.rgs.APITests.tests.contracts.dsago;

import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.rgs.APITests.TestBase;

import javax.ws.rs.client.Client;

@Feature("Договор ДСАГО")
@Story("Расторжение")
public class TerminationDsagoTests extends TestBase{

    private Client client;

    @BeforeClass
    public void init(){
        client = storage.getClient();
    }

    @Test(description = "На текущую дату")
    public void terminationDsagoTest(){
        terminationDsago();
    }

    @Step("Расторжение договора ДСАГО")
    private void terminationDsago() {
        client.target(BASE_URL);
    }
}