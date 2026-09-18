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
    public void postOrder(ArrayList<Integer> arr , TreeNode root){
        if(root == null){
            return  ;
        }
        postOrder(arr , root.left) ;
        postOrder(arr , root.right) ;
        arr.add(root.val) ;
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<Integer>() ;
        postOrder(arr , root) ;
        return arr ;
        
    }
}