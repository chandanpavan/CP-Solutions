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
    int dia = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        int max = maxLength(root);
        return dia;
    }

    public int maxLength(TreeNode root){
        if(root == null) return 0;
        int left = maxLength(root.left);
        int right = maxLength(root.right);
        dia = Math.max(left+right,dia);
        return 1+Math.max(left,right);
    }
}