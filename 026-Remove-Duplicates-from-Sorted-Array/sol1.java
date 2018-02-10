class Solution {
    public int removeDuplicates(int[] nums) {
        if ( nums.length == 0 )  return 0;
        for ( int i = 0 , int j = i + 1 ; j < nums.length ; j ++ )
            if ( nums[j] != nums[i] )
                nums[++i] = nums[j];
        return i+1;
    }
}
