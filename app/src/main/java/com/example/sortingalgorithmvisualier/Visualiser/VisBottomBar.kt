package com.example.sortingalgorithmvisualier.Visualiser

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun VisBottomBar(
    modifier: Modifier = Modifier,
    playPauseClick:()->Unit,
    slowDownClick:()->Unit,
    speedUpClick:()->Unit,
    previousClick:()->Unit,
    nextClick:()->Unit,
    isPlaying:Boolean = false
){
    BottomAppBar(
        modifier = modifier,
        containerColor = Color.Transparent
    ){
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            IconButton(onClick = slowDownClick)
            {
                Icon(
                    imageVector = Icons.Default.KeyboardArrowLeft,
                    contentDescription = "Slow Down",
                    tint = Color.Black
                )
            }
            IconButton(onClick = playPauseClick)
            {
                Icon(
                    imageVector = if(!isPlaying) Icons.Default.PlayArrow else Icons.Default.Close,
                    contentDescription = "Play/Pause",
                    tint = Color.Black
                )
            }
            IconButton(onClick = speedUpClick)
            {
                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = "Speed Up",
                    tint = Color.Black
                )
            }
            IconButton(onClick = previousClick)
            {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Previous step",
                    tint = Color.Black
                )
            }
            IconButton(onClick = nextClick)
            {
                Icon(
                    imageVector = Icons.Default.ArrowForward,
                    contentDescription = "Next Step",
                    tint = Color.Black
                )
            }
        }
    }
}