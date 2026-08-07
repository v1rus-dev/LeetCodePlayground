package stack

private fun calPoints(operations: Array<String>): Int {
    val mutableListOf = mutableListOf<Int>()

    for (operation in operations) {
        if (operation.toIntOrNull() != null) {
            mutableListOf.add(operation.toInt())
        } else if (operation == "+") {
            if (mutableListOf.size >= 2) {
                mutableListOf.add(mutableListOf.last() + mutableListOf[mutableListOf.lastIndex-1])
            } else {
                mutableListOf.add(mutableListOf.last() * 2)
            }
        } else if (operation == "D") {
            mutableListOf.add(mutableListOf.last() * 2)
        } else if (operation == "C") {
            mutableListOf.removeLast()
        }
    }

    return mutableListOf.sum()
}

fun main(args: Array<String>) {
    val result1 = calPoints(arrayOf("5","2","C","D","+")) // 30
    val result2 = calPoints(arrayOf("5","-2","4","C","D","9","+","+")) // 27
    val result3 = calPoints(arrayOf("1","C")) // 0

    println(result1)
    println(result2)
    println(result3)
}