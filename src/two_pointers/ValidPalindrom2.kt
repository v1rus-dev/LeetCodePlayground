package two_pointers

private fun validPalindrome(s: String): Boolean {
    var l = 0
    var r = s.length - 1
    var countOfDeleting = 0

    while (l < r) {
        if (s[l] == s[r]) {
            l++
            r--
        } else {
            countOfDeleting++
            if (s[l + 1] == s[r] ) {
                l++
            } else if (s[r - 1] == s[l]) {
                r--
            } else {
                return false
            }
        }

        if (countOfDeleting > 1)
            return false

    }

    return true
}

fun main(args: Array<String>) {
    val result1 = validPalindrome("aba") // true
    val result2 = validPalindrome("abca") // true
    val result3 = validPalindrome("abc") // false
    val result4 = validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga") //

    println(result1)
    println(result2)
    println(result3)
    println(result4)
}