/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void invert(TreeNode root) {
        if(root == null){
            return ;

        }
        TreeNode temp = root.left ;
        root.left = root.right ;
        root.right = temp ;
        invert(root.left) ;
        invert(root.right) ;

        
    }
    public boolean isSame(TreeNode leftNode , TreeNode rightNode){
        if(leftNode == null && rightNode ==  null) return true  ;
        if(leftNode == null || rightNode ==  null) return false ;

        if(leftNode.val != rightNode.val) return false  ; 
        if(isSame(leftNode.left , rightNode.left) == false) return false  ;
        if(isSame(leftNode.right, rightNode.right) == false) return false  ;
        return true ; 



    }
    public boolean isSymmetric(TreeNode root) {
        invert(root.left) ;
        return isSame(root.left , root.right) ;
        
    }
}