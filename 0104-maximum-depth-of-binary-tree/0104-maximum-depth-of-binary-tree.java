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
    static int h(TreeNode node){
        if(node == null) return 0;
        int left = h(node.left);
        int right = h(node.right);
        return 1+Math.max(left,right);
    }
    public int maxDepth(TreeNode root) {
        int ans = h(root);
        return ans;
    }
}