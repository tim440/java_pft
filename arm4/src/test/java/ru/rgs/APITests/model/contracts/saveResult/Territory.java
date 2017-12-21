package ru.rgs.APITests.model.contracts.saveResult;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Territory{

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
			"fullPath = '" + fullPath + '\'' + 
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