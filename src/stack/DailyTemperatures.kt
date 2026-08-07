package stack

import helpers.toPrintedString

private fun dailyTemperatures(temperatures: IntArray): IntArray {
    val result = IntArray(temperatures.size)
    val stack = ArrayDeque<Int>()

    for (i in temperatures.indices) {
        while (stack.isNotEmpty() && temperatures[i] > temperatures[stack.last()]) {
            val j = stack.removeLast()
            result[j] = i - j
        }
        stack.addLast(i)
    }

    return result
}

fun main(args: Array<String>) {
    val result1 = dailyTemperatures(intArrayOf(73,74,75,71,69,72,76,73)) // 1,1,4,2,1,1,0,0
    val result2 = dailyTemperatures(intArrayOf(30,40,50,60)) // 1,1,1,0
    val result3 = dailyTemperatures(intArrayOf(30,90,60)) // 1,1,0

    println(result1.toPrintedString())
    println(result2.toPrintedString())
    println(result3.toPrintedString())
}