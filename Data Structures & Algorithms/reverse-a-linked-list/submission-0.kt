/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        var previous: ListNode? = null
        var next = head

        while(next != null) {
            var tmp = next?.next
            next?.next = previous

            previous = next
            next = tmp
        }

        return previous
    }
}
