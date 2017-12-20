package ru.rgs.APITests.model.SearchVehicle.search;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Simple{

	@SerializedName("op")
	private String op;

	@SerializedName("property")
	private String property;

	@SerializedName("value")
	private String value;

	public Simple(String property, String value, String op) {
		this.property = property;
		this.value = value;
		this.op = op;
	}

    public String getOp(){
		return op;
	}

	public String getProperty(){
		return property;
	}

	public String getValue(){
		return value;
	}

	@Override
 	public String toString(){
		return 
			"Simple{" + 
			"op = '" + op + '\'' + 
			",property = '" + property + '\'' + 
			",value = '" + value + '\'' + 
			"}";
		}
}