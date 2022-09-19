package edu.festu.ivankuznetsov.filmviewersample.network;
import java.util.Date;

import com.google.gson.annotations.SerializedName;

   
public class Premiere {

   @SerializedName("_id")
   String Id;

   @SerializedName("country")
   String country;

   @SerializedName("world")
   Date world;

   @SerializedName("russia")
   Date russia;

   @SerializedName("cinema")
   Date cinema;

   @SerializedName("dvd")
   Date dvd;

   @SerializedName("bluray")
   Date bluray;


    public void setId(String Id) {
        this.Id = Id;
    }
    public String getId() {
        return Id;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    public String getCountry() {
        return country;
    }
    
    public void setWorld(Date world) {
        this.world = world;
    }
    public Date getWorld() {
        return world;
    }
    
    public void setRussia(Date russia) {
        this.russia = russia;
    }
    public Date getRussia() {
        return russia;
    }
    
    public void setCinema(Date cinema) {
        this.cinema = cinema;
    }
    public Date getCinema() {
        return cinema;
    }
    
    public void setDvd(Date dvd) {
        this.dvd = dvd;
    }
    public Date getDvd() {
        return dvd;
    }
    
    public void setBluray(Date bluray) {
        this.bluray = bluray;
    }
    public Date getBluray() {
        return bluray;
    }
    
}