package two_pointers

import helpers.toPrintedString

private fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    var p1 = 0
    var p2 = 0

    while (p1 < m + n) {
        if (nums1[p1] <= nums2[p2]) {
            p1++
        } else {

        }
    }
}

fun main(args: Array<String>) {
    var array1 = intArrayOf(1,2,3,0,0,0)
    var array2 = intArrayOf(1)
    var array3 = intArrayOf(0)
    val result1 = merge(array1, 3, intArrayOf(2,5,6), 3) // 1,2,2,3,5,6
    val result2 = merge(array2, 1, intArrayOf(), 0) // 1
    val result3 = merge(array3, 0, intArrayOf(1), 1) // 1
    println(array1.toPrintedString())
    println(array2.toPrintedString())
    println(array3.toPrintedString())
}