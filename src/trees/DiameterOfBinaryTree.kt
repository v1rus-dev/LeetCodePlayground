package trees

import helpers.TreeNode
import helpers.toTree
import kotlin.math.max

private fun diameterOfBinaryTree(root: TreeNode?): Int {
    var diameter = 0

    fun traverse(node: TreeNode?): Int {
        if (node == null) return 0
        val heightLeft = traverse(node.left)
        val heightRight = traverse(node.right)

        diameter = max(diameter, heightLeft + heightRight)
        return 1 + max(heightRight, heightLeft)
    }

    traverse(root)

    return diameter
}

fun main(args: Array<String>) {
    val result1 = diameterOfBinaryTree(listOf(1,2,3,4,5).toTree())
    val result2 = diameterOfBinaryTree(listOf(1,2).toTree())

    println(result1)
    println(result2)
}