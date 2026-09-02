package linked_list

import helpers.ListNode
import helpers.print
import helpers.toListNode

private fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    val dummy = ListNode(0)
    var curr: ListNode? = dummy
    var head1 = list1
    var head2 = list2

    while (head1 != null || head2 != null) {
        if (head2 == null || (head1 != null && head1.`val` < head2.`val`)) {
            curr?.next = head1
            head1 = head1?.next
        } else {
            curr?.next = head2
            head2 = head2.next
        }
        curr = curr?.next

    }

    return dummy.next
}

fun main(args: Array<String>) {

    /**
     * Input: list1 = [1,2,4], list2 = [1,3,4]
     * Output: [1,1,2,3,4,4]
     */

    val result1 = mergeTwoLists(intArrayOf(1,2,4).toListNode(), intArrayOf(1,3,4).toListNode())
    val result2 = mergeTwoLists(intArrayOf().toListNode(), intArrayOf().toListNode())
    val result3 = mergeTwoLists(intArrayOf().toListNode(), intArrayOf(0).toListNode())

    result1?.print()
    println()
    result2?.print()
    println()
    result3?.print()
}