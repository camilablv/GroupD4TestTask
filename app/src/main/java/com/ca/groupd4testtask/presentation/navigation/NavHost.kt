package com.ca.groupd4testtask.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.ca.groupd4testtask.domain.model.Movie
import kotlinx.serialization.Serializable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import com.ca.groupd4testtask.domain.model.MovieNavType
import com.ca.groupd4testtask.presentation.moviedetailsscreen.MovieDetailsScreen
import com.ca.groupd4testtask.presentation.movielistscreen.MovieListScreen
import kotlin.reflect.typeOf

internal sealed class Screen {
    @Serializable data object MovieList : Screen()
    @Serializable data class MovieDetails(val movie: Movie) : Screen()
}

@Composable
fun AppNavHost(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = Screen.MovieList
    ) {
        composable<Screen.MovieList> {
            MovieListScreen {
                navHostController.navigate(Screen.MovieDetails(it))
            }
        }

        composable<Screen.MovieDetails>(typeMap = mapOf(typeOf<Movie>() to MovieNavType)) { backStackEntry ->
            val route = backStackEntry.toRoute<Screen.MovieDetails>()
            MovieDetailsScreen(movie = route.movie)
        }
    }
}