class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var pointer = 0

        for(i in 0 until nums.size) {
            if(nums[i] != `val`) {
                nums[pointer] = nums[i]
                pointer++
            } 
        }

        return pointer
    }
}
