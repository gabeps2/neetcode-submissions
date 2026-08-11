class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map: HashMap<String, MutableList<String>> = hashMapOf()

        strs.forEach { str ->
            val sortedStr = str.toCharArray().sorted().joinToString()
            map[sortedStr]?.let { 
                it.add(str)
            } ?: map.put(sortedStr, mutableListOf(str))
        }

        val resultList: MutableList<List<String>> = mutableListOf()

        return map.values.toList()
    }
}
