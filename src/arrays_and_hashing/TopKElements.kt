package arrays_and_hashing

import helpers.toPrintedString
import java.util.PriorityQueue

private fun topKFrequent(nums: IntArray, k: Int): IntArray {
    val map = hashMapOf<Int, Int>()

    nums.forEach {
        map[it] = map.getOrDefault(it, 0) + 1
    }

    val priorityQueue = PriorityQueue<Pair<Int, Int>>(compareByDescending { it.second })

    priorityQueue.addAll(map.map { Pair(it.key, it.value) }.toList())

    return IntArray(k).apply {
        for (i in 0..<k) {
            this[i] = priorityQueue.poll().first
        }
    }
}

fun main(args: Array<String>) {
//    val result1 = topKFrequent(intArrayOf(1,1,1,2,2,3), 2)
//    val result2 = topKFrequent(intArrayOf(1), 1)
//    val result3 = topKFrequent(intArrayOf(1,2,1,2,1,2,3,1,3,2), 2)
    val result4 = topKFrequent(intArrayOf(4,1,-1,2,-1,2,3), 2)

//    println(result1.toPrintedString())
//    println(result2.toPrintedString())
//    println(result3.toPrintedString())
    println(result4.toPrintedString())
}