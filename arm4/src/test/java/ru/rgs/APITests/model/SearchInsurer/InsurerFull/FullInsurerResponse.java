package ru.rgs.APITests.model.SearchInsurer.InsurerFull;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.List;

@Generated("com.robohorse.robopojogenerator")
public class FullInsurerResponse{

	@SerializedName("success")
	private boolean success;

	@SerializedName("dataList")
	private List<FullInsurer> fullInsurers;

	@SerializedName("totalLength")
	private int totalLength;

	public boolean isSuccess(){
		return success;
	}

	public List<FullInsurer> getFullInsurers(){
		return fullInsurers;
	}

	public int getTotalLength(){
		return totalLength;
	}

	@Override
 	public String toString(){
		return 
			"FullInsurerResponse{" + 
			"success = '" + success + '\'' + 
			",fullInsurers = '" + fullInsurers + '\'' +
			",totalLength = '" + totalLength + '\'' + 
			"}";
		}
}