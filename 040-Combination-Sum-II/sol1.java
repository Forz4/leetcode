class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums); //先排序
        backtrack(list, new ArrayList<>(), nums, target, 0);
        return list;
    }

    private int backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int remain, int start){
        if(remain < 0)          return -1;    //如果当前搜索超出了总和则返回－1
        else if(remain == 0){
            list.add(new ArrayList<>(tempList));
            return 0;
        }
        else{ 
            for(int i = start; i < nums.length; i++){
                if ( i > start && nums[i] == nums[i-1]      //跳过重复情况
                    continue;
                tempList.add(nums[i]);
                int res = backtrack(list, tempList, nums, remain - nums[i], i+1);
                tempList.remove(tempList.size() - 1);
                if ( res < 0 )
                    break;    //如果当前的nums[i]已经超出了总和，则循环后面的nums[i]一定也超过总和，直接跳出
            }
            return 1;
        }
    }
}
