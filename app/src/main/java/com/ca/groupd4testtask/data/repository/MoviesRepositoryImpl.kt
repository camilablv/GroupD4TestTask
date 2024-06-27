package com.ca.groupd4testtask.data.repository

import com.ca.groupd4testtask.data.network.ApiClient
import com.ca.groupd4testtask.domain.model.Movie
import com.ca.groupd4testtask.domain.repository.MoviesRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class MoviesRepositoryImpl @Inject constructor(
    private val apiClient: ApiClient
) : MoviesRepository {
    override fun topRatedMovies(): Flow<List<Movie>> {
        TODO("Not yet implemented")
    }
}