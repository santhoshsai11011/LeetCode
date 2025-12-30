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
    int maxi = 0;
    static int diameter(TreeNode node){
        if(node == null) return 0;
        int lh = diameter(node.left);
        int rh = diameter(node.right);
        return 1+Math.max(lh,rh);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        int lh = diameter(root.left);
        int rh = diameter(root.right);
        maxi = Math.max(maxi,rh+lh);
        int left = diameterOfBinaryTree(root.left);
        int right = diameterOfBinaryTree(root.right);
        return maxi;
    }
}