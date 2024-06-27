package com.ca.groupd4testtask.data.model

import com.google.gson.annotations.SerializedName

data class TopRatedResponse(
    @SerializedName("page") val page: Int,
    @SerializedName("results") val movies: List<MovieResponse>,
    @SerializedName("total_pages") val totalPages: Int,
    @SerializedName("total_results") val totalResults: Int
)
