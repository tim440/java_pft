package ru.rgs.APITests.model.contracts.dsago;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class LikardData{

	@SerializedName("likardDate")
	private Object likardDate;

	@SerializedName("likardBlank")
	private LikardBlank likardBlank;

	@SerializedName("likardPhoneNumber")
	private String likardPhoneNumber;

	@SerializedName("likardInsertDate")
	private Object likardInsertDate;

	public void setLikardDate(Object likardDate){
		this.likardDate = likardDate;
	}

	public Object getLikardDate(){
		return likardDate;
	}

	public void setLikardBlank(LikardBlank likardBlank){
		this.likardBlank = likardBlank;
	}

	public LikardBlank getLikardBlank(){
		return likardBlank;
	}

	public void setLikardPhoneNumber(String likardPhoneNumber){
		this.likardPhoneNumber = likardPhoneNumber;
	}

	public String getLikardPhoneNumber(){
		return likardPhoneNumber;
	}

	public void setLikardInsertDate(Object likardInsertDate){
		this.likardInsertDate = likardInsertDate;
	}

	public Object getLikardInsertDate(){
		return likardInsertDate;
	}

	@Override
 	public String toString(){
		return 
			"LikardData{" + 
			"likardDate = '" + likardDate + '\'' + 
			",likardBlank = '" + likardBlank + '\'' + 
			",likardPhoneNumber = '" + likardPhoneNumber + '\'' + 
			",likardInsertDate = '" + likardInsertDate + '\'' + 
			"}";
		}
}