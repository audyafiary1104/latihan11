package com.example.latihan11.service

import retrofit2.Call
import com.example.latihan11.model.Movie
import com.example.latihan11.model.MovieResponse
import retrofit2.Callback
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {
    @GET("movie/latest")
    fun getMovieLatest(@Query("api_key") apiKey : String) : Call<Movie>
    @GET("movie/popular")
    fun getPopularMovie(@Query("api_key") apiKey: String) : Call<MovieResponse>
}