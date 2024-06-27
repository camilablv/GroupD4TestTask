package com.ca.groupd4testtask.domain.repository

import androidx.paging.PagingData
import com.ca.groupd4testtask.domain.model.Movie
import kotlinx.coroutines.flow.Flow

interface MoviesRepository {

    fun topRatedMovies(): Flow<PagingData<Movie>>
}