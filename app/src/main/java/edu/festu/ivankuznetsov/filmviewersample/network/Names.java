package edu.festu.ivankuznetsov.filmviewersample.network;

import com.google.gson.annotations.SerializedName;

   
public class Names {

   @SerializedName("name")
   String name;


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
}