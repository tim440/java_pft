package ru.rgs.APITests.tests.contracts.boxed;

import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.rgs.APITests.TestBase;

import javax.ws.rs.client.Client;

@Feature("Договор КОРОБОЧНЫЙ")
@Story("Создание договора")
public class CreateBoxedTests extends TestBase {

    private Client client;

    @BeforeClass
    public void init(){
        client = storage.getClient();
    }

    @Test(description = "Минимально заполненный")
    public void createBoxedTest(){
        createBoxed();
        createRequestForBoxedSubmit();
        submitBoxed();
    }

    @Step("Сохранение договора КОРОБОЧНЫЙ")
    private void submitBoxed() {
        client.target(BASE_URL);
    }

    @Step("Создание запроса для сохранения договора КОРОБОЧНЫЙ из ответа создания")
    private void createRequestForBoxedSubmit() {
        client.target(BASE_URL);
    }

    @Step("Создание договора КОРОБОЧНЫЙ и получение ответа с заполненными по умолчанию полями")
    private void createBoxed() {
        client.target(BASE_URL);
    }
}