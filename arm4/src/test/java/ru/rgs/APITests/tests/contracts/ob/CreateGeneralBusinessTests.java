package ru.rgs.APITests.tests.contracts.ob;

import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.rgs.APITests.TestBase;

import javax.ws.rs.client.Client;

@Feature("Договор ОБ")
@Story("Создание договора")
public class CreateGeneralBusinessTests extends TestBase {

    private Client client;

    @BeforeClass
    public void init(){
        client = storage.getClient();
    }

    @Test(description = "Минимально заполненный")
    public void createGeneralBusinessTest(){
        createGeneralBusiness();
        createRequestForGeneralBusinessSubmit();
        submitGeneralBusiness();
    }

    @Step("Сохранение договора ОБ")
    private void submitGeneralBusiness() {
        client.target(BASE_URL);
    }

    @Step("Создание запроса для сохранения договора ОБ из ответа создания")
    private void createRequestForGeneralBusinessSubmit() {
        client.target(BASE_URL);
    }

    @Step("Создание договора ОБ и получение ответа с заполненными по умолчанию полями")
    private void createGeneralBusiness() {
        client.target(BASE_URL);
    }
}