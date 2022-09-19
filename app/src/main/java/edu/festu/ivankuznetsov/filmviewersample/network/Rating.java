package edu.festu.ivankuznetsov.filmviewersample.network;

import com.google.gson.annotations.SerializedName;

   
public class Rating {

   @SerializedName("_id")
   String Id;

   @SerializedName("kp")
   double kp;

   @SerializedName("imdb")
   double imdb;

   @SerializedName("filmCritics")
   double filmCritics;

   @SerializedName("russianFilmCritics")
   String russianFilmCritics;

   @SerializedName("await")
   String await;


    public void setId(String Id) {
        this.Id = Id;
    }
    public String getId() {
        return Id;
    }
    
    public void setKp(double kp) {
        this.kp = kp;
    }
    public double getKp() {
        return kp;
    }
    
    public void setImdb(double imdb) {
        this.imdb = imdb;
    }
    public double getImdb() {
        return imdb;
    }
    
    public void setFilmCritics(double filmCritics) {
        this.filmCritics = filmCritics;
    }
    public double getFilmCritics() {
        return filmCritics;
    }
    
    public void setRussianFilmCritics(String russianFilmCritics) {
        this.russianFilmCritics = russianFilmCritics;
    }
    public String getRussianFilmCritics() {
        return russianFilmCritics;
    }
    
    public void setAwait(String await) {
        this.await = await;
    }
    public String getAwait() {
        return await;
    }
    
}