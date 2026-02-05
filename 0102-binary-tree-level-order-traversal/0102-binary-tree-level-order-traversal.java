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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> arr = new ArrayList<>();
        if(root == null) return arr;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(q.size() > 0){
            int n = q.size();
            List<Integer> a = new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode node = q.peek();
                a.add(node.val);
                q.poll();
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
            arr.add(a);
        }
        return arr;
    }
}