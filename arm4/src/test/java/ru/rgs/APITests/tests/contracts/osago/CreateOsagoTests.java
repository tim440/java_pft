package ru.rgs.APITests.tests.contracts.osago;

import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.rgs.APITests.TestBase;

import javax.ws.rs.client.Client;

@Feature("Договор ОСАГО")
@Story("Создание договора")
public class CreateOsagoTests extends TestBase {

    private Client client;

    @BeforeClass
    public void init(){
        client = storage.getClient();
    }

    @Test(description = "Минимально заполненный")
    public void createOsagoTest(){
        createOsago();
        createRequestForOsagoSubmit();
        submitOsago();
    }

    @Step("Сохранение договора ОСАГО")
    private void submitOsago() {
        client.target(BASE_URL);
    }

    @Step("Создание запроса для сохранения договора ОСАГО из ответа создания")
    private void createRequestForOsagoSubmit() {
        client.target(BASE_URL);
    }

    @Step("Создание договора ОСАГО и получение ответа с заполненными по умолчанию полями")
    private void createOsago() {
        client.target(BASE_URL);
    }
}