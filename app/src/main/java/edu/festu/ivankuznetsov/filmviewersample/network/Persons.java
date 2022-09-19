package edu.festu.ivankuznetsov.filmviewersample.network;

import com.google.gson.annotations.SerializedName;

   
public class Persons {

   @SerializedName("id")
   int id;

   @SerializedName("name")
   String name;

   @SerializedName("enName")
   String enName;

   @SerializedName("description")
   String description;

   @SerializedName("enProfession")
   String enProfession;

   @SerializedName("photo")
   String photo;


    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
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
    
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    
    public void setEnProfession(String enProfession) {
        this.enProfession = enProfession;
    }
    public String getEnProfession() {
        return enProfession;
    }
    
    public void setPhoto(String photo) {
        this.photo = photo;
    }
    public String getPhoto() {
        return photo;
    }
    
}