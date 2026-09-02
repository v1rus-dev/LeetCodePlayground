package trees

import helpers.TreeNode
import helpers.toTree

private fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
    if (root == null) return null
    if (root.`val` == p?.`val` || root.`val` == q?.`val`) return root

    val leftNode = lowestCommonAncestor(root.left, p, q)
    val rightNode = lowestCommonAncestor(root.right, p, q)

    if (leftNode != null && rightNode != null) {
        return root
    }

    return leftNode ?: rightNode
}

fun main(args: Array<String>) {
    val result1 =
        lowestCommonAncestor(listOf(6, 2, 8, 0, 4, 7, 9, null, null, 3, 5).toTree(), TreeNode(2), TreeNode(8)) // 6
    val result2 =
        lowestCommonAncestor(listOf(6, 2, 8, 0, 4, 7, 9, null, null, 3, 5).toTree(), TreeNode(2), TreeNode(4)) // 2

    println(result1?.`val`)
    println(result2?.`val`)
}