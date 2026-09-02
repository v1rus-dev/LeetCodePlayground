package trees

import helpers.TreeNode
import helpers.toTree

private fun maxDepth(root: TreeNode?): Int {
    var depth = 0
    var currentDepth = 0

    fun traverse(node: TreeNode?) {
        if (node == null) return
        currentDepth ++

        if (currentDepth > depth) {
            depth = currentDepth
        }
        traverse(node.left)
        traverse(node.right)
        currentDepth--
    }

    traverse(root)

    return depth
}

fun main(args: Array<String>) {
    val result1 = maxDepth(listOf(3,9,20,null,null,15,7).toTree()) // 3
    val result2 = maxDepth(listOf(1,null,2).toTree()) // 2
    val result3 = maxDepth(listOf(0).toTree()) // 1

    println(result1)
    println(result2)
    println(result3)
}