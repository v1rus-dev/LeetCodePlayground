package sliding_window

private fun lengthOfLongestSubstring(s: String): Int {
    var maxLength = 0

    val setOfItems = mutableSetOf<Char>()

    for (i in s) {
        if (setOfItems.add(i)) {
            maxLength++
        } else {
            if (setOfItems.size > maxLength) {
                maxLength = setOfItems.size
                setOfItems.clear()
            }
        }
    }

    return maxLength
}

fun main(args: Array<String>) {
    val result1 = lengthOfLongestSubstring("abcabcbb") // 3
    val result2 = lengthOfLongestSubstring("bbbbb") // 1
    val result3 = lengthOfLongestSubstring("pwwkew") // 3

    println(result1)
    println(result2)
    println(result3)
}