package linked_list

import helpers.ListNode
import helpers.print
import helpers.toListNode

private fun reorderList(head: ListNode?): Unit {

}

fun main(args: Array<String>) {
    val node1 = intArrayOf(1, 2, 3, 4).toListNode()
    val node2 = intArrayOf(1, 2, 3, 4, 5).toListNode()
    reorderList(node1)
    reorderList(node2)

    node1?.print()
    node2?.print()
}