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
            if(a==b) return true;
            return false;
        }
        if(a.val != b.val) return false;
        if(a.val == b.val){
            if(check(a.left,b.left) == false) return false;
            if(check(a.right,b.right) == false) return false;
        }
        return true;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return check(p,q);
    }
}