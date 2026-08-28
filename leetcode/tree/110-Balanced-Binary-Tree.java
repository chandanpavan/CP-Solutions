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
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int max = maxLength(root);
        if(max == -1) return false;
        else return true;
    }

    public static int maxLength(TreeNode root){
        if(root == null) return 0;
        int left = maxLength(root.left);
        int right = maxLength(root.right);
        if(left == -1 || right == -1) return -1;
        int length = Math.abs(left-right);
        if(length > 1) return -1;
        return 1+Math.max(left,right);
    }
}