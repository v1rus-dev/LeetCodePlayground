package trees

import helpers.TreeNode
import helpers.toTree

private fun isSubtree(root: TreeNode?, subRoot: TreeNode?): Boolean {
    fun isIdentical(a: TreeNode?, b: TreeNode?): Boolean {
        if (a == null && b == null) return true
        if (a == null || b == null) return false
        return a.`val` == b.`val` &&
                isIdentical(a.left, b.left) &&
                isIdentical(a.right, b.right)
    }

    fun traverse(node: TreeNode?): Boolean {
        if (node == null) return false

        if (isIdentical(node, subRoot)) return true
        return traverse(node.left) || traverse(node.right)
    }

    return traverse(root)
}

fun main(args: Array<String>) {
    val result1 = isSubtree(listOf(3, 4, 5, 1, 2).toTree(), listOf(4, 1, 2).toTree()) // true
    val result2 =
        isSubtree(listOf(3, 4, 5, 1, 2, null, null, null, null, 0).toTree(), listOf(4, 1, 2).toTree()) // false

    println(result1)
    println(result2)
}