package edu.festu.ivankuznetsov.filmviewersample.network

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Интерфейс - описание API
 * */
interface FilmAPI {
    @GET("movie/")
    fun getMovie(@Query("token") token:String, @Query("search") search: String, @Query("field") field: String): Call<Film>
}