package ru.rgs.APITests.tests.contracts.kasko;

import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.rgs.APITests.TestBase;

import javax.ws.rs.client.Client;

@Feature("Договор КАСКО")
@Story("Расторжение")
public class TerminationKaskoTests extends TestBase{

    private Client client;

    @BeforeClass
    public void init(){
        client = storage.getClient();
    }

    @Test(description = "На текущую дату")
    public void terminationKaskoTest(){
        terminationKasko();
    }

    @Step("Расторжение договора КАСКО")
    private void terminationKasko() {
        client.target(BASE_URL);
    }
}