package stack

private fun evalRPN(tokens: Array<String>): Int {
    val stack = IntArray(tokens.size / 2 + 1)
    var sp = 0
    for (token in tokens) {
        if (token.length == 1 && token[0] in "+-*/") {
            val b = stack[--sp]
            val a = stack[--sp]
            stack[sp++] = when (token[0]) {
                '+' -> a + b
                '-' -> a - b
                '*' -> a * b
                else -> a / b
            }
        } else {
            stack[sp++] = token.toInt()
        }
    }
    return stack[0]
}

fun main(args: Array<String>) {
    val result1 = evalRPN(tokens = arrayOf("2", "1", "+", "3", "*")) // 9
    val result2 = evalRPN(tokens = arrayOf("4", "13", "5", "/", "+")) // 6
    val result3 = evalRPN(tokens = arrayOf("10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+")) // 22

    println(result1)
    println(result2)
    println(result3)
}