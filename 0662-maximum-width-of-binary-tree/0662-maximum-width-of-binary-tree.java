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
    class Pair{
        TreeNode node;
        long num;
        Pair(TreeNode node,long num){
            this.node = node;
            this.num = num;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        long ans = 0;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root,0));
        while(!q.isEmpty()){
            int size = q.size();
            long first = 0;
            long last = 0;
            long min = q.peek().num;
            for(int i=0;i<size;i++){
                Pair pair = q.peek();
                long currentIndex = pair.num-min;
                TreeNode node = pair.node;
                q.poll();
                if(i==0) first = currentIndex;
                if(i==size-1) last = currentIndex;
                if(node.left != null) q.offer(new Pair(node.left,currentIndex*2+1));
                if(node.right != null) q.offer(new Pair(node.right,currentIndex*2+2));
            }
            ans = Math.max(ans,last-first+1);
        }
        return (int)ans;
    }
}