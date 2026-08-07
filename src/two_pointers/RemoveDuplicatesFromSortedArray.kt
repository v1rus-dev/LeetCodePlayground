package two_pointers

import helpers.toPrintedString

private fun removeDuplicates(nums: IntArray): Int {
    var s = 1
    var f = 1

    var count = 1

    if (nums.size <= 2) return count

    while (f < nums.size) {
        while (nums[f] <= nums[s-1]) f++

        nums[s] = nums[f]
        count++
        s++
        f++
    }

    return count
}

fun main(args: Array<String>) {
    var array1 = intArrayOf(1, 1, 2)
    var array2 = intArrayOf(0,0,1,1,1,2,2,3,3,4)
    var array3 = intArrayOf(1, 2)
//    val result1 = removeDuplicates(array1) // 2
//    val result2 = removeDuplicates(array2) // 5
    val result3 = removeDuplicates(array3) // 5

//    println("result1 = $result1, array = ${array1.toPrintedString()}")
//    println("result2 = $result2, array = ${array2.toPrintedString()}")
    println("result3 = $result3, array = ${array3.toPrintedString()}")
}