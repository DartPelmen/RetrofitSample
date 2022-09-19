package edu.festu.ivankuznetsov.filmviewersample.network;

import com.google.gson.annotations.SerializedName;

   
public class Trailers {

   @SerializedName("_id")
   String Id;

   @SerializedName("url")
   String url;

   @SerializedName("name")
   String name;

   @SerializedName("site")
   String site;


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
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
    public void setSite(String site) {
        this.site = site;
    }
    public String getSite() {
        return site;
    }
    
}