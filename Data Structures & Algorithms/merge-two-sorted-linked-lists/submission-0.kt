/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
       var l1: ListNode? = list1
       var l2: ListNode? = list2
        
       var dummy = ListNode(0)
       var pointer: ListNode? = dummy

        println("l1: ${l1?.`val`} - l2: ${l2?.`val`}")
        while(l1 != null && l2 != null) {
            if(l1.`val` < l2.`val`) {
                pointer?.next = l1
                l1 = l1?.next
            } else {
                pointer?.next = l2
                l2 = l2?.next
            }
            pointer = pointer?.next
        }

        if (l1 != null) {
            pointer?.next = l1
        } else {
            pointer?.next = l2
        }

        return dummy?.next
    }
}
