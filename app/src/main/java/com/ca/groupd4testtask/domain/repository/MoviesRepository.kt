package com.ca.groupd4testtask.domain.repository

import com.ca.groupd4testtask.domain.model.Movie
import kotlinx.coroutines.flow.Flow

interface MoviesRepository {

    fun topRatedMovies(): Flow<List<Movie>>
}