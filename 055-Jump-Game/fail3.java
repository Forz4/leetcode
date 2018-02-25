class Solution {
    public boolean canJump(int[] nums) {
        int[] res = new int[nums.length];
        if (search(0,nums,res) == 1)    return true;
        else                            return false;
    }
    
    /*
     *  map用来存放当前节点是否能到达终点，用于剪枝
     *  遇到0则返回0
     *  index>=nums.length-1时返回1
     *  遍历了所有的情况均返回0则返回0
     */
    public int search(int index , int[] nums , int[] res){
        if ( index >= nums.length-1 )       return 1;
        if ( nums[index] == 0 )             return 0;
        if ( res[index] == 1 )              return 0;
        for ( int i = nums[index] ; i >= 1 ; i -- ){
            if ( search(index+i , nums , res) == 1 )   return 1;
        }
        res[index] = 1;
        return 0;
    }
}
