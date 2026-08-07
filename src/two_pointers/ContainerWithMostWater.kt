package two_pointers

private fun maxArea(height: IntArray): Int {
    var l = 0
    var r = height.size - 1

    var result = 0

    while (l < r) {
        val x = r - l
        val minHeight = if (height[l] < height[r]) height[l] else height[r]

        val res = x * minHeight

        if (res > result) {
            result = res
        }

        if (height[l] < height[r]) {
            l++
        } else if (height[l] >= height[r]) {
            r--
        }
    }

    return result
}

fun main(args: Array<String>) {
    val result1 = maxArea(intArrayOf(1,8,6,2,5,4,8,3,7)) // 49
    val result2 = maxArea(intArrayOf(1, 1)) // 1
    println(result1)
    println(result2)
}