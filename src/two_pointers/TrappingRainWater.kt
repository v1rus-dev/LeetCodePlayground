package two_pointers

private fun trap(height: IntArray): Int {
    var s = 0
    var f = 1

    var lastHighestHeight = 0
    var result = 0

    while (f < height.size) {
        while (height[f] < height[s]) {
            result += height[f] - 1
            f++
        }

        if (height[f] >= height[s]) {
            println("S = f ($s = $f)")
            s = f
            if (f+1 != height.size - 1) {
                f++
            }
        }
    }

    return result
}

fun main(args: Array<String>) {
    val result1 = trap(intArrayOf(0,1,0,2,1,0,1,3,2,1,2,1)) // 6
//    val result2 = trap(intArrayOf(4,2,0,3,2,5)) // 9

    println(result1)
//    println(result2)
}