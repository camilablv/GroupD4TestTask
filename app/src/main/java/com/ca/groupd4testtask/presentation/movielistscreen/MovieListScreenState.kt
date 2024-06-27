package com.ca.groupd4testtask.presentation.movielistscreen

import androidx.paging.PagingData
import com.ca.groupd4testtask.domain.model.Movie
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

data class MovieListScreenState(
    val movies: Flow<PagingData<Movie>> = flowOf()
)
