package arrays_and_hashing

private fun isValidSudoku(board: Array<CharArray>): Boolean {
    val rowSet = hashSetOf<Int>()
    val colSet = hashSetOf<HashSet<Int>>()
    val boxSet = hashSetOf<Int>()

    for (i in 0 until 81) {
        val row = ((i / 9) % 81) + 1
        val col = ((i % 9) % 81) + 1

        val element = board[row][col]

        if (!element.isDigit()) continue

        if (!rowSet.add(element.digitToInt())) return false

//        if (!colSet.add())
    }

    return false
}

fun main() {
    val board1 = arrayOf(
        charArrayOf('5', '3', '.', '.', '7', '.', '.', '.', '.'),
        charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
        charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
        charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
        charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
        charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
        charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
        charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
        charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
    )

    val board2 = arrayOf(
        charArrayOf('8', '3', '.', '.', '7', '.', '.', '.', '.'),
        charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
        charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
        charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
        charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
        charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
        charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
        charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
        charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
    )

    println(isValidSudoku(board1)) // ожидается true
    println(isValidSudoku(board2)) // ожидается false
}