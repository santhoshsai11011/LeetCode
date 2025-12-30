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
    
    int height(TreeNode node,int [] arr){
        if(node == null) return 0;
        int lh = height(node.left,arr);
        int rh = height(node.right,arr);
        arr[0] = Math.max(lh+rh,arr[0]);
        return 1+Math.max(lh,rh);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int [] arr = new int[1];
        height(root,arr);
        return arr[0];
    }
}