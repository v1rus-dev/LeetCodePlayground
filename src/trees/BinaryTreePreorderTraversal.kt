package trees

import helpers.TreeNode
import helpers.toTree

private fun preorderTraversal(root: TreeNode?): List<Int> {
    val result = mutableListOf<Int>()

    fun traverse(node: TreeNode?) {
        if (node == null) return

        result.add(node.`val`)
        traverse(node.left)
        traverse(node.right)
    }

    traverse(root)

    return result
}

fun main(args: Array<String>) {
    val result1 = preorderTraversal(listOf<Int?>(1,null,2,3).toTree())
    val result2 = preorderTraversal(listOf<Int?>(1,2,3,4,5,null,8,null,null,6,7,9).toTree())

    println(result1)
    println(result2)
}