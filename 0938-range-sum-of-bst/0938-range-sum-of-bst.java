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
    static int f(TreeNode node,int low,int high){
        if(node == null) return 0;
        if(node.val >= low && node.val <= high) return node.val + f(node.left,low,high)+f(node.right,low,high);
        return f(node.left,low,high)+f(node.right,low,high);
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        int ans = f(root,low,high);
        return ans;
    }
}