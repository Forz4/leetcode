/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode lessHead = new ListNode(0);
        ListNode p1 = lessHead;
        ListNode moreHead = new ListNode(0);
        ListNode p2 = moreHead;
        while (head != null){
            if ( head.val < x ){
                p1.next = new ListNode(head.val);
                p1 = p1.next;
            }else{
                p2.next = new ListNode(head.val);
                p2 = p2.next;
            }
            head = head.next;
        }
        p1.next = moreHead.next;
        return lessHead.next;
    }
}
