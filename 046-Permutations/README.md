Given a collection of distinct numbers, return all possible permutations.
```
For example,
[1,2,3] have the following permutations:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]
```

思路
DFS，每次从头搜索，去除已经在结果集中的元素
