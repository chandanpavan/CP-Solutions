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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        if(root == null) return list;
        TreeNode node = root;
        st.push(root);
        while(!st.isEmpty()){
            node = st.pop();
            list.add(node.val);
            if(node.right != null) st.push(node.right);
            if(node.left != null) st.push(node.left);
        }
        return list;
    }
}

// Recursive method
// class Solution {
//     public List<Integer> preorderTraversal(TreeNode root) {
//         List<Integer> list = new ArrayList<>();
//         recursion(root, list);
//         return list;
//     }

//     public void recursion(TreeNode root, List<Integer> list){
//         if(root == null) return;

//         list.add(root.val);
//         recursion(root.left, list);
//         recursion(root.right, list);
//     }
// }