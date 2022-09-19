package edu.festu.ivankuznetsov.filmviewersample.network

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


/**
 * Одиночка - объект для организации сетевого соединения
 * */
object RetrofitObject{
        private lateinit var retrofit: Retrofit
        private val baseURL = "https://api.kinopoisk.dev"

        fun getInstance():Retrofit{
            if(!this::retrofit.isInitialized) {
                synchronized(RetrofitObject){
                    if (!this::retrofit.isInitialized){
                        val gson = GsonBuilder()
                            .setLenient()
                            .create()
                        retrofit = Retrofit
                            .Builder()
                            .baseUrl(baseURL)
                            .addConverterFactory(GsonConverterFactory.create(gson))
                            .build()
                    }
                }
                return retrofit
            }
            else {
                synchronized(RetrofitObject){
                    return retrofit
                }
            }
    }
}