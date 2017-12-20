package ru.rgs.APITests.tests.contracts.kasko;

import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.rgs.APITests.TestBase;

import javax.ws.rs.client.Client;

@Feature("Договор КАСКО")
@Story("Создание договора")
public class CreateKaskoTests extends TestBase {

    private Client client;

    @BeforeClass
    public void init(){
        client = storage.getClient();
    }

    @Test(description = "Минимально заполненный")
    public void createKaskoTest(){
        createKasko();
        createRequestForKaskoSubmit();
        submitKasko();
    }

    @Step("Сохранение договора КАСКО")
    private void submitKasko() {
        client.target(BASE_URL);
    }

    @Step("Создание запроса для сохранения договора КАСКО из ответа создания")
    private void createRequestForKaskoSubmit() {
        client.target(BASE_URL);
    }

    @Step("Создание договора КАСКО и получение ответа с заполненными по умолчанию полями")
    private void createKasko() {
        client.target(BASE_URL);
    }
}