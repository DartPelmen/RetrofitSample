package edu.festu.ivankuznetsov.filmviewersample.network;

import com.google.gson.annotations.SerializedName;

   
public class Distributors {

   @SerializedName("distributor")
   String distributor;

   @SerializedName("distributorRelease")
   String distributorRelease;


    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }
    public String getDistributor() {
        return distributor;
    }
    
    public void setDistributorRelease(String distributorRelease) {
        this.distributorRelease = distributorRelease;
    }
    public String getDistributorRelease() {
        return distributorRelease;
    }
    
}