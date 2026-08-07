package stack

private fun isValid(s: String): Boolean {
    val mutableListOf = mutableListOf<Char>()
    val mapOfParentheses = mapOf('(' to ')', '[' to ']', '{' to '}')

    s.forEach { item ->
        if (mapOfParentheses.containsKey(item)) {
            mutableListOf.add(item)
        } else if (mutableListOf.isNotEmpty() && mapOfParentheses[mutableListOf.last()] == item) {
            mutableListOf.removeLast()
        } else {
            return false
        }
    }

    return mutableListOf.isEmpty()
}

fun main(args: Array<String>) {
    val result1 = isValid("()") // true
    val result2 = isValid("()[]{}") // true
    val result3 = isValid("(]") // false
    val result4 = isValid("([])") // true
    val result5 = isValid("([)]") // false
    val result6 = isValid("]") // false

    println(result1)
    println(result2)
    println(result3)
    println(result4)
    println(result5)
    println(result6)
}