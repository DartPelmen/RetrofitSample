package edu.festu.ivankuznetsov.filmviewersample.network;

import com.google.gson.annotations.SerializedName;

   
public class SimilarMovies {

   @SerializedName("_id")
   String Id;

   @SerializedName("id")
   int id;

   @SerializedName("name")
   String name;

   @SerializedName("enName")
   String enName;

   @SerializedName("alternativeName")
   String alternativeName;

   @SerializedName("poster")
   Poster poster;


    public void setId(String Id) {
        this.Id = Id;
    }
    public String getId() {
        return Id;
    }
    
    public void setID(int id) {
        this.id = id;
    }
    public int getID() {
        return id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
    public void setEnName(String enName) {
        this.enName = enName;
    }
    public String getEnName() {
        return enName;
    }
    
    public void setAlternativeName(String alternativeName) {
        this.alternativeName = alternativeName;
    }
    public String getAlternativeName() {
        return alternativeName;
    }
    
    public void setPoster(Poster poster) {
        this.poster = poster;
    }
    public Poster getPoster() {
        return poster;
    }
    
}