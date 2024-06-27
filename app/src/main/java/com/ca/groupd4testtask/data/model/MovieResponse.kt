package com.ca.groupd4testtask.data.model

import com.ca.groupd4testtask.domain.model.Movie
import com.google.gson.annotations.SerializedName

data class MovieResponse(
    @SerializedName("id") val id: Int,
    @SerializedName("title") val title: String,
    @SerializedName("poster_path") val poster: String,
    @SerializedName("overview") val overview: String,
    @SerializedName("vote_average") val voteAverage: Float
)

fun MovieResponse.toMovie() = Movie(
    id, title, poster, overview, voteAverage
)
