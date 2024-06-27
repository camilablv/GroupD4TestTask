package com.ca.groupd4testtask.data.paging

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.ca.groupd4testtask.data.model.toMovie
import com.ca.groupd4testtask.data.network.ApiClient
import com.ca.groupd4testtask.domain.model.Movie
import javax.inject.Inject

class TopRatedMoviesPagingSource @Inject constructor(
    private val apiClient: ApiClient
) : PagingSource<Int, Movie>() {
    override fun getRefreshKey(state: PagingState<Int, Movie>): Int? {
        return state.pages.last().nextKey
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Movie> {
        val result = apiClient.topRated(params.key ?: 1, "efa443b03883377e3764ccdee9af39b0")
        return LoadResult.Page(
            data = result.movies.map { it.toMovie() },
            prevKey = if (result.page > 1) result.page - 1 else null,
            nextKey = result.page + 1
        )
    }
}