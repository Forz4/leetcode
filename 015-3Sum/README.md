Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note: The solution set must not contain duplicate triplets.

```
For example, given array S = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
```

思路
这个问题其实简化为一个对于给定的数组，查找两个数的和为某一个值即可，这个问题有一个简单的办法就是先对数组排序，然后从两头往中间搜索，
如果结果偏小，则将头向后移，如果结果偏大，则将尾向前移动，这样可以保证在O（N）时间内从给定的已排序数组中找到和为某个值的两个数。
