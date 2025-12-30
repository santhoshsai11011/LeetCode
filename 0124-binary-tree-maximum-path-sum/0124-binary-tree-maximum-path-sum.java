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
    int maxi = Integer.MIN_VALUE;
    int h(TreeNode node){
        if(node == null) return 0;
        int ls = Math.max(0,h(node.left));
        int rs = Math.max(0,h(node.right));
        maxi = Math.max(maxi,node.val+ls+rs);
        return node.val+Math.max(ls,rs);
    }
    public int maxPathSum(TreeNode root) {
        h(root);
        return maxi;
    }
}