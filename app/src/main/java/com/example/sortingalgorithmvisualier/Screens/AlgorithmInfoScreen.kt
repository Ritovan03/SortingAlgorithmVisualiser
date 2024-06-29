package com.example.sortingalgorithmvisualier.Screens

import androidx.compose.foundation.background
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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.sortingalgorithmvisualier.AlgorithmViewModel
import com.example.sortingalgorithmvisualier.R
import com.example.sortingalgorithmvisualier.Visualiser.Visualiser

@Composable
fun AlgorithmInfoScreen(navHostController: NavHostController, viewModel: AlgorithmViewModel,algorithmName: String) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 18.dp, start = 12.dp,bottom = 18.dp, end = 12.dp)
            .verticalScroll(rememberScrollState())

    ) {
        Visualiser(viewModel)
        Spacer(modifier = Modifier.height(16.dp))
        Text(algorithmName,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center)
        Spacer(modifier = Modifier.height(12.dp))
        // Add algorithm information here
        Text(
            text = when (algorithmName) {
                "Bubble Sort" -> {
                    """
                Bubble Sort is a simple sorting algorithm.
                It repeatedly steps through the list,
                compares adjacent elements and swaps them
                if they are in the wrong order.
                The pass through the list is repeated
                until the list is sorted.
                It has a time complexity of O(n²).
                """.trimIndent()
                }
                "Insertion Sort" -> {
                    """
                Insertion Sort builds the final sorted array
                one item at a time. It is much less
                efficient on large lists than more
                advanced algorithms such as quicksort,
                heapsort, or merge sort. It works
                well for small arrays or partially
                sorted arrays.
                """.trimIndent()
                }
                "Merge Sort" -> {
                    """
                Merge Sort is an efficient, stable,
                comparison-based, divide and conquer sorting
                algorithm. Most implementations produce a
                stable sort, meaning that the order of
                equal elements is the same in the input
                and output. It has a time complexity of
                O(n log n).
                """.trimIndent()
                }
                "Quick Sort" -> {
                    """
                Quick Sort is an efficient sorting algorithm,
                serving as a systematic method for placing
                the elements of an array in order.
                Developed by Tony Hoare in 1959,
                it is still a commonly used algorithm.
                It has an average time complexity of
                O(n log n).
                """.trimIndent()
                }
                "Selection Sort" -> {
                    """
                Selection Sort is a simple sorting algorithm.
                The algorithm divides the input list into
                two parts: the sublist of items already
                sorted, which is built up from left to right
                at the front (left) of the list,
                and the sublist of items remaining to be sorted that occupy the rest of the list.
                """.trimIndent()
                }
                else -> {
                    "This is information about $algorithmName."
                }
            },
            fontSize = 20.sp,
            textAlign = TextAlign.Start
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text("Code:",
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Start,
            fontSize = 20.sp)
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            when (algorithmName) {
                "Bubble Sort" -> {
                    "This is information about $algorithmName."
                }
                "Insertion Sort" -> {
                    "This is information about $algorithmName."
                }
                "Merge Sort" -> {
                    "This is information about $algorithmName."
                }
                "Quick Sort" -> {
                    "This is information about $algorithmName."
                }
                else -> {
                    "This is information about $algorithmName."
                }
            }

        )
    }
}