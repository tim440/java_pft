package ru.rgs.APITests;

import ru.rgs.APITests.model.SearchAgentStatement.AgentStatement.AgentStatementPreview;
import ru.rgs.APITests.model.SearchContract.preview.ContractPreview;
import ru.rgs.APITests.model.SearchInsurer.Insurer.InsurerPreview;
import ru.rgs.APITests.model.SearchVehicle.preview.VehiclePreview;
import ru.rgs.APITests.model.SearchAgent.SearchAgent;

import javax.ws.rs.client.Client;
import javax.ws.rs.core.Cookie;

public class Storage {

    private VehiclePreview vehiclePreview;
    private InsurerPreview insurerSearch;
    private SearchAgent searchAgent;
    private ContractPreview contractPreview;
    private Client client;
    private Cookie sessionCookie;
    private AgentStatementPreview agentStatementSearch;

    public Storage() {
    }

    public ContractPreview getContractPreview() {
        return contractPreview;
    }

    public void setContractPreview(ContractPreview contractPreview) {
        this.contractPreview = contractPreview;
    }

    public Cookie getSessionCookie() {
        return sessionCookie;
    }

    public void setSessionCookie(Cookie sessionCookie) {
        this.sessionCookie = sessionCookie;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public VehiclePreview getVehiclePreview() {
        return vehiclePreview;
    }

    public void setVehiclePreview(VehiclePreview vehiclePreview) {
        this.vehiclePreview = vehiclePreview;
    }

    public InsurerPreview getInsurerSearch() {
        return insurerSearch;
    }

    public void setInsurerSearch(InsurerPreview insurerSearch) {
        this.insurerSearch = insurerSearch;
    }

    public void setAgentStatementSearch(AgentStatementPreview agentStatementSearch) {
        this.agentStatementSearch = agentStatementSearch;
    }

    public AgentStatementPreview getAgentStatementSearch() {
        return agentStatementSearch;
    }

    public SearchAgent getSearchAgent() {
        return searchAgent;
    }

    public void setSearchAgent(SearchAgent searchAgent) {
        this.searchAgent = searchAgent;
    }
}
