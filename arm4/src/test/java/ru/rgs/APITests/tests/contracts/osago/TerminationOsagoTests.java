package ru.rgs.APITests.tests.contracts.osago;

import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.rgs.APITests.TestBase;

import javax.ws.rs.client.Client;

@Feature("Договор ОСАГО")
@Story("Расторжение")
public class TerminationOsagoTests extends TestBase{

    private Client client;

    @BeforeClass
    public void init(){
        client = storage.getClient();
    }

    @Test
    public void terminationOsagoTest(){
        terminationOsago();
    }

    @Step("Расторжение договора ОСАГО")
    private void terminationOsago() {
        client.target(BASE_URL);
    }
}