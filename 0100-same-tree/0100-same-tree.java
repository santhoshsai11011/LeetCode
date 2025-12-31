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
    static boolean check(TreeNode a,TreeNode b){
        if(a == null || b == null){
            return (a==b);
        }
        return (a.val == b.val) &&
            check(a.left,b.left) &&
            check(a.right,b.right);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return check(p,q);
    }
}