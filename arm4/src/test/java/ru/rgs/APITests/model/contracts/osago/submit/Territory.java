package ru.rgs.APITests.model.contracts.osago.submit;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Territory{

	@SerializedName("zip")
	transient private String zip;

	@SerializedName("fullPath")
	private String fullPath;

	@SerializedName("path")
	private String path;

	@SerializedName("selectable")
	private String selectable;

	@SerializedName("kladrTerritoryCode")
	private String kladrTerritoryCode;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private String id;

	@SerializedName("territoryType")
	private TerritoryType territoryType;

	@SerializedName("isLeaf")
	private String isLeaf;

	@SerializedName("parentId")
	private String parentId;

	public String getZip(){
		return zip;
	}

	public String getFullPath(){
		return fullPath;
	}

	public String getPath(){
		return path;
	}

	public String getSelectable(){
		return selectable;
	}

	public String getKladrTerritoryCode(){
		return kladrTerritoryCode;
	}

	public String getName(){
		return name;
	}

	public String getId(){
		return id;
	}

	public TerritoryType getTerritoryType(){
		return territoryType;
	}

	public String getIsLeaf(){
		return isLeaf;
	}

	public String getParentId(){
		return parentId;
	}

	@Override
 	public String toString(){
		return 
			"Territory{" + 
			"zip = '" + zip + '\'' + 
			",fullPath = '" + fullPath + '\'' + 
			",path = '" + path + '\'' + 
			",selectable = '" + selectable + '\'' + 
			",kladrTerritoryCode = '" + kladrTerritoryCode + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",territoryType = '" + territoryType + '\'' + 
			",isLeaf = '" + isLeaf + '\'' + 
			",parentId = '" + parentId + '\'' + 
			"}";
		}
}