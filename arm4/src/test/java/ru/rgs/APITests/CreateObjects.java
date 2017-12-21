package ru.rgs.APITests;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.qameta.allure.Step;
import ru.rgs.APITests.model.AgentStatement.Create.AgentStatementCreate;
import ru.rgs.APITests.model.AgentStatement.Submit.AgentStatementSubmit;
import ru.rgs.APITests.model.SearchInsurer.InsurerFull.FullInsurer;
import ru.rgs.APITests.model.SearchVehicle.full.VehicleFull;
import ru.rgs.APITests.model.contracts.osago.create.OsagoCreate;
import ru.rgs.APITests.model.contracts.osago.submit.OsagoSubmit;

import static org.testng.Assert.assertEquals;

public class CreateObjects {

  private static Gson gson = new GsonBuilder().serializeNulls().create();

  /*
   * Создание отчета агента для сохранения из созданного отчета агента с дополнением необходимой информации
   * @param agentStatementCreate
   * @param agentStatementDate
   * @return
   */
  @Step("Выполняем сохранение отчета агента RU и получаем ответ")
  public static AgentStatementSubmit createAgentReportSubmit(AgentStatementCreate agentStatementCreate, String agentStatementDate, String currencyName, String currencyId, String paymentName, String paymentId) {
    String agentStatementNumberFromDate = getAgentStatementDataRu(agentStatementDate);
    AgentStatementSubmit agentStatementSubmit = new AgentStatementSubmit(agentStatementCreate,
            agentStatementDate,
            agentStatementNumberFromDate,
            currencyName,
            currencyId,
            paymentName,
            paymentId
    );

    return agentStatementSubmit;
  }


  @Step("Выполняем сохранение отчета агента USD и получаем ответ")
  public static AgentStatementSubmit createAgentReportSubmitUSD(AgentStatementCreate agentStatementCreate, String agentStatementDate, String currencyName, String currencyId, String paymentName, String paymentId) {
    String agentStatementNumberFromDate = getAgentStatementDateUSD(agentStatementDate);
    AgentStatementSubmit agentStatementSubmit = new AgentStatementSubmit(agentStatementCreate,
            agentStatementDate,
            agentStatementNumberFromDate,
            currencyName,
            currencyId,
            paymentName,
            paymentId
    );
    return agentStatementSubmit;
  }

  public static String getAgentStatementDataRu(String agentStatementDate) {
    return "-" + agentStatementDate.substring(8, 10) + agentStatementDate.substring(5, 7) + agentStatementDate.substring(2, 4) + "-RU";
  }

  public static String getAgentStatementDateUSD(String agentStatementDate) {
    return "-" + agentStatementDate.substring(8, 10) + agentStatementDate.substring(5, 7) + agentStatementDate.substring(2, 4) + "-USD";
  }

  public static OsagoSubmit createOsagoSubmit(OsagoCreate osagoCreate, FullInsurer insurer, VehicleFull vehicleFound) {
    OsagoSubmit osagoSubmit = new OsagoSubmit(osagoCreate, insurer, vehicleFound);
    return osagoSubmit;
  }
}
