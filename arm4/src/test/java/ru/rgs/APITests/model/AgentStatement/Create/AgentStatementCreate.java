package ru.rgs.APITests.model.AgentStatement.Create;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class AgentStatementCreate{

	@SerializedName("createOperationResult")
	private CreateOperationResult createOperationResult;

	@SerializedName("success")
	private boolean success;

    private AgentStatementCreate(Builder builder) {
        createOperationResult = builder.createOperationResult;
        success = builder.success;
    }

    public CreateOperationResult getCreateOperationResult(){
		return createOperationResult;
	}

	public boolean isSuccess(){
		return success;
	}

	@Override
 	public String toString(){
		return 
			"AgentStatementCreate{" + 
			"createOperationResult = '" + createOperationResult + '\'' + 
			",success = '" + success + '\'' + 
			"}";
		}

    /**
     * {@code AgentStatementCreate} builder static inner class.
     */
    public static final class Builder {
        private CreateOperationResult createOperationResult;
        private boolean success;

        public Builder() {
        }

        /**
         * Sets the {@code createOperationResult} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param createOperationResult the {@code createOperationResult} to set
         * @return a reference to this Builder
         */
        public Builder withCreateOperationResult(CreateOperationResult createOperationResult) {
            this.createOperationResult = createOperationResult;
            return this;
        }

        /**
         * Sets the {@code success} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param success the {@code success} to set
         * @return a reference to this Builder
         */
        public Builder withSuccess(boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Returns a {@code AgentStatementCreate} built from the parameters previously set.
         *
         * @return a {@code AgentStatementCreate} built with parameters of this {@code AgentStatementCreate.Builder}
         */
        public AgentStatementCreate build() {
            return new AgentStatementCreate(this);
        }
    }
}