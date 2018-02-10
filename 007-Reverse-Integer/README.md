Given a 32-bit signed integer, reverse digits of an integer.
```
Example 1:
Input: 123
Output:  321

Example 2:
Input: -123
Output: -321

Example 3:
Input: 120
Output: 21
```
Note:
Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range. 
For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

思路
这一题有三个点要注意
1. 正负数其实处理方式一致
2. 把input的低位到高位进行解析的过程实际上就是倒置之后的从高位到低位，正好可以获取所需的reverse之后的数字
3. 溢出的判断，在具有溢出可能的计算之后进行反算，如果不能复原那么一定是由于溢出导致，直接返回0
