/**
 * Definition for a binary tree root.
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
// Using one stack

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        List<Integer> list = new ArrayList<>();
        if(root ==  null) return list;

        stack1.push(root);
        while(!stack1.isEmpty()){
            root = stack1.pop();
            if(root.left != null) stack1.push(root.left);
            if(root.right != null) stack1.push(root.right);

            stack2.push(root);
        }
        
        while(!stack2.isEmpty()){
            list.add(stack2.peek().val);
            stack2.pop();
        }
        return list;
    }   
}

// recursive solution

// class Solution {
//     public List<Integer> postorderTraversal(TreeNode root) {
//         List<Integer> list = new ArrayList<>();
//         recursion(list, root);
//         return list;
//     }
//     public static void recursion(List<Integer> list, TreeNode root){
//         if(root == null) return;

//         recursion(list,root.left);
//         recursion(list,root.right);
//         list.add(root.val);
//     }
// }