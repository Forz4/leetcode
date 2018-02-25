Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.

```
For example:
A = [2,3,1,1,4], return true.

A = [3,2,1,0,4], return false.
```

思路1:  从第一个节点出发，深度递归遍历它能到的节点，将确定无法到达的节点进行标注从而剪枝（优先搜索最远的节点可有一定的优化），时间复杂度O(N^2),栈溢出

思路2:  从最后一个节点逆向查找合法的节点,时间复杂度O(N^2)超时

思路3:  从右向左遍历，记录最左的合法节点位置，一个节点是否合法只需要判断 i + nums[i] >= leftmost 时间复杂度O(N),空间复杂度O(1)
