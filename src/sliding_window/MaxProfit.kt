package sliding_window

private fun maxProfit(prices: IntArray): Int {
    var minPrice = Int.MAX_VALUE
    var maxProfit = Int.MIN_VALUE

    for (i in prices.indices) {
        if (prices[i] < minPrice) {
            minPrice = prices[i]
        } else if (prices[i] - minPrice > maxProfit) {
            maxProfit = prices[i] - minPrice
        }

        if (i == prices.lastIndex && maxProfit > Int.MIN_VALUE) {
            return maxProfit
        }
    }

    return 0
}

/**
 * Example 1:
 *
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 *
 * Example 2:
 *
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transactions are done and the max profit = 0.
 *
 */

fun main(args: Array<String>) {
    val result1 = maxProfit(intArrayOf(7,1,5,3,6,4))
    val result2 = maxProfit(intArrayOf(7,6,4,3,1))
    val result3 = maxProfit(intArrayOf(2,4,1))

    println(result1)
    println(result2)
    println(result3)
}