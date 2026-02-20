/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    static TreeNode f(TreeNode node,TreeNode p,TreeNode q){
        if(node == null) return null;
        if(node == p) return p;
        if(node == q) return q;
        TreeNode left = f(node.left,p,q);
        TreeNode right = f(node.right,p,q);
        if(left != null && right != null) return node;
        if(left == null) return right;
        return left;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode ans = f(root,p,q);
        return ans;
    }
}