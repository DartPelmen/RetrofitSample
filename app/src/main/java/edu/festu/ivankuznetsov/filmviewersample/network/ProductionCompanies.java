package edu.festu.ivankuznetsov.filmviewersample.network;

import com.google.gson.annotations.SerializedName;

   
public class ProductionCompanies {

   @SerializedName("name")
   String name;

   @SerializedName("url")
   String url;

   @SerializedName("previewUrl")
   String previewUrl;


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
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