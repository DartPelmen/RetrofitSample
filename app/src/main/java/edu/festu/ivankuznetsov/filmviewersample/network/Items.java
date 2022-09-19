package edu.festu.ivankuznetsov.filmviewersample.network;

import com.google.gson.annotations.SerializedName;

   
public class Items {

   @SerializedName("_id")
   String Id;

   @SerializedName("name")
   String name;

   @SerializedName("logo")
   Logo logo;

   @SerializedName("url")
   String url;


    public void setId(String Id) {
        this.Id = Id;
    }
    public String getId() {
        return Id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
    public void setLogo(Logo logo) {
        this.logo = logo;
    }
    public Logo getLogo() {
        return logo;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
    public String getUrl() {
        return url;
    }
    
}