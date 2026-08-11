class Solution {

    val numHistory = HashMap<Int, Unit>()

    fun hasDuplicate(nums: IntArray): Boolean {
        var containsDuplicate = false
        nums.forEach {
            numHistory[it]?.let {
                containsDuplicate = true
                return@forEach
            } ?: numHistory.put(it, Unit)
        }
        return containsDuplicate
    }
}
