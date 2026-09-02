package linked_list

import helpers.ListNode
import helpers.print
import helpers.toListNode

private fun reverseList(head: ListNode?): ListNode? {
    if (head == null) {
        return null
    }
    val listOfNodes = arrayListOf<ListNode>()
    var current: ListNode? = head
    while (current != null) {
        listOfNodes.add(current)
        current = current.next
    }

    val head = ListNode(listOfNodes.last().`val`)
    var tail = head

    for (i in listOfNodes.size - 2 downTo 0) {
        val node = ListNode(listOfNodes[i].`val`)
        tail.next = node
        tail = node
    }

    return head
}

private fun reverseList2(head: ListNode?): ListNode? {
    var prev: ListNode? = null
    var current = head
    while (current != null) {
        val next = current.next
        current.next = prev
        prev = current
        current = next
    }
    return prev
}

fun main(args: Array<String>) {
    val result1 = reverseList2(intArrayOf(1, 2, 3, 4, 5).toListNode())
//    val result2 = reverseList(intArrayOf(1, 2).toLinkedListNode())

    result1?.print()
//    println()
//    result2?.print()
}