package binary_search

private fun search(nums: IntArray, target: Int): Int {
    var l = 0
    var r = nums.size - 1

    while (l + 1 != r) {
        val mid = l + (r - l) / 2
        if (nums[mid] <= target) {
            l = mid
        } else {
            r = mid
        }
    }

    return if (nums[l] == target) l else -1
}

fun main(args: Array<String>) {
    val result1 = search(intArrayOf(-1,0,3,5,9,12), target = 9) //4
    val result2 = search(intArrayOf(-1,0,3,5,9,12), target = 2) //-1

    println(result1)
    println(result2)
}