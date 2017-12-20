package ru.rgs.APITests.tests.contracts.greenCard;

import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.rgs.APITests.TestBase;

import javax.ws.rs.client.Client;

@Feature("Договор ЗЕЛЕНАЯ КАРТА")
@Story("Создание договора")
public class CreateGreenCardTests extends TestBase {

    private Client client;

    @BeforeClass
    public void init(){
        client = storage.getClient();
    }

    @Test(description = "Минимально заполненный")
    public void createGreenCardTest(){
        createGreenCard();
        createRequestForGreenCardSubmit();
        submitGreenCard();
    }

    @Step("Сохранение договора ЗЕЛЕНАЯ КАРТА")
    private void submitGreenCard() {
        client.target(BASE_URL);
    }

    @Step("Создание запроса для сохранения договора ЗЕЛЕНАЯ КАРТА из ответа создания")
    private void createRequestForGreenCardSubmit() {
        client.target(BASE_URL);
    }

    @Step("Создание договора ЗЕЛЕНАЯ КАРТА и получение ответа с заполненными по умолчанию полями")
    private void createGreenCard() {
        client.target(BASE_URL);
    }
}