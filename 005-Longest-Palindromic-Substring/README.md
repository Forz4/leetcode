Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

```
Example:

Input: "babad"

Output: "bab"

Note: "aba" is also a valid answer.
 

Example:

Input: "cbbd"

Output: "bb"
```

思路

1. 暴力搜索需要O(n^3)的时间复杂度，不符合要求
2. 从中间往两边扩展的方式，一共有2n－1个位置可以成为对称点，往两边扩展的同时可以找到最大的回文子串，复杂度在O((2n-1)*(n/2))
3. 动态规划的方式，p(i,j) = p(i+1,j-1) && Si == Sj
