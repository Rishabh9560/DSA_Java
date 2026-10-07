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
    public int level(TreeNode root , int[] maxDia) {
        if(root == null){
            return 0 ;
        }
       int left = level(root.left , maxDia);
       int right = level(root.right , maxDia);
       int dia = left+right ;
       maxDia[0] = Math.max(dia , maxDia[0]) ;
       return 1 + Math.max(left , right);
        
        
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int[] maxDia = {0} ;
        level(root , maxDia);
        return maxDia[0];
        
    }
}