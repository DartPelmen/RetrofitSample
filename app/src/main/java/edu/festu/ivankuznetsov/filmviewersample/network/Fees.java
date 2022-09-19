package edu.festu.ivankuznetsov.filmviewersample.network;

import com.google.gson.annotations.SerializedName;

   
public class Fees {

   @SerializedName("world")
   World world;

   @SerializedName("russia")
   Russia russia;

   @SerializedName("usa")
   Usa usa;

   @SerializedName("_id")
   String Id;


    public void setWorld(World world) {
        this.world = world;
    }
    public World getWorld() {
        return world;
    }
    
    public void setRussia(Russia russia) {
        this.russia = russia;
    }
    public Russia getRussia() {
        return russia;
    }
    
    public void setUsa(Usa usa) {
        this.usa = usa;
    }
    public Usa getUsa() {
        return usa;
    }
    
    public void setId(String Id) {
        this.Id = Id;
    }
    public String getId() {
        return Id;
    }
    
}