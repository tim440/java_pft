package ru.rgs.APITests.model.contracts.saveResult;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class ValidationLogListItem{

	@SerializedName("fromDocument")
	private String fromDocument;

	@SerializedName("name")
	private String name;

	@SerializedName("errorCode")
	private String errorCode;

	@SerializedName("fixed")
	private String fixed;

	@SerializedName("id")
	private String id;

	@SerializedName("lastModified")
	private String lastModified;

	@SerializedName("sysUserFullName")
	private String sysUserFullName;

	@SerializedName("createDate")
	private String createDate;

	public String getFromDocument(){
		return fromDocument;
	}

	public String getName(){
		return name;
	}

	public String getErrorCode(){
		return errorCode;
	}

	public String getFixed(){
		return fixed;
	}

	public String getId(){
		return id;
	}

	public String getLastModified(){
		return lastModified;
	}

	public String getSysUserFullName(){
		return sysUserFullName;
	}

	public String getCreateDate(){
		return createDate;
	}

	@Override
 	public String toString(){
		return 
			"ValidationLogListItem{" + 
			"fromDocument = '" + fromDocument + '\'' + 
			",name = '" + name + '\'' + 
			",errorCode = '" + errorCode + '\'' + 
			",fixed = '" + fixed + '\'' + 
			",id = '" + id + '\'' + 
			",lastModified = '" + lastModified + '\'' + 
			",sysUserFullName = '" + sysUserFullName + '\'' + 
			",createDate = '" + createDate + '\'' + 
			"}";
		}
}