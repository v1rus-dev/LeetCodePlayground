package stack

import helpers.toPrintedString

private fun asteroidCollision(asteroids: IntArray): IntArray {
    val stack = ArrayDeque<Int>()
    for (a in asteroids) {
        var alive = true
        while (alive && a < 0 && stack.isNotEmpty() && stack.last() > 0) {
            when {
                stack.last() < -a -> stack.removeLast()
                stack.last() == -a -> { stack.removeLast(); alive = false }
                else -> alive = false
            }
        }
        if (alive) stack.addLast(a)
    }
    return stack.toIntArray()
}

fun main(args: Array<String>) {
    val result1 = asteroidCollision(intArrayOf(5, 10, -5)) // [5, 10]
    val result2 = asteroidCollision(intArrayOf(8, -8)) // []
    val result3 = asteroidCollision(intArrayOf(10, 2, -5)) // [10]
    val result4 = asteroidCollision(intArrayOf(3,5,-6,2,-1,4)) // [-6, 2, 4]

    println(result1.toPrintedString())
    println(result2.toPrintedString())
    println(result3.toPrintedString())
    println(result4.toPrintedString())
}