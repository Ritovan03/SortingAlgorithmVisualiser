package com.example.sortingalgorithmvisualier.Visualiser

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun VisualiserSection(
    modifier: Modifier = Modifier,
    arr:IntArray
){
    BoxWithConstraints(
        modifier = modifier
            .padding(top = 14.dp)
    ) {
        val maxHeight = maxHeight-75.dp
        val itemWidth = remember {
            maxWidth/arr.size - 4.dp
        }


        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(start = 8.dp, end = 8.dp,top = 120.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Bottom
        ) {
            arr.forEach {
                Box(
                    modifier = Modifier
                        .height(if(it.dp>maxHeight) maxHeight else it.dp)
                        .width(itemWidth)
                        .background(Color.Cyan)
                )
            }
        }
    }
}