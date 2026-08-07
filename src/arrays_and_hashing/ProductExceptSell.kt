package arrays_and_hashing

import helpers.toPrintedString

private fun productExceptSelf(nums: IntArray): IntArray {
    val n = nums.size
    val result = IntArray(n)

    result[0] = 1

    for (i in 1 until n) {
        result[i] = result[i - 1] * nums[i - 1]
    }

    var right = 1
    for (i in n - 1 downTo 0) {
        result[i] = result[i] * right
        right *= nums[i]
    }

    return result
}

fun main(args: Array<String>) {
    val result1 = productExceptSelf(intArrayOf(1,2,3,4))
    val result2 = productExceptSelf(intArrayOf(-1,1,0,-3,3))

    println(result1.toPrintedString())
    println(result2.toPrintedString())
}