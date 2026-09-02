package linked_list

import helpers.ListNode
import helpers.print
import helpers.toListNode

private fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    var result = head
    var current: ListNode? = result
    var cashedNode: ListNode? = result
    var countInCash = 1

    while (current != null) {

    }

    return result
}

fun main(args: Array<String>) {
    val result1 = removeNthFromEnd(intArrayOf(1,2,3,4,5).toListNode(), 2) // [1,2,3,5]
    val result2 = removeNthFromEnd(ListNode(1), 1) // []
    val result3 = removeNthFromEnd(intArrayOf(1,2).toListNode(), 1) // [1]

    result1?.print()
    result2?.print()
    result3?.print()
}