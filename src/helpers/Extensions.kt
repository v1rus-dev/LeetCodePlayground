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