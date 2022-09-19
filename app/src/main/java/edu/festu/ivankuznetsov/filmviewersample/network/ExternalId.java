package edu.festu.ivankuznetsov.filmviewersample.network;

import com.google.gson.annotations.SerializedName;

   
public class ExternalId {

   @SerializedName("_id")
   String Id;

   @SerializedName("imdb")
   String imdb;


    public void setId(String Id) {
        this.Id = Id;
    }
    public String getId() {
        return Id;
    }
    
    public void setImdb(String imdb) {
        this.imdb = imdb;
    }
    public String getImdb() {
        return imdb;
    }
    
}