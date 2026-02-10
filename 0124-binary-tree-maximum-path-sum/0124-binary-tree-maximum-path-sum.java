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
    static int h(TreeNode node,int [] arr){
        if(node == null) return 0;
        int lh = Math.max(0,h(node.left,arr));
        int rh = Math.max(0,h(node.right,arr));
        arr[0] = Math.max(arr[0],lh+rh+node.val);
        return node.val+Math.max(lh,rh);
    }
    public int maxPathSum(TreeNode root) {
        int [] arr = new int[1];
        arr[0] = Integer.MIN_VALUE;
        int h = h(root,arr);
        return arr[0];
    }
}