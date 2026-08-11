class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        
        nums.forEachIndexed { indexFirst, first ->
            nums.forEachIndexed { indexSecond, second ->
                if(first + second == target && indexFirst != indexSecond) {
                    return intArrayOf(indexFirst, indexSecond)
                }
            }
        }

        return intArrayOf()
    }
}
