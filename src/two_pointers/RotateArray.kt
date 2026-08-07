package two_pointers

import helpers.toPrintedString

private fun rotate(nums: IntArray, k: Int): Unit {
    var l = 0
    var r = nums.size - 1

    val array = IntArray(nums.size)

    while (l <= r) {

        array[(l+k) % nums.size] = nums[l]
        array[(r+k) % nums.size] = nums[r]

        l++
        r--
    }

    for (i in nums.indices) {
        nums[i] = array[i]
    }
}

fun main(args: Array<String>) {
    var array1 = intArrayOf(1,2,3,4,5,6,7) // 5,6,7,1,2,3,4

    /**
     * start                        [1,2,3,4,5,6,7]
     *
     *
     *
     * rotate 1 steps to the right: [7,1,2,3,4,5,6]
     * rotate 2 steps to the right: [6,7,1,2,3,4,5]
     * rotate 3 steps to the right: [5,6,7,1,2,3,4]
     */

    var array2 = intArrayOf(-1,-100,3,99)
    rotate(array1, 3)
    rotate(array2, 2)

    println(array1.toPrintedString())
    println(array2.toPrintedString())
}