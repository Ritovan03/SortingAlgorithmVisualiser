package com.example.sortingalgorithmvisualier

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.sortingalgorithmvisualier.Algorithm.BubbleSort
import com.example.sortingalgorithmvisualier.Algorithm.MergeSort
import com.example.sortingalgorithmvisualier.Screens.AlgorithmInfoScreen
import com.example.sortingalgorithmvisualier.Screens.HomeScreen

@Composable
fun AppNavHost(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(navController)
        }
        composable("bubbleSort") {
            val viewModel: AlgorithmViewModel = viewModel(
                factory = AlgorithmViewModelProvider(BubbleSort())
            )
            AlgorithmInfoScreen(navController, viewModel, "Bubble Sort")
        }
        composable("insertionSort") {
            val viewModel: AlgorithmViewModel = viewModel(
                factory = AlgorithmViewModelProvider(MergeSort())
            )
            AlgorithmInfoScreen(navController, viewModel, "Merge Sort")
        }
        // Add more routes for other algorithms as needed
    }
}
