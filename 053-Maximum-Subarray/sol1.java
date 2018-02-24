class Solution {
    public int maxSubArray(int[] nums) {
        int i = 0;
        int max = Integer.MIN_VALUE;
        int now = 0;
        for ( i = 0 ; i < nums.length ; i ++ ){
            now += nums[i];
            if ( now > max ){
                max = now;
            }
            if ( now < 0 ){
                now = 0 ;
                continue;
            }
        }
        return max;
    }
}
