package ru.rgs.APITests.tests.contracts.osgopp;

import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.rgs.APITests.TestBase;

import javax.ws.rs.client.Client;

@Feature("Договор ОСГОПП")
@Story("Расторжение")
public class TerminationOsgoppTests extends TestBase{

    private Client client;

    @BeforeClass
    public void init(){
        client = storage.getClient();
    }

    @Test(description = "На текущую дату")
    public void terminationOsgoppTest(){
        terminationOsgopp();
    }

    @Step("Расторжение договора ОСГОПП")
    private void terminationOsgopp() {
        client.target(BASE_URL);
    }
}