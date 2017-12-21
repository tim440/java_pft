package ru.rgs.APITests.model.contracts.dsago;

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

	public void setFullPath(String fullPath){
		this.fullPath = fullPath;
	}

	public String getFullPath(){
		return fullPath;
	}

	public void setPath(String path){
		this.path = path;
	}

	public String getPath(){
		return path;
	}

	public void setSelectable(String selectable){
		this.selectable = selectable;
	}

	public String getSelectable(){
		return selectable;
	}

	public void setKladrTerritoryCode(String kladrTerritoryCode){
		this.kladrTerritoryCode = kladrTerritoryCode;
	}

	public String getKladrTerritoryCode(){
		return kladrTerritoryCode;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setTerritoryType(TerritoryType territoryType){
		this.territoryType = territoryType;
	}

	public TerritoryType getTerritoryType(){
		return territoryType;
	}

	public void setIsLeaf(String isLeaf){
		this.isLeaf = isLeaf;
	}

	public String getIsLeaf(){
		return isLeaf;
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