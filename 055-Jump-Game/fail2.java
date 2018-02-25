class Solution {
    public boolean canJump(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = 1;
        for ( int i = 0 ; i < nums.length ; i ++ ){
            if ( res[i] != 1 )                  continue;
            if ( i + nums[i] >= nums.length-1)  return true;
            for ( int j = nums[i] ; j >= 1 ; j --)
                res[i+j] = 1;
        }
        if ( res[nums.length-1] == 1 )  return true;
        else                            return false;
    }

}
