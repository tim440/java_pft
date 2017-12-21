package ru.rgs.APITests.tests.contracts.life;

import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.rgs.APITests.TestBase;

import javax.ws.rs.client.Client;

@Feature("Договор ЖИЗНЬ")
@Story("Создание договора")
public class CreateLifeTests extends TestBase {

    private Client client;

    @BeforeClass
    public void init(){
        client = storage.getClient();
    }

    @Test(description = "Минимально заполненный")
    public void createLifeTest(){
        createLife();
        createRequestForLifeSubmit();
        submitLife();
    }

    @Step("Сохранение договора ЖИЗНЬ")
    private void submitLife() {
        client.target(BASE_URL);
    }

    @Step("Создание запроса для сохранения договора ЖИЗНЬ из ответа создания")
    private void createRequestForLifeSubmit() {
        client.target(BASE_URL);
    }

    @Step("Создание договора ЖИЗНЬ и получение ответа с заполненными по умолчанию полями")
    private void createLife() {
        client.target(BASE_URL);
    }
}