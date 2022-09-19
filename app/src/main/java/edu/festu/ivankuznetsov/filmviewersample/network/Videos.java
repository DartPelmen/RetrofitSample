package edu.festu.ivankuznetsov.filmviewersample.network;
import java.util.List;

import com.google.gson.annotations.SerializedName;

   
public class Videos {

   @SerializedName("_id")
   String Id;

   @SerializedName("trailers")
   List<Trailers> trailers;

   @SerializedName("teasers")
   List<String> teasers;


    public void setId(String Id) {
        this.Id = Id;
    }
    public String getId() {
        return Id;
    }
    
    public void setTrailers(List<Trailers> trailers) {
        this.trailers = trailers;
    }
    public List<Trailers> getTrailers() {
        return trailers;
    }
    
    public void setTeasers(List<String> teasers) {
        this.teasers = teasers;
    }
    public List<String> getTeasers() {
        return teasers;
    }
    
}