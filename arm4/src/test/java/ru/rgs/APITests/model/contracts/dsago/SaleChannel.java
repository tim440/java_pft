package ru.rgs.APITests.model.contracts.dsago;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class SaleChannel{

	@SerializedName("id")
	private String id;

	@SerializedName("codeAndName")
	private String codeAndName;

	@SerializedName("parentId")
	private String parentId;

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setCodeAndName(String codeAndName){
		this.codeAndName = codeAndName;
	}

	public String getCodeAndName(){
		return codeAndName;
	}

	public void setParentId(String parentId){
		this.parentId = parentId;
	}

	public String getParentId(){
		return parentId;
	}

	@Override
 	public String toString(){
		return 
			"SaleChannel{" + 
			"id = '" + id + '\'' + 
			",codeAndName = '" + codeAndName + '\'' + 
			",parentId = '" + parentId + '\'' + 
			"}";
		}
}