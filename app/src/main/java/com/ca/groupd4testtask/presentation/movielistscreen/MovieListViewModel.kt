package com.ca.groupd4testtask.presentation.movielistscreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ca.groupd4testtask.domain.repository.MoviesRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MovieListViewModel @Inject constructor(
    private val repository: MoviesRepository
) : ViewModel() {

    private val _viewState = MutableStateFlow(MovieListScreenState())
    val viewState: StateFlow<MovieListScreenState> = _viewState

    fun getMovies() {
        viewModelScope.launch {
            val movies = repository.topRatedMovies()
            _viewState.value = _viewState.value.copy(movies = movies)
        }
    }
}