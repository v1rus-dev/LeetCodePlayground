package helpers

fun IntArray.print() {
    this.forEach {
        print(it)
    }
}

fun IntArray.toPrintedString(): String {
    val sb = StringBuilder()
    this.forEachIndexed { index, i ->
        sb.append(i)
        if (index != this.lastIndex) {
            sb.append(", ")
        }
    }
    return sb.toString()
}

fun IntArray.toListNode(): ListNode? {
    if (isEmpty()) return null
    val head = ListNode(this[0])
    var tail = head
    for (i in 1..lastIndex) {
        val node = ListNode(this[i])
        tail.next = node
        tail = node
    }
    return head
}

fun ListNode.print() {
    var current: ListNode? = this
    while (current?.next != null) {
        print(current.`val`)
        current = current.next
    }
    print(current?.`val`)
    println()
}

fun List<Int?>.toTree(): TreeNode? {
    if (isEmpty() || first() == null) return null

    val root = TreeNode(first()!!)
    val queue = ArrayDeque<TreeNode>()

    queue.add(root)

    var index = 1

    while (index < size) {
        val parent = queue.removeFirst()

        // left
        if (index < size) {
            this[index]?.let {
                parent.left = TreeNode(it)
                queue.add(parent.left!!)
            }
            index++
        }

        // right
        if (index < size) {
            this[index]?.let {
                parent.right = TreeNode(it)
                queue.add(parent.right!!)
            }
            index++
        }
    }

    return root
}

fun TreeNode?.toList(): List<Int?> {
    if (this == null) return emptyList()

    val result = mutableListOf<Int?>()
    val queue = ArrayDeque<TreeNode?>()

    queue.add(this)

    while (queue.isNotEmpty()) {
        val node = queue.removeFirst()

        result.add(node?.`val`)

        if (node != null) {
            queue.add(node.left)
            queue.add(node.right)
        }
    }

    // Убираем лишние null в конце
    while (result.lastOrNull() == null) {
        result.removeLast()
    }

    return result
}