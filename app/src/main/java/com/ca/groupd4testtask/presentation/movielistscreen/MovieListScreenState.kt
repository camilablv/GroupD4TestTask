package com.ca.groupd4testtask.presentation.movielistscreen

import com.ca.groupd4testtask.domain.model.Movie

data class MovieListScreenState(
    val movies: List<Movie> = listOf()
)
