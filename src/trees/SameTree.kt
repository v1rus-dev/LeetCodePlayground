package trees

import helpers.TreeNode
import helpers.toTree

private fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
    var isSameTree = true

    fun doubleTraverse(firstNode: TreeNode?, secondNode: TreeNode?): Boolean {
        if (firstNode == null && secondNode == null) return true

        val theSameNode = firstNode?.`val` == secondNode?.`val`

        val theSameLeft = doubleTraverse(firstNode?.left, secondNode?.left)
        val theSameRight = doubleTraverse(firstNode?.right, secondNode?.right)
        isSameTree = isSameTree && theSameNode && theSameLeft && theSameRight

        return theSameNode
    }

    doubleTraverse(p, q)

    return isSameTree
}

fun main(args: Array<String>) {
    val result1 = isSameTree(listOf(1,2,3).toTree(), listOf(1,2,3).toTree()) // true
    val result2 = isSameTree(listOf(1,2).toTree(), listOf(1,null, 2).toTree()) // false
    val result3 = isSameTree(listOf(1,2,1).toTree(), listOf(1,1,2).toTree()) // false
    val result4 = isSameTree(null, listOf(2).toTree()) // false

    println(result1)
    println(result2)
    println(result3)
    println(result4)
}