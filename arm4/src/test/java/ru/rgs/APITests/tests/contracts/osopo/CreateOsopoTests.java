package ru.rgs.APITests.tests.contracts.osopo;

import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.rgs.APITests.TestBase;

import javax.ws.rs.client.Client;

@Feature("Договор ОСОПО")
@Story("Создание договора")
public class CreateOsopoTests extends TestBase {

    private Client client;

    @BeforeClass
    public void init(){
        client = storage.getClient();
    }

    @Test(description = "Минимально заполненный")
    public void createOsopoTest(){
        createOsopo();
        createRequestForOsopoSubmit();
        submitOsopo();
    }

    @Step("Сохранение договора ОСОПО")
    private void submitOsopo() {
        client.target(BASE_URL);
    }

    @Step("Создание запроса для сохранения договора ОСОПО из ответа создания")
    private void createRequestForOsopoSubmit() {
        client.target(BASE_URL);
    }

    @Step("Создание договора ОСОПО и получение ответа с заполненными по умолчанию полями")
    private void createOsopo() {
        client.target(BASE_URL);
    }
}