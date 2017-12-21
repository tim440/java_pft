package ru.rgs.APITests.tests.contracts.life;

import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.rgs.APITests.TestBase;

import javax.ws.rs.client.Client;

@Feature("Договор ЖИЗНЬ")
@Story("Расторжение")
public class TerminationLifeTests extends TestBase{

    private Client client;

    @BeforeClass
    public void init(){
        client = storage.getClient();
    }

    @Test(description = "На текущую дату")
    public void terminationLifeTest(){
        terminationLife();
    }

    @Step("Расторжение договора ЖИЗНЬ")
    private void terminationLife() {
        client.target(BASE_URL);
    }
}