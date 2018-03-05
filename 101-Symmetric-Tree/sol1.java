/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {      
        if (root == null)       return true;
        return isSame(root.left , root.right);
    }
    private boolean isSame(TreeNode p1 , TreeNode p2){
        if ( p1 == null && p2 == null )     return true;
        if ( p1 != null && p2 == null )     return false;
        if ( p1 == null && p2 != null )     return false;
        if ( p1.val != p2.val )             return false;
        
        return isSame(p1.left,p2.right) && isSame(p1.right,p2.left);
    }
}
