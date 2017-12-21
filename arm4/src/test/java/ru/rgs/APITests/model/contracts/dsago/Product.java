package ru.rgs.APITests.model.contracts.dsago;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Product{

	@SerializedName("code")
	private String code;

	@SerializedName("name")
	private String name;

	@SerializedName("personRole")
	private PersonRole personRole;

	@SerializedName("id")
	private String id;

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setPersonRole(PersonRole personRole){
		this.personRole = personRole;
	}

	public PersonRole getPersonRole(){
		return personRole;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"Product{" + 
			"code = '" + code + '\'' + 
			",name = '" + name + '\'' + 
			",personRole = '" + personRole + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}