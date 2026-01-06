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
    public int maxLevelSum(TreeNode root) {
        if(root == null) return 0; 
        Queue<TreeNode> q = new LinkedList<>();
        int level = 1;
        int ans = 0;
        int maxSum = Integer.MIN_VALUE;
        q.add(root);
        while(q.size() != 0){
            int num = q.size();
            int sum = 0;
            for(int i=0;i<num;i++){
                TreeNode node = q.peek();
                q.remove();
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
                sum += node.val;
            }
            if(sum > maxSum) {
                maxSum = sum;
                ans = level;
            } 
            level++;
        }
        return ans;
    }
}