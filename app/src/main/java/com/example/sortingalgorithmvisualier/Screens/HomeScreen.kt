package com.example.sortingalgorithmvisualier.Screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Sorting Algorithms")
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate("bubbleSort") }) {
            Text("Bubble Sort")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = { navController.navigate("insertionSort") }) {
            Text("Insertion Sort")
        }
        // Add more buttons for other algorithms as needed
    }
}
