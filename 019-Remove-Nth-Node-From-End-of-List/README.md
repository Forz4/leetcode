Given a linked list, remove the nth node from the end of list and return its head.
```
For example,

   Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.
```
Note:
Given n will always be valid.
Try to do this in one pass.

思路
，第一个指针先走n步，然后第二个指针再出发，当第一歺指针到底时，第二个指针则找到从后前的第n个节点
