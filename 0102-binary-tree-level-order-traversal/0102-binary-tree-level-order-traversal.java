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
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return arr;
        q.offer(root);
        while(q.size() >0){
            int levelNum = q.size();
            List<Integer> a = new LinkedList<>();
            for(int i=0;i<levelNum;i++){
                TreeNode node = q.peek();
                q.poll();
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
                a.add(node.val);
            }
            arr.add(a);
        }
        return arr;
    }
}