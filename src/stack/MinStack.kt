package stack

class MinStack {

    val deque = ArrayDeque<Int>()

    fun push(value: Int) {
        deque.addLast(value)
    }

    fun pop() {
        deque.removeFirst()
    }

    fun top(): Int = deque.last()

    fun getMin(): Int = deque.first()

}

fun main(args: Array<String>) {

    val minStack = MinStack()
    minStack.push(-2);
    minStack.push(0);
    minStack.push(-3);
    println(minStack.deque)
    val res1 = minStack.getMin() // return -3
    minStack.pop()
    val res2 = minStack.top()    // return 0
    val res3 = minStack.getMin() // return -2

    println(res1)
    println(res2)
    println(res3)

}