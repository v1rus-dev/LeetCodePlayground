package two_pointers

import kotlin.math.max

private fun mergeAlternately(word1: String, word2: String): String {
    var p1 = 0
    var p2 = 0

    val maxLength = max(word1.length, word2.length)

    var result = ""

    while (p1 < maxLength || p2 < maxLength) {
        word1.getOrNull(p1)?.let {
            result += it
        }
        word2.getOrNull(p2)?.let {
            result += it
        }
        p1++
        p2++
    }

    return result
}

fun main(args: Array<String>) {
    val result1 = mergeAlternately("abc", "pqr") // apbqcr
    val result2 = mergeAlternately("ab", "pqrs") // apbqrs
    val result3 = mergeAlternately("abcd", "pq") // apbqcd

    println(result1)
    println(result2)
    println(result3)
}