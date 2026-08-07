package binary_search

private fun searchInsert(nums: IntArray, target: Int): Int {
    var l = -1
    var r = nums.size
    while (r - l > 1) {
        val mid = l + (r - l) / 2
        if (nums[mid] < target) l = mid else r = mid
    }
    return r
}

/**
 * Example 1:
 *
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 *
 * Example 2:
 *
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 *
 * Example 3:
 *
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 *
 */

fun main(args: Array<String>) {
    val result1 = searchInsert(intArrayOf(1,3,5,6), 5) // 2
    val result2 = searchInsert(intArrayOf(1,3,5,6), 2) // 1
    val result3 = searchInsert(intArrayOf(1,3,5,6), 7) // 4
    val result4 = searchInsert(intArrayOf(1,3,5,6), 0) // 0

    println(result1)
    println(result2)
    println(result3)
    println(result4)
}