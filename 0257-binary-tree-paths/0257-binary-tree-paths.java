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
    public void helper(TreeNode root , String str , ArrayList<String> ans ){
        if(root == null){
            return  ;
        }
        if(root.left == null && root.right == null){
            str += root.val ; 
            ans.add(str) ;
            return ;
        }
        helper(root.left , str+root.val+"->",ans) ;
        helper(root.right , str+root.val+"->",ans) ;

    }
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> ans = new ArrayList<>() ;      
        helper(root , "" ,ans) ;
        return ans ;  
    }
}