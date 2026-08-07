package two_pointers

import helpers.toPrintedString

private fun twoSum(numbers: IntArray, target: Int): IntArray {
    var l = 0
    var r = numbers.size - 1

    while (l < r) {
        while (numbers[l] + numbers[r] > target) r--
        while (numbers[l] + numbers[r] < target) l++

        if (numbers[l] + numbers[r] == target) {
            return intArrayOf(l + 1, r + 1)
        }
    }

    return intArrayOf()
}

fun main(args: Array<String>) {
    val result1 = twoSum(intArrayOf(2, 7, 11, 15), 9) // [1,2]
    val result2 = twoSum(intArrayOf(2, 3, 4), 6) // [1, 3]
    val result3 = twoSum(intArrayOf(-1, 0), -1) // [1, 2]
    println(result1.toPrintedString())
    println(result2.toPrintedString())
    println(result3.toPrintedString())
}