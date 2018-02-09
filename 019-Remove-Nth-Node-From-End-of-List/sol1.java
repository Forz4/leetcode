/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode p1 = dummyHead;
        ListNode p2 = dummyHead;
        int i = 0;
        while(i++ < n){
            p1 = p1.next;;
        }
        while(p1.next!=null){
            p2 = p2.next;
            p1 = p1.next;
        }
        p2.next = p2.next.next;
        return dummyHead.next;
    }
}
