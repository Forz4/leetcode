class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        for(int i=0;i<used.length;i++)
            used[i] = false;
        Arrays.sort(nums);
        DFS(list , nums , new ArrayList<>() , used);
        return list;
    }
    private void DFS(List<List<Integer>> list , int[] nums , List<Integer> res , boolean[] used){
        if ( res.size() == nums.length ){
            list.add(new ArrayList(res));
            return;
        }else{
            for( int i = 0 ; i < nums.length ; i ++){
                if ( used[i] )  continue;
                //前一个元素相同且不在结果集
                if ( i > 0 && nums[i] == nums[i-1] && !used[i-1]) continue;
                used[i] = true;
                res.add(nums[i]);
                DFS(list , nums , res , used);
                res.remove(res.size() - 1);
                used[i] = false;
            }
            return;
        }
    }
}
