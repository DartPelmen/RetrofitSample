package edu.festu.ivankuznetsov.filmviewersample.network;

import com.google.gson.annotations.SerializedName;

   
public class World {

   @SerializedName("_id")
   String Id;

   @SerializedName("value")
   int value;

   @SerializedName("currency")
   String currency;


    public void setId(String Id) {
        this.Id = Id;
    }
    public String getId() {
        return Id;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public String getCurrency() {
        return currency;
    }
    
}