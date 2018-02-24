class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        Arrays.sort(nums);
        int l = 0;
        int r = 0;
        for ( int i = 0 ; i < nums.length - 2 ; i ++){
            if ( i == 0 || nums[i] != nums[i - 1] ){
                l = i + 1;
                r = nums.length - 1;
                while ( l < r ){
                    int sum = nums[i] + nums[l] + nums[r];
                    if ( sum == 0 ){
                        res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                        l ++;
                        r --;
                        while ( l < r && nums[l-1] == nums[l] ) l ++;
                        while ( l < r && nums[r+1] == nums[r] ) r --;
                    }
                    else if ( sum < 0 ) l ++;
                    else                r --;
                }
            }
        }
        return res;
    }
}
