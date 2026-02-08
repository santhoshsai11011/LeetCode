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
        if(root == null) return arr;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(st.size() != 0){
            int size = st.size();
            for(int i=0;i<size;i++){
                TreeNode node = st.pop();
                arr.add(node.val);
                if(node.right != null) st.push(node.right);
                if(node.left != null) st.push(node.left);
            }
        }
        return arr;
    }
}