package ru.rgs.APITests.model.contracts.osago.create;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class SaleGroup{

	@SerializedName("sysEditor")
	private String sysEditor;

	@SerializedName("endDate")
	private String endDate;

	@SerializedName("saleChannel")
	private SaleChannel saleChannel;

	@SerializedName("sysSource")
	private String sysSource;

	@SerializedName("name")
	private String name;

	@SerializedName("branchReference")
	private BranchReference branchReference;

	@SerializedName("id")
	private String id;

	@SerializedName("lastModified")
	private String lastModified;

	@SerializedName("sysUser")
	private String sysUser;

	@SerializedName("personReference")
	private PersonReference personReference;

	@SerializedName("startDate")
	private String startDate;

	public String getSysEditor(){
		return sysEditor;
	}

	public String getEndDate(){
		return endDate;
	}

	public SaleChannel getSaleChannel(){
		return saleChannel;
	}

	public String getSysSource(){
		return sysSource;
	}

	public String getName(){
		return name;
	}

	public BranchReference getBranchReference(){
		return branchReference;
	}

	public String getId(){
		return id;
	}

	public String getLastModified(){
		return lastModified;
	}

	public String getSysUser(){
		return sysUser;
	}

	public PersonReference getPersonReference(){
		return personReference;
	}

	public String getStartDate(){
		return startDate;
	}

	@Override
 	public String toString(){
		return 
			"SaleGroup{" + 
			"sysEditor = '" + sysEditor + '\'' + 
			",endDate = '" + endDate + '\'' + 
			",saleChannel = '" + saleChannel + '\'' + 
			",sysSource = '" + sysSource + '\'' + 
			",name = '" + name + '\'' + 
			",branchReference = '" + branchReference + '\'' + 
			",id = '" + id + '\'' + 
			",lastModified = '" + lastModified + '\'' + 
			",sysUser = '" + sysUser + '\'' + 
			",personReference = '" + personReference + '\'' + 
			",startDate = '" + startDate + '\'' + 
			"}";
		}
}