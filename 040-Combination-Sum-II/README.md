Given a collection of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

Each number in C may only be used once in the combination.

Note:
All numbers (including target) will be positive integers.
The solution set must not contain duplicate combinations.
For example, given candidate set [10, 1, 2, 7, 6, 1, 5] and target 8, 
```
A solution set is: 
[
  [1, 7],
  [1, 2, 5],
  [2, 6],
  [1, 1, 6]
]
```

思路
DFS递归搜索所有的情况，两个点要注意：
1. 要处理重复情况的花，首先要排序，那么重复的元素就集合在了一起，假如nums为［1，1，1，2］，
   那么当处理第一个1的时候，DFS会将1个1，2个1，3个1的情况全部都遍历到，后面再碰到1，就不需要往下搜索了
   跳过的条件是：如果当前元素与前一个元素值相等，且前一个元素目前不在结果序列，则跳过此节点，
2. 对于搜索到某个位置，remain<0的时候，可以直接进行剪枝操作，因为数组排过序，当前元素如果导致总和超出target，
   那么后面循环遍历的值只会更大，target一定超过目标总和，此时恶意剪枝。
