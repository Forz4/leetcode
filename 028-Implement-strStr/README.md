Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

```
Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1
```

思路

对应java的indexOf方法
C预言实现注意长度为零的情况，复杂度为O(n^2)
