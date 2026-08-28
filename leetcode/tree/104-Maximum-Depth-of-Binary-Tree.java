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
    public int maxDepth(TreeNode root) {
        int max = maxLength(root);
        return max;
    }
    public static int maxLength(TreeNode root){
        if(root == null) return 0;
        int left = maxLength(root.left);
        int right = maxLength(root.right);

        return  Math.max(left, right) + 1;
    }
}