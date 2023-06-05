package com.example.movieappcomposecourse.ui.presentation

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.movieappcomposecourse.ui.navigation.MovieNavigation
import com.example.movieappcomposecourse.ui.theme.MovieAppComposeCourseTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Myapp(content: @Composable () -> Unit) {
    MovieAppComposeCourseTheme {
        content()
    }
}