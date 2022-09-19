package edu.festu.ivankuznetsov.filmviewersample.network;

import com.google.gson.annotations.SerializedName;

   
public class SpokenLanguages {

   @SerializedName("name")
   String name;

   @SerializedName("nameEn")
   String nameEn;


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }
    public String getNameEn() {
        return nameEn;
    }
    
}