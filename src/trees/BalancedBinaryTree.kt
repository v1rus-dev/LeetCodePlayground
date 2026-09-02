package trees

import helpers.TreeNode
import helpers.toTree
import kotlin.math.max
import kotlin.math.min

private fun isBalanced(root: TreeNode?): Boolean {
    var balance = true

    fun traverse(node: TreeNode?): Int {
        if (node == null || !balance) return 0

        val heightLeft = traverse(node.left)
        val heightRight = traverse(node.right)

        balance = (max(heightLeft, heightRight) - min(heightLeft, heightRight) <= 1 ) && balance
        return 1 + max(heightLeft, heightRight)
    }

    traverse(root)

    return balance
}

fun main(args: Array<String>) {
    val result1 = isBalanced(listOf(3,9,20,null,null,15,7).toTree()) // true
    val result2 = isBalanced(listOf(1,2,2,3,3,null,null,4,4).toTree()) // false
    val result3 = isBalanced(null) // true
    val result4 = isBalanced(listOf(1,2,2,3,null,null,3,4,null,null,4).toTree()) // false

    println(result1)
    println(result2)
    println(result3)
    println(result4)
}