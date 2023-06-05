package com.example.movieappcomposecourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.movieappcomposecourse.ui.navigation.MovieNavigation
import com.example.movieappcomposecourse.ui.presentation.Myapp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Myapp {
                MovieNavigation()
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyAppPreview() {
    Myapp {
        MovieNavigation()
    }
}