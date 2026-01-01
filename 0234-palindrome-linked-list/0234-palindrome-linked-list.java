/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode after = head;
        ListNode current = head;
        while(current != null){
            after = after.next;
            current.next = prev;
            prev = current;
            current = after;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newHead = reverse(slow.next);
        slow = head;
        fast = newHead;
        while(slow != null && fast != null){
            if(slow.val != fast.val){
                reverse(newHead);
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }
}