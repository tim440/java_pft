package ru.rgs.APITests.tests.contracts.osgopp;

import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.rgs.APITests.TestBase;

import javax.ws.rs.client.Client;

@Feature("Договор ОСГОПП")
@Story("Создание договора")
public class CreateOsgoppTests extends TestBase {

    private Client client;

    @BeforeClass
    public void init(){
        client = storage.getClient();
    }

    @Test(description = "Минимально заполненный")
    public void createOsgoppTest(){
        createOsgopp();
        createRequestForOsgoppSubmit();
        submitOsgopp();
    }

    @Step("Сохранение договора ОСГОПП")
    private void submitOsgopp() {
        client.target(BASE_URL);
    }

    @Step("Создание запроса для сохранения договора ОСГОПП из ответа создания")
    private void createRequestForOsgoppSubmit() {
        client.target(BASE_URL);
    }

    @Step("Создание договора ОСГОПП и получение ответа с заполненными по умолчанию полями")
    private void createOsgopp() {
        client.target(BASE_URL);
    }
}