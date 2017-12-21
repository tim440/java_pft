package ru.rgs.APITests.tests.contracts.dsago;

import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.rgs.APITests.TestBase;

import javax.ws.rs.client.Client;

@Feature("Договор ДСАГО")
@Story("Создание договора")
public class CreateDsagoTests extends TestBase {

    private Client client;

    @BeforeClass
    public void init(){
        client = storage.getClient();
    }

    @Test(description = "Минимально заполненный")
    public void createDsagoTest(){
        createDsago();
        createRequestForDsagoSubmit();
        submitDsago();
    }

    @Step("Сохранение договора ДСАГО")
    private void submitDsago() {
        client.target(BASE_URL);
    }

    @Step("Создание запроса для сохранения договора ДСАГО из ответа создания")
    private void createRequestForDsagoSubmit() {
        client.target(BASE_URL);
    }

    @Step("Создание договора ДСАГО и получение ответа с заполненными по умолчанию полями")
    private void createDsago() {
        client.target(BASE_URL);
    }
}