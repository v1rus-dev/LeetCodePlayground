package trees

import helpers.TreeNode
import helpers.toList
import helpers.toTree

private fun invertTree(root: TreeNode?): TreeNode? {
    val result = root

    fun invert(node: TreeNode?) {
        if (node == null) return

        invert(node.left)
        invert(node.right)
        val temp = node.left
        node.left = node.right
        node.right = temp
    }

    invert(result)

    return result
}

fun main(args: Array<String>) {
    val result1 = invertTree(listOf<Int?>(4,2,7,1,3,6,9).toTree())
    val result2 = invertTree(listOf<Int?>(2,1,3).toTree())

    println(result1.toList())
    println(result2.toList())
}