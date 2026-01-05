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
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        int level =1;
        q.add(root);
        while(q.size() !=0){
            int n = q.size();
            for(int i=0;i<n;i++){
                TreeNode node = q.peek();
                q.remove();
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
                if(node.left == null && node.right == null) return level;
            }
            level++;
        }
        return -1;
    }
}