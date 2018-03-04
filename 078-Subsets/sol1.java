class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        /*
         *  外层对集合个数进行循环
         */
        for ( int i = 0 ; i <= nums.length ; i ++){
            backtrack(list, new ArrayList<>(), nums , i , -1);   
        }
        return list;
    }
    /*
     *  退出标志为集合里元素个数为len
     *  cur记录进入本次寻找时已经找到的位置，为了不重复，要求从cur之后开始查找
     */
    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums , int len , int cur){
        if(tempList.size() == len){
            list.add(new ArrayList<>(tempList));
        } else{
            for(int i = 0; i < nums.length; i++){ 
                if(tempList.contains(nums[i]) || i <= cur) continue;
                tempList.add(nums[i]);
                backtrack(list, tempList, nums , len , i);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
