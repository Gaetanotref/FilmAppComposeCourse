package com.example.movieappcomposecourse.ui.screens.home

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.movieappcomposecourse.ui.navigation.MovieScreens
import com.example.movieappcomposecourse.ui.presentation.MovieRow

@Composable
fun MainContent(
    modifier: Modifier = Modifier,
    movieList: List<String> = listOf(
        "Avatar",
        "Shutter Island",
        "Film 3",
        "film 4",
        "film 5",
        "film 6",
        "film 7",
        "film 8"
    ),
    navController: NavController
) {
    LazyColumn(modifier = Modifier.padding(12.dp)) {
        items(items = movieList) {
            MovieRow(movie = it){movie ->
                navController.navigate(route = MovieScreens.DetailsScreen.name+"/$movie")
            }
        }
    }
}
