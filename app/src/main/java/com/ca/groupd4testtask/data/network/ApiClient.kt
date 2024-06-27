package com.ca.groupd4testtask.data.network

import com.ca.groupd4testtask.data.model.TopRatedResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiClient {

    @GET("movie/top_rated")
    suspend fun topRated(@Query("page") page: Int, @Query("api_key") apiKey: String): TopRatedResponse
}