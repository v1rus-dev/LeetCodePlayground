package stack

import java.util.*

class MyStack {
    private var list: Queue<Int> = LinkedList()
    private var aux: Queue<Int> = LinkedList()

    fun push(x: Int) {
        aux.add(x)
        while (list.isNotEmpty()) {
            aux.add(list.poll())
        }
        val tmp = list
        list = aux
        aux = tmp
    }

    fun pop(): Int = list.poll()

    fun top(): Int = list.peek()

    fun empty(): Boolean {
        return list.isEmpty()
    }
}

fun main(args: Array<String>) {
    val myStack = MyStack()
    myStack.push(1)
    myStack.push(2)
    println(myStack.top())
    println(myStack.pop())
    println(myStack.empty())
}