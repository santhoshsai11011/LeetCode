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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> arr = new ArrayList<>();
        if(root == null) return arr;
        Queue<TreeNode> q = new LinkedList<>();
        boolean flag = true;
        q.offer(root);
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> a = new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode node = q.remove();
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
                a.add(node.val);
            }
            if(!flag) Collections.reverse(a);
            arr.add(a);
            flag = !flag;
        }
        return arr;
    }
}