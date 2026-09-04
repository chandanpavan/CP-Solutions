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
    public boolean isSymmetric(TreeNode root) {
        return root == null || recursion(root.left ,root.right);
    }
    public boolean recursion(TreeNode node1, TreeNode node2){
        if(node1 == null || node2 == null){
            return node1 == node2;
        }

        if(node1.val != node2.val) return false;
        
        return recursion(node1.left, node2.right) && recursion(node2.left, node1.right);
    }
}