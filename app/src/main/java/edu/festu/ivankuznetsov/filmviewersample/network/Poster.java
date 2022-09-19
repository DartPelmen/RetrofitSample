package edu.festu.ivankuznetsov.filmviewersample.network;

import com.google.gson.annotations.SerializedName;

   
public class Poster {

   @SerializedName("_id")
   String Id;

   @SerializedName("url")
   String url;

   @SerializedName("previewUrl")
   String previewUrl;


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
    
    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }
    public String getPreviewUrl() {
        return previewUrl;
    }
    
}