package edu.festu.ivankuznetsov.filmviewersample.network;

import com.google.gson.annotations.SerializedName;

   
public class Images {

   @SerializedName("postersCount")
   int postersCount;

   @SerializedName("backdropsCount")
   int backdropsCount;

   @SerializedName("framesCount")
   int framesCount;


    public void setPostersCount(int postersCount) {
        this.postersCount = postersCount;
    }
    public int getPostersCount() {
        return postersCount;
    }
    
    public void setBackdropsCount(int backdropsCount) {
        this.backdropsCount = backdropsCount;
    }
    public int getBackdropsCount() {
        return backdropsCount;
    }
    
    public void setFramesCount(int framesCount) {
        this.framesCount = framesCount;
    }
    public int getFramesCount() {
        return framesCount;
    }
    
}