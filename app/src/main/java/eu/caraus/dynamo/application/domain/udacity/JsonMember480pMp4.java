package eu.caraus.dynamo.application.domain.udacity;


import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class JsonMember480pMp4 implements Serializable {

	@SerializedName("uri")
	private String uri;

	public void setUri(String uri){
		this.uri = uri;
	}

	public String getUri(){
		return uri;
	}

	@Override
 	public String toString(){
		return 
			"JsonMember480pMp4{" + 
			"uri = '" + uri + '\'' + 
			"}";
		}
}