package com.ca.groupd4testtask.presentation.movielistscreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.ca.groupd4testtask.domain.model.Movie
import com.ca.groupd4testtask.presentation.conponents.MovieCard

@Composable
fun MovieListScreen(
    viewModel: MovieListViewModel = hiltViewModel(),
    navigateToDetailsScreen: (Movie) -> Unit
) {

    val viewState = viewModel.viewState.collectAsStateWithLifecycle()
    val movies = viewState.value.movies

    LaunchedEffect(key1 = true) {
        viewModel.getMovies()
    }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize(),
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(movies.size) { index ->
            MovieCard(
                movie = movies[index],
                onClick = { navigateToDetailsScreen(movies[index]) }
            )
        }
    }
}