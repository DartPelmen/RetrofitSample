package edu.festu.ivankuznetsov.filmviewersample.network;

import com.google.gson.annotations.SerializedName;

   
public class Votes {

   @SerializedName("_id")
   String Id;

   @SerializedName("kp")
   int kp;

   @SerializedName("imdb")
   int imdb;

   @SerializedName("filmCritics")
   int filmCritics;

   @SerializedName("russianFilmCritics")
   int russianFilmCritics;

   @SerializedName("await")
   int await;


    public void setId(String Id) {
        this.Id = Id;
    }
    public String getId() {
        return Id;
    }
    
    public void setKp(int kp) {
        this.kp = kp;
    }
    public int getKp() {
        return kp;
    }
    
    public void setImdb(int imdb) {
        this.imdb = imdb;
    }
    public int getImdb() {
        return imdb;
    }
    
    public void setFilmCritics(int filmCritics) {
        this.filmCritics = filmCritics;
    }
    public int getFilmCritics() {
        return filmCritics;
    }
    
    public void setRussianFilmCritics(int russianFilmCritics) {
        this.russianFilmCritics = russianFilmCritics;
    }
    public int getRussianFilmCritics() {
        return russianFilmCritics;
    }
    
    public void setAwait(int await) {
        this.await = await;
    }
    public int getAwait() {
        return await;
    }
    
}