class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        /*
         *  外层对集合个数进行循环
         */
        for ( int i = 0 ; i <= nums.length ; i ++){
            backtrack(list, new ArrayList<>(), nums , i , -1 , new int[nums.length]);   
        }
        return list;
    }
    /*
     *  退出标志为集合里元素个数为len
     *  cur记录进入本次寻找时已经找到的位置，为了不重复，要求从cur之后开始查找
     */
    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums , int len , int cur , int[] map){
        if(tempList.size() == len){
            list.add(new ArrayList<>(tempList));
        } else{
            for(int i = cur + 1; i < nums.length; i++){ 
                /*
                 *  跳过条件是，本节点与前一个节点的值相同，且前一个节点不在集合中
                 *  前一个节点不在集合中，说明前一个节点加入到结果集的情况已经被搜索过了
                 *  那么本节点就不需要再搜索了
                 */
                if( i>0 && nums[i] == nums[i-1] && map[i-1]==0 ) continue;
                tempList.add(nums[i]);
                map[i] = 1;
                backtrack(list, tempList, nums , len , i , map);
                map[i] = 0;
                tempList.remove(tempList.size() - 1);
            }
        }
    }
    
}
