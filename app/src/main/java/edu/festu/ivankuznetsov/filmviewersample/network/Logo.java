package edu.festu.ivankuznetsov.filmviewersample.network;

import com.google.gson.annotations.SerializedName;

   
public class Logo {

   @SerializedName("_id")
   String Id;

   @SerializedName("url")
   String url;


    public void setId(String Id) {
        this.Id = Id;
    }
    public String getId() {
        return Id;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
    public String getUrl() {
        return url;
    }
    
}