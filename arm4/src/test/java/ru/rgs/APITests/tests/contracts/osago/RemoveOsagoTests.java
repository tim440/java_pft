package ru.rgs.APITests.tests.contracts.osago;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.rgs.APITests.TestBase;
import ru.rgs.APITests.model.contracts.delete.ContractDeleteResult;

import javax.ws.rs.client.Client;

import static org.testng.Assert.assertEquals;

@Feature("Договор ОСАГО")
@Story("Удаление")
public class RemoveOsagoTests extends TestBase{

    private Client client;

    @BeforeClass
    public void init(){
        client = storage.getClient();
    }

    @Test
    public void removeOsagoTest(){
        ContractDeleteResult deleteContractResult = removeContract(client, "700981591de30862211e6953e");
        assertEquals(deleteContractResult.isSuccess(), true);
    }
}