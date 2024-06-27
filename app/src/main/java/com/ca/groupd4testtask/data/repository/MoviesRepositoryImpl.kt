package com.ca.groupd4testtask.data.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.ca.groupd4testtask.data.model.toMovie
import com.ca.groupd4testtask.data.network.ApiClient
import com.ca.groupd4testtask.data.paging.TopRatedMoviesPagingSource
import com.ca.groupd4testtask.domain.model.Movie
import com.ca.groupd4testtask.domain.repository.MoviesRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class MoviesRepositoryImpl @Inject constructor(
    private val apiClient: ApiClient
) : MoviesRepository {
    override fun topRatedMovies(): Flow<PagingData<Movie>> {
        return Pager(
            config = PagingConfig(25),
            pagingSourceFactory = { TopRatedMoviesPagingSource(apiClient) }
        ).flow
    }
}