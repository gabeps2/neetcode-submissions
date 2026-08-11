class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        val unique = nums.toSet().sorted()

        for(i in 0 until unique.size) {
            nums[i] = unique[i]
        }

        return unique.size
    }
}
