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
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return ans;
        q.add(root);
        boolean flag = true;
        while(q.size() != 0){
            int size = q.size();
            List<Integer> arr = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node = q.peek();
                q.remove();
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
                arr.add(node.val);
            }
            if(!flag) Collections.reverse(arr);
            ans.add(arr);
            flag = !flag;
        }
        return ans;
    }
}