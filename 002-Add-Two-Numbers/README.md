You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example
```
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
```

思路：
没什么思路，遍历两个链表就好了，主要要考虑输入链表长度不同和进位的问题就好了，java的实现用了DummyHead，是一个不错的方法，省事儿，C的实现相对直白。
