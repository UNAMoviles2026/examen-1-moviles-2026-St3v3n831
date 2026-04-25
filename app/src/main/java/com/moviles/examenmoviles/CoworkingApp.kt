package com.moviles.examenmoviles

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.moviles.examenmoviles.navigation.AppNavHost

@Composable
fun CoworkingApp() {
    MaterialTheme {
        AppNavHost()
    }
}