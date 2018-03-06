class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int margin = Integer.MAX_VALUE;
        int result = 0;
        for( int i = 0 ; i < nums.length - 2 ; i ++ ){
            int head = i + 1;
            int tail = nums.length - 1;
            while ( head < tail ){
                int sum = nums[i] + nums[head] + nums[tail];
                if ( Math.abs(sum-target) < margin ){
                    result = sum;
                    margin = Math.abs(sum-target);
                }
                if ( sum < target ){
                    head ++;
                } else if ( sum > target ){
                    tail --;
                } else {
                    return target;
                }
            }
        }
        return result;
    }
}
