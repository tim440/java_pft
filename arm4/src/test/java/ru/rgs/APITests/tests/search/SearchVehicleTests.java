package ru.rgs.APITests.tests.search;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.rgs.APITests.TestBase;
import ru.rgs.APITests.model.SearchVehicle.preview.VehiclePreview;
import ru.rgs.APITests.model.SearchVehicle.search.VehicleSearch;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static org.testng.Assert.assertEquals;

@Feature("Поиск")
@Story("ТС")
public class SearchVehicleTests extends TestBase {

    private Client client;

    @BeforeClass
    public void init(){
        client = storage.getClient();
    }

    @Test(description = "По владельцу и марке")
    public void searchVehicle(){
        VehicleSearch vehicleSearch = new VehicleSearch();
        String jsonVehicleSearch = gson.toJson(vehicleSearch);
        String requestVehicleSearch = "constraints=" + jsonVehicleSearch + "&page=1&start=0&limit=100";
        target = client.target(BASE_URL + "private/data/module-search/VehicleSearchWs/find");
        Response responseVehicleSearch = getInvocation(target, Entity.entity(requestVehicleSearch, MediaType.APPLICATION_FORM_URLENCODED_TYPE)).invoke();
        VehiclePreview vehiclePreview = getVehiclePreview(responseVehicleSearch);
        storage.setVehiclePreview(vehiclePreview);
        assertEquals(vehiclePreview.isSuccess(), true);
    }
}