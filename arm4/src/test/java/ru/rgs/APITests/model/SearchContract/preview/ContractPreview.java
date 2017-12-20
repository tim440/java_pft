package ru.rgs.APITests.model.SearchContract.preview;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class ContractPreview{

	@SerializedName("offset")
	private String offset;

	@SerializedName("success")
	private boolean success;

	@SerializedName("dataList")
	private List<DataListItem> dataList;

	@SerializedName("totalLength")
	private String totalLength;

	public String getOffset(){
		return offset;
	}

	public boolean isSuccess(){
		return success;
	}

	public List<DataListItem> getDataList(){
		return dataList;
	}

	public String getTotalLength(){
		return totalLength;
	}

	@Override
 	public String toString(){
		return 
			"ContractPreview{" + 
			"offset = '" + offset + '\'' + 
			",success = '" + success + '\'' + 
			",dataList = '" + dataList + '\'' + 
			",totalLength = '" + totalLength + '\'' + 
			"}";
		}
}