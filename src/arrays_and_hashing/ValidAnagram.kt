package arrays_and_hashing

private fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) return false

    val sortedS = s.toCharArray().sortedArray()
    val sortedT = t.toCharArray().sortedArray()

    sortedS.forEachIndexed { index, ch ->
        if (sortedT[index] != ch) return false
    }

    return true
}

fun main(args: Array<String>) {
    val isAnagram1: Boolean = isAnagram("anagram", "nagaram")
    println()
    val isAnagram2: Boolean = isAnagram("rat", "cat")

    println()
    println("Is anagram1: $isAnagram1")
    println("Is anagram2: $isAnagram2")
}