package org.imeego

fun main() {
    println("hello world")

    val arr = intArrayOf(1, 3, 2, 5, 4)
    quickSort(arr, 0, arr.size - 1)
    arr.forEach { println(it) }
}

// 快速排序
fun quickSort(arr: IntArray, left: Int, right: Int) {
    if (left >= right) {
        return
    }
    var i = left
    var j = right
    val key = arr[left]
    while (i < j) {
        while (i < j && arr[j] >= key) {
            j--
        }
        arr[i] = arr[j]
        while (i < j && arr[i] <= key) {
            i++
        }
        arr[j] = arr[i]
    }
    arr[i] = key
    quickSort(arr, left, i - 1)
    quickSort(arr, i + 1, right)
}