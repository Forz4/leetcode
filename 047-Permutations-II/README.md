Given a collection of numbers that might contain duplicates, return all possible unique permutations.
```
For example,
[1,1,2] have the following unique permutations:
[
  [1,1,2],
  [1,2,1],
  [2,1,1]
]
```

思路
DFS的思路，由于有重复元素，Permutation中判断的条件，需要增加一个used数组来记录原数组中的元素是否已经被使用
