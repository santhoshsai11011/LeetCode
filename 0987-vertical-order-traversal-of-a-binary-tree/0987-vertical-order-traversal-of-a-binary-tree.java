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
    class Tuple {
        TreeNode node;
        int vertical;
        int level;

        Tuple(TreeNode node, int vertical, int level) {
            this.node = node;
            this.vertical = vertical;
            this.level = level;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> mp= new TreeMap<>();
        Queue<Tuple> q = new LinkedList<>();
        q.offer(new Tuple(root,0,0));
        while(!q.isEmpty()){
            Tuple tuple = q.peek();
            int level = tuple.level;
            int vertical = tuple.vertical;
            TreeNode node = tuple.node;
            q.remove();
            if(!mp.containsKey(vertical)){
                mp.put(vertical,new TreeMap<>());
            }
            if(!mp.get(vertical).containsKey(level)){
                mp.get(vertical).put(level,new PriorityQueue<>());
            }
            mp.get(vertical).get(level).offer(node.val);
            if(node.left != null){
                q.offer(new Tuple(node.left,vertical-1,level+1));
            }
            if(node.right != null){
                q.offer(new Tuple(node.right,vertical+1,level+1));
            }
        }
        for(TreeMap<Integer,PriorityQueue<Integer>> levels : mp.values()){
            List<Integer> arr = new ArrayList<>();
            for(PriorityQueue<Integer> pq : levels.values()){
                while(!pq.isEmpty()){
                    arr.add(pq.poll());
                }
            }
            ans.add(arr);
        }
        return ans;
    }
}