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
    static int leftHeight(TreeNode node){
        if(node == null) return 0;
        int h = 0;
        while(node!= null){
            node = node.left;
            h++;
        }
        return h;
    }
    static int rightHeight(TreeNode node){
        if(node == null) return 0;
        int h = 0;
        while(node!= null){
            node = node.right;
            h++;
        }
        return h;
    }
    static int f(TreeNode node){
        if(node == null) return 0;
        int lh = leftHeight(node.left);
        int rh = rightHeight(node.right);
        if(lh == rh) return (2<<lh)-1;
        else return 1+f(node.left)+f(node.right);
    }
    public int countNodes(TreeNode root) {
        int count = f(root);
        return count;
    }
}