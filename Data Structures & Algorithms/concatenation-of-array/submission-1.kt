class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        val ans = IntArray(nums.size * 2)
        var idx = 0
        for(i in 0 until 2) {
            for(j in 0 until nums.size) {
                ans[idx] = nums[j]
                idx++
            }
        }
        return ans
    }
}
