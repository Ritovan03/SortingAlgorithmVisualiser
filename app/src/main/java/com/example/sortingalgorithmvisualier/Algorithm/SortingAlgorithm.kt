package com.example.sortingalgorithmvisualier.Algorithm

interface SortingAlgorithm {
    suspend fun sort(array: IntArray, onSwap: (IntArray) -> Unit)
}

class BubbleSort :SortingAlgorithm
{

    override suspend fun sort(
        arr: IntArray,
        onSwap: (IntArray) -> Unit
    ) {

        val n = arr.size
        for (i in 0 until n - 1) {
            for (j in 0 until n - i - 1) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    val temp = arr[j]
                    arr[j] = arr[j + 1]
                    arr[j + 1] = temp
                    onSwap(arr)
                }
            }
        }
    }
}

class MergeSort : SortingAlgorithm {

    override suspend fun sort(
        arr: IntArray,
        onSwap: (IntArray) -> Unit
    ) {
        val aux = arr.clone()
        mergeSort(arr, aux, 0, arr.size - 1, onSwap)
    }

    private suspend fun mergeSort(
        arr: IntArray,
        aux: IntArray,
        low: Int,
        high: Int,
        onSwap: (IntArray) -> Unit
    ) {
        if (low >= high) return
        val mid = low + (high - low) / 2
        mergeSort(arr, aux, low, mid, onSwap)
        mergeSort(arr, aux, mid + 1, high, onSwap)
        merge(arr, aux, low, mid, high, onSwap)
    }

    private suspend fun merge(
        arr: IntArray,
        aux: IntArray,
        low: Int,
        mid: Int,
        high: Int,
        onSwap: (IntArray) -> Unit
    ) {
        // Copy to auxiliary array
        for (k in low..high) {
            aux[k] = arr[k]
        }

        var i = low
        var j = mid + 1

        for (k in low..high) {
            when {
                i > mid -> {
                    arr[k] = aux[j++]
                }
                j > high -> {
                    arr[k] = aux[i++]
                }
                aux[j] < aux[i] -> {
                    arr[k] = aux[j++]
                }
                else -> {
                    arr[k] = aux[i++]
                }
            }
            // Update the array state
            onSwap(arr.clone())
        }
    }
}