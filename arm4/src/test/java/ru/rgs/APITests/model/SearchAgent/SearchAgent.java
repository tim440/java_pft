package ru.rgs.APITests.model.SearchAgent;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class SearchAgent {

    private String offset;
    public String getOffset() { return this.offset; }
    public void setOffset(String offset) { this.offset = offset; }

    private String totalLength;
    public String getTotalLength() { return this.totalLength; }
    public void setTotalLength(String totalLength) { this.totalLength = totalLength; }

    @SerializedName("dataList")
    private ArrayList<Agent> agents;
    public ArrayList<Agent> getAgents() { return this.agents; }
    public void setAgents(ArrayList<Agent> agents) { this.agents = agents; }

    private boolean success;
    public boolean isSuccess() { return this.success; }
    public void setSuccess(boolean success) { this.success = success; }

    @Override
    public String toString() {
        return "SearchAgent{" +
                "offset='" + offset + '\'' +
                ", totalLength='" + totalLength + '\'' +
                ", agents=" + agents +
                ", success=" + success +
                '}';
    }
}