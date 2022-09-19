package edu.festu.ivankuznetsov.filmviewersample.network;
import java.util.List;

import com.google.gson.annotations.SerializedName;

   
public class Watchability {

   @SerializedName("_id")
   String Id;

   @SerializedName("items")
   List<Items> items;


    public void setId(String Id) {
        this.Id = Id;
    }
    public String getId() {
        return Id;
    }
    
    public void setItems(List<Items> items) {
        this.items = items;
    }
    public List<Items> getItems() {
        return items;
    }
    
}