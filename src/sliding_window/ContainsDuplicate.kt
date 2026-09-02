package sliding_window

private fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
    val last = hashMapOf<Int, Int>()
    for (i in nums.indices) {
        val prev = last[nums[i]]
        if (prev != null && i - prev <= k) return true
        last[nums[i]] = i
    }

    return false
}

/**
 * Example 1:
 *
 * Input: nums = [1,2,3,1], k = 3
 * Output: true
 *
 * Example 2:
 *
 * Input: nums = [1,0,1,1], k = 1
 * Output: true
 *
 * Example 3:
 *
 * Input: nums = [1,2,3,1,2,3], k = 2
 * Output: false
 *
 */

fun main(args: Array<String>) {
    val result1 = containsNearbyDuplicate(intArrayOf(1, 2, 3, 1), 3)
    val result2 = containsNearbyDuplicate(intArrayOf(1, 0, 1, 1), 1)
    val result3 = containsNearbyDuplicate(intArrayOf(1, 2, 3, 1, 2, 3), 2)
    val result4 = containsNearbyDuplicate(intArrayOf(99, 99), 2)

    println(result1)
    println(result2)
    println(result3)
    println(result4)
}