package com.gsixacademy.android.mymoviesapplication.api

import com.gsixacademy.android.mymoviesapplication.models.MovieListResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

const val apiKey="8d70445e27f18deb185c6a61f9e290d6"
interface MovieDatabaseApi {
    @GET("movie/{category}?" + apiKey)
    fun getMovies(@Path("category") category: String?,@Query("page")page:Int ):Call<MovieListResponse>
}