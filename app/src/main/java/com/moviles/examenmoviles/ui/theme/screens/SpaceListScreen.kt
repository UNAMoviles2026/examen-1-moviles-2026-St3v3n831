package com.moviles.examenmoviles.ui.theme.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.moviles.examenmoviles.components.SpaceCard
import com.moviles.examenmoviles.data.CoworkingSpace


val mockSpaces = listOf(
    CoworkingSpace(
        1,
        "The Innovation Hub",
        "Quiet space with fast fiber and coffee.",
        "Downtown St.",
        15,
        12.0,
        true
    ),
    CoworkingSpace(2, "Creative Loft", "Artsy environment for designers.", "Arts District", 8, 15.5, true),
    CoworkingSpace(3, "Corporate Suite", "Professional meeting rooms and desks.", "Financial Plaza", 40, 25.0, false)
)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SpaceListScreen(
    onSpaceClick: (Int) -> Unit
) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(title = { Text("Coworking Spaces") })
        },
        bottomBar = { AppBottomBar() }
    ) { padding ->
        LazyColumn(
            modifier = Modifier.padding(padding),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(mockSpaces) { space ->
                SpaceCard(space = space, onClick = { onSpaceClick(space.id) })
            }
        }
    }
}

@Composable
fun AppBottomBar() {
    NavigationBar {
        NavigationBarItem(
            selected = true,
            onClick = {  },
            icon = { Icon(Icons.Default.Home, contentDescription = null) },
            label = { Text("Inicio") }
        )
    }
}

