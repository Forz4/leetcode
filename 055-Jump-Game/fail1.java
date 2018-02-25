class Solution {
    public boolean canJump(int[] nums) {
        if ( nums.length == 1 ) return true;
        int[] res = new int[nums.length];
        res[nums.length-1] = 1;
        for (int i = nums.length - 2 ; i >= 0 ; i -- ){
            for ( int j = 1 ; j <= nums[i] && i+j < nums.length ; j ++ ){
                if ( res[i+j] == 1 ){
                    res[i] = 1;
                }
            }
        }
        if ( res[0] == 1 )  return true;
        else                return false;
    }
}
