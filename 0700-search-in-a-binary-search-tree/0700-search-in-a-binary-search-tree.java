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
    static TreeNode f(TreeNode node,int val){
        if(node == null || node.val == val) return node;
        if(node.val > val) return f(node.left,val);
        else return f(node.right,val);
    }
    public TreeNode searchBST(TreeNode root, int val) {
        return f(root,val);
    }
}