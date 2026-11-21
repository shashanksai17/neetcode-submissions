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
    public int find(TreeNode root){
        if(root==null)return 0;
        int left=1+find(root.left);
        int right=1+find(root.right);
        return Math.max(left,right);
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null)return true;
        if(Math.abs(find(root.left)-find(root.right))>1)return false;

        return isBalanced(root.left) && isBalanced(root.right);
    }
}
