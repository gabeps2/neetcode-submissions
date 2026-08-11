class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        val unique = mutableMapOf<Int, Unit>()
        var pointer = 0

        for(i in 0 until nums.size) {
            if(unique[nums[i]] == null) {
                unique[nums[i]] = Unit
                nums[pointer] = nums[i]
                pointer++
            }
        }

        return pointer
    }
}
