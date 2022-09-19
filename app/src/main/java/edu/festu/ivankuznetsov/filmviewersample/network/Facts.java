package edu.festu.ivankuznetsov.filmviewersample.network;

import com.google.gson.annotations.SerializedName;

   
public class Facts {

   @SerializedName("value")
   String value;

   @SerializedName("type")
   String type;

   @SerializedName("spoiler")
   boolean spoiler;


    public void setValue(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
    
    public void setSpoiler(boolean spoiler) {
        this.spoiler = spoiler;
    }
    public boolean getSpoiler() {
        return spoiler;
    }
    
}