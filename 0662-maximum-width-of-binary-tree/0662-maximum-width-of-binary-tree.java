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
        int index;
        Pair(TreeNode node,int index){
            this.node = node;
            this.index = index;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        int maxWidth = 0;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root,0));
        while(!q.isEmpty()){
            int size = q.size();
            int first = q.peek().index;
            int last = first;
            for(int i=0;i<size;i++){
                Pair pair = q.peek();
                int currentIndex = pair.index-first;
                q.poll();
                TreeNode node = pair.node;
                last = pair.index;
                if(node.left != null) q.offer(new Pair(node.left,currentIndex*2+1));
                if(node.right != null) q.offer(new Pair(node.right,currentIndex*2+2));
            }
            maxWidth = Math.max(maxWidth,last-first+1);
        }
        return maxWidth;
    }
}