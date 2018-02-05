Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
```
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
```

思路1:
暴力遍历
时间复杂度O(n^2)

思路2:
哈希表
以kv键值对的方式存储原数组，查找时间复杂度减少为O(1)
