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
        int lh = h(node.left,arr);
        int rh = h(node.right,arr);
        arr[0] = Math.max(arr[0],lh+rh);
        return 1+Math.max(lh,rh);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int [] arr = new int[1];
        arr[0] = -1;
        int h = h(root,arr);
        return arr[0];
    }
}