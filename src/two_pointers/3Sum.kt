package two_pointers

private fun threeSum(nums: IntArray): List<List<Int>> {
    return emptyList()
}

fun main(args: Array<String>) {
    val result1 = threeSum(intArrayOf(-1,0,1,2,-1,-4)) // [[-1,-1,2],[-1,0,1]]
    val result2 = threeSum(intArrayOf(0, 1, 1)) // []
    val result3 = threeSum(intArrayOf(0, 0, 0)) // [[0,0,0]]
}