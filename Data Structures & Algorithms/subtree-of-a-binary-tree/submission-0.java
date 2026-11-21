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
    public boolean find(TreeNode root,TreeNode a){
        if(root==null && a==null)return true;
        if(root==null || a==null)return false;
        if(root.val!=a.val)return false;
        return find(root.left,a.left) && find(root.right,a.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null) return false;
        if(find(root,subRoot))return true;
       

        return  isSubtree(root.left,subRoot) ||isSubtree(root.right,subRoot);
    }
}
