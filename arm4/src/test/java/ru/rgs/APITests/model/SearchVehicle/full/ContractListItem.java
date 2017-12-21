package ru.rgs.APITests.model.SearchVehicle.full;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class ContractListItem{

	@SerializedName("contractDate")
	private String contractDate;

	@SerializedName("product")
	private Product product;

	@SerializedName("isTIConcluded")
	private String isTIConcluded;

	@SerializedName("contractStatus")
	private ContractStatus contractStatus;

	@SerializedName("contractStartDate")
	private String contractStartDate;

	@SerializedName("contractType")
	private ContractType contractType;

	@SerializedName("contractEndDate")
	private String contractEndDate;

	@SerializedName("isTIPlusConcluded")
	private String isTIPlusConcluded;

	@SerializedName("isSimplifiedForm")
	private String isSimplifiedForm;

	@SerializedName("number")
	private String number;

	@SerializedName("mainClientReference")
	private MainClientReference mainClientReference;

	@SerializedName("productVariant")
	private ProductVariant productVariant;

	@SerializedName("series")
	private String series;

	@SerializedName("entityPurpose")
	private String entityPurpose;

	@SerializedName("id")
	private String id;

	@SerializedName("useNewCascoDate")
	private String useNewCascoDate;

	@SerializedName("lastModified")
	private String lastModified;

	@SerializedName("bid")
	private String bid;

	public String getContractDate(){
		return contractDate;
	}

	public Product getProduct(){
		return product;
	}

	public String getIsTIConcluded(){
		return isTIConcluded;
	}

	public ContractStatus getContractStatus(){
		return contractStatus;
	}

	public String getContractStartDate(){
		return contractStartDate;
	}

	public ContractType getContractType(){
		return contractType;
	}

	public String getContractEndDate(){
		return contractEndDate;
	}

	public String getIsTIPlusConcluded(){
		return isTIPlusConcluded;
	}

	public String getIsSimplifiedForm(){
		return isSimplifiedForm;
	}

	public String getNumber(){
		return number;
	}

	public MainClientReference getMainClientReference(){
		return mainClientReference;
	}

	public ProductVariant getProductVariant(){
		return productVariant;
	}

	public String getSeries(){
		return series;
	}

	public String getEntityPurpose(){
		return entityPurpose;
	}

	public String getId(){
		return id;
	}

	public String getUseNewCascoDate(){
		return useNewCascoDate;
	}

	public String getLastModified(){
		return lastModified;
	}

	public String getBid(){
		return bid;
	}

	@Override
 	public String toString(){
		return 
			"ContractListItem{" + 
			"contractDate = '" + contractDate + '\'' + 
			",product = '" + product + '\'' + 
			",isTIConcluded = '" + isTIConcluded + '\'' + 
			",contractStatus = '" + contractStatus + '\'' + 
			",contractStartDate = '" + contractStartDate + '\'' + 
			",contractType = '" + contractType + '\'' + 
			",contractEndDate = '" + contractEndDate + '\'' + 
			",isTIPlusConcluded = '" + isTIPlusConcluded + '\'' + 
			",isSimplifiedForm = '" + isSimplifiedForm + '\'' + 
			",number = '" + number + '\'' + 
			",mainClientReference = '" + mainClientReference + '\'' + 
			",productVariant = '" + productVariant + '\'' + 
			",series = '" + series + '\'' + 
			",entityPurpose = '" + entityPurpose + '\'' + 
			",id = '" + id + '\'' + 
			",useNewCascoDate = '" + useNewCascoDate + '\'' + 
			",lastModified = '" + lastModified + '\'' + 
			",bid = '" + bid + '\'' + 
			"}";
		}
}