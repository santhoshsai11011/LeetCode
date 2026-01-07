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
    static long f(TreeNode node){
        if(node == null) return 0;
        long left = f(node.left);
        long right = f(node.right);
        node.val =  (int)(node.val + left + right);
        return node.val;
    }
    public int maxProduct(TreeNode root) {
        long x = 1_000_000_007;
        long total = f(root);
        long ans = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.size() != 0){
            TreeNode node = q.peek();
            q.remove();
            long current = (total- node.val)*node.val;
            ans = Math.max(ans,current);
            if(node.left != null) q.add(node.left);
            if(node.right != null) q.add(node.right);
        }
            return (int)(ans%x);
    }
}