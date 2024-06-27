package com.ca.groupd4testtask.presentation.moviedetailsscreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.ca.groupd4testtask.domain.model.Movie

@Composable
fun MovieDetailsScreen(
    movie: Movie
) {

    LazyColumn(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        item {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp),
                contentAlignment = Alignment.BottomEnd
            ) {
                AsyncImage(
                    model = movie.poster,
                    contentDescription = null
                )

                Text(text = movie.voteAverage.toString())
            }
        }

        item {
            Text(text = movie.title)
        }

        item {
            Text(text = movie.overview)
        }
    }
}