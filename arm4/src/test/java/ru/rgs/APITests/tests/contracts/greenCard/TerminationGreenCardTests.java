package ru.rgs.APITests.tests.contracts.greenCard;

import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.rgs.APITests.TestBase;

import javax.ws.rs.client.Client;

@Feature("Договор ЗЕЛЕНАЯ КАРТА")
@Story("Расторжение")
public class TerminationGreenCardTests extends TestBase{

    private Client client;

    @BeforeClass
    public void init(){
        client = storage.getClient();
    }

    @Test(description = "На текущую дату")
    public void terminationGreenCardTest(){
        terminationGreenCard();
    }

    @Step("Расторжение договора ЗЕЛЕНАЯ КАРТА")
    private void terminationGreenCard() {
        client.target(BASE_URL);
    }
}