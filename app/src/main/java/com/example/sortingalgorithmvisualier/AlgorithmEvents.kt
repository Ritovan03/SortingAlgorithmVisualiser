package com.example.sortingalgorithmvisualier

sealed class AlgorithmEvents {
    object SlowDown : AlgorithmEvents()
    object SpeedUp : AlgorithmEvents()
    object PlayPause : AlgorithmEvents()
    object Previous : AlgorithmEvents()
    object Next : AlgorithmEvents()
}