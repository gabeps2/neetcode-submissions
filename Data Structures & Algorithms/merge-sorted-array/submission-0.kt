class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        var pointer = 0
        for(i in m until m+n) {
            nums1[i] = nums2[pointer]
            pointer++
        }

        nums1.sort()
    }
}
