package com.ca.groupd4testtask.data.repository

import com.ca.groupd4testtask.data.model.toMovie
import com.ca.groupd4testtask.data.network.ApiClient
import com.ca.groupd4testtask.domain.model.Movie
import com.ca.groupd4testtask.domain.repository.MoviesRepository
import javax.inject.Inject

class MoviesRepositoryImpl @Inject constructor(
    private val apiClient: ApiClient
) : MoviesRepository {
    override suspend fun topRatedMovies(): List<Movie> {
        return  apiClient.topRated(1, "efa443b03883377e3764ccdee9af39b0").movies.map { it.toMovie() }
    }
}