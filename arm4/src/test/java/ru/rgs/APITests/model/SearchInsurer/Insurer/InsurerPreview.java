package ru.rgs.APITests.model.SearchInsurer.Insurer;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.List;

@Generated("com.robohorse.robopojogenerator")
public class InsurerPreview {

	@SerializedName("offset")
	private String offset;

	@SerializedName("success")
	private boolean success;

	@SerializedName("dataList")
	private List<InsurerFound> insurers;

	@SerializedName("totalLength")
	private String totalLength;

	public String getOffset(){
		return offset;
	}

	public boolean isSuccess(){
		return success;
	}

	public List<InsurerFound> getInsurers(){
		return insurers;
	}

	public String getTotalLength(){
		return totalLength;
	}

	@Override
 	public String toString(){
		return 
			"InsurerPreview{" +
			"offset = '" + offset + '\'' + 
			",success = '" + success + '\'' + 
			",insurers = '" + insurers + '\'' +
			",totalLength = '" + totalLength + '\'' + 
			"}";
		}
}