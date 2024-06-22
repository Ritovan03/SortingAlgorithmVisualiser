package com.example.sortingalgorithmvisualier.Visualiser

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.sortingalgorithmvisualier.AlgorithmEvents
import com.example.sortingalgorithmvisualier.AlgorithmViewModel

@Composable
fun Visualiser(viewModel: AlgorithmViewModel){
    Column {
        VisualiserSection(arr =
        viewModel.arr.value,
            modifier = Modifier.fillMaxWidth()
        )

        val isPlaying=viewModel.isPlaying.value
        val isFinished = viewModel.onSortingFinished.value

        VisBottomBar(
            playPauseClick = { viewModel.onEvent(AlgorithmEvents.PlayPause) },
            slowDownClick = { viewModel.onEvent(AlgorithmEvents.SlowDown) },
            speedUpClick = { viewModel.onEvent(AlgorithmEvents.SpeedUp) },
            previousClick = { viewModel.onEvent(AlgorithmEvents.Previous) },
            nextClick = { viewModel.onEvent(AlgorithmEvents.Next)},
            modifier = Modifier.fillMaxWidth()
                .height(75.dp),
            isPlaying = if(isFinished)!isPlaying else isPlaying
        )
    }
}