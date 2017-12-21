package ru.rgs.APITests.model.AgentStatement;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class ModificationResult{

	@SerializedName("id")
	private String id;

	@SerializedName("lastModified")
	private String lastModified;

	@SerializedName("agentStatementStatus")
	private AgentStatementStatus agentStatementStatus;

	@SerializedName("paymentStatus")
	private PaymentStatus paymentStatus;

	public String getId(){
		return id;
	}

	public String getLastModified(){
		return lastModified;
	}

	public AgentStatementStatus getAgentStatementStatus(){
		return agentStatementStatus;
	}

	public PaymentStatus getPaymentStatus(){
		return paymentStatus;
	}

	@Override
 	public String toString(){
		return 
			"ModificationResult{" + 
			"id = '" + id + '\'' + 
			",lastModified = '" + lastModified + '\'' + 
			",agentStatementStatus = '" + agentStatementStatus + '\'' + 
			",paymentStatus = '" + paymentStatus + '\'' + 
			"}";
		}
}