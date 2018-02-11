Given a string, find the length of the longest substring without repeating characters.
```
Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
```
思路
滑动窗口的感觉，利用hashMap将查重的时间复杂度降到O(1)。
hashMap中的k为字符本身，v为当前字符的下标位置，这样使得出现重复字符时，窗口的前边缘可以直接定位到之前出现该字符的位置之后，使得剪枝最优
