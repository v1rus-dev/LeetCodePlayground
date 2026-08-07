package arrays_and_hashing

import helpers.toPrintedString

private fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = HashMap<Int, Int>()
    for (i in nums.indices) {
        val complement = target - nums[i]
        val j = map[complement]
        if (j != null) return intArrayOf(j, i)
        map[nums[i]] = i
    }
    return intArrayOf()
}

fun main(args: Array<String>) {
    val result1 = twoSum(nums = intArrayOf(2, 7, 11, 15), target = 9)

    println("Result1: ${result1.toPrintedString()}")
}