package edu.festu.ivankuznetsov.filmviewersample.network;

import com.google.gson.annotations.SerializedName;

   
public class ImagesInfo {

   @SerializedName("_id")
   String Id;

   @SerializedName("framesCount")
   int framesCount;


    public void setId(String Id) {
        this.Id = Id;
    }
    public String getId() {
        return Id;
    }
    
    public void setFramesCount(int framesCount) {
        this.framesCount = framesCount;
    }
    public int getFramesCount() {
        return framesCount;
    }
    
}