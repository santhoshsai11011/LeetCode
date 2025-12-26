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
        List<Integer> arr = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        if(root == null) return arr;
        st.push(root);
        while(st.size() >0){
            TreeNode node = st.pop();
            if(node.right != null) st.push(node.right);
            if(node.left != null) st.push(node.left);
            arr.add(node.val);
        }
        return arr;
    }
}