package ru.rgs.APITests.tests.contracts.express;

import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.rgs.APITests.TestBase;

import javax.ws.rs.client.Client;

@Feature("Договор ЭКСПРЕСС")
@Story("Создание договора")
public class CreateExpressTests extends TestBase {

    private Client client;

    @BeforeClass
    public void init(){
        client = storage.getClient();
    }

    @Test(description = "Минимально заполненный")
    public void createExpressTest(){
        createExpress();
        createRequestForExpressSubmit();
        submitExpress();
    }

    @Step("Сохранение договора ЭКСПРЕСС")
    private void submitExpress() {
        client.target(BASE_URL);
    }

    @Step("Создание запроса для сохранения договора ЭКСПРЕСС из ответа создания")
    private void createRequestForExpressSubmit() {
        client.target(BASE_URL);
    }

    @Step("Создание договора ЭКСПРЕСС и получение ответа с заполненными по умолчанию полями")
    private void createExpress() {
        client.target(BASE_URL);
    }
}