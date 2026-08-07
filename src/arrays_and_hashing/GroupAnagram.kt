package arrays_and_hashing

private fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val map = hashMapOf<String, ArrayList<String>>()

    strs.forEach {
        val converted = it.toCharArray().sortedArray().contentToString()

        if (map.containsKey(converted)) {
            map[converted]?.add(it)
        } else {
            map[converted] = arrayListOf(it)
        }
    }

    return map.values.toList()
}

fun main(args: Array<String>) {
    val result = groupAnagrams(arrayOf("eat","tea","tan","ate","nat","bat"))

    println(result)
}