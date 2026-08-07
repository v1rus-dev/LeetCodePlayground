package two_pointers

private fun isPalindrome(s: String): Boolean {
    var l = 0
    var r = s.length - 1

    while (l < r) {
        while (l < r && !s[l].isLetterOrDigit()) l++
        while (l < r && !s[r].isLetterOrDigit()) r--
        if (s[l].lowercaseChar() != s[r].lowercaseChar()) return false
        l++
        r--
    }

    return true
}

private fun isPalindrome1(s: String): Boolean {
    val setOfChars = (('a'..'z').plus(('0'..'9'))).toSet()
    val str = s.trim().lowercase()
    val str1 = arrayListOf<Char>()
    val str2 = arrayListOf<Char>()

    var l = 0
    var r = str.length - 1
    for (i in str.indices) {
        if (setOfChars.contains(str[l])) str1.add(str[l])
        if (setOfChars.contains(str[r])) str2.add(str[r])
        l++
        r--
    }

    return str1 == str2
}

fun main(args: Array<String>) {
    val result1 = isPalindrome("A man, a plan, a canal: Panama")
    val result2 = isPalindrome("race a car")
    val result3 = isPalindrome(" ")
    val result4 = isPalindrome("0P")
    val result5 = isPalindrome("ab2a")

    println(result1)
    println(result2)
    println(result3)
    println(result4)
    println(result5)
}