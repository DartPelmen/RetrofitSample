package edu.festu.ivankuznetsov.filmviewersample.network;

import com.google.gson.annotations.SerializedName;

   
public class Technology {

   @SerializedName("_id")
   String Id;

   @SerializedName("hasImax")
   boolean hasImax;

   @SerializedName("has3D")
   boolean has3D;


    public void setId(String Id) {
        this.Id = Id;
    }
    public String getId() {
        return Id;
    }
    
    public void setHasImax(boolean hasImax) {
        this.hasImax = hasImax;
    }
    public boolean getHasImax() {
        return hasImax;
    }
    
    public void setHas3D(boolean has3D) {
        this.has3D = has3D;
    }
    public boolean getHas3D() {
        return has3D;
    }
    
}