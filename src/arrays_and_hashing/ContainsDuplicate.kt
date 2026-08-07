package arrays_and_hashing

private fun containsDuplicate(nums: IntArray): Boolean {
    val hasSet = hashSetOf<Int>()
    for (num in nums) {
        if (!hasSet.add(num)) return true
    }
    return false
}

fun main(args: Array<String>) {
    val result1 = containsDuplicate(intArrayOf(1,2,3,1))
    val result2 = containsDuplicate(intArrayOf(1,2,3,4))
    val result3 = containsDuplicate(intArrayOf(1,1,1,3,3,4,3,2,4,2))

    println("Result1 = $result1")
    println("Result2 = $result2")
    println("Result3 = $result3")
}