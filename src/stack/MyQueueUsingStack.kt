package stack

class MyQueue() {
    private val arrayDeque = ArrayDeque<Int>()

    fun push(x: Int) = arrayDeque.addLast(x)

    fun pop(): Int {
        val temp = peek()
        arrayDeque.removeLast()
        return temp
    }

    fun peek(): Int = arrayDeque.last()

    fun empty(): Boolean = arrayDeque.isEmpty()

}

fun main(args: Array<String>) {

}