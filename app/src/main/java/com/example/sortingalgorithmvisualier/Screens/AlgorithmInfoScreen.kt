package com.example.sortingalgorithmvisualier.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.sortingalgorithmvisualier.AlgorithmViewModel
import com.example.sortingalgorithmvisualier.Visualiser.Visualiser

@Composable
fun AlgorithmInfoScreen(navHostController: NavHostController, viewModel: AlgorithmViewModel,algorithmName: String) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Text(algorithmName)
        Spacer(modifier = Modifier.height(16.dp))
        // Add algorithm information here
        Text("This is information about $algorithmName.")
        Spacer(modifier = Modifier.height(16.dp))
        Visualiser(viewModel)
    }
}