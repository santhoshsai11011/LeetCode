/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public void bfs1(TreeNode root,Map<TreeNode,TreeNode> parents){
        if(root == null) return;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode node = q.remove();
            if(node.left != null){
                q.add(node.left);
                parents.put(node.left,node);
            }
            if(node.right != null){
                q.offer(node.right);
                parents.put(node.right,node);
            }
        }
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> ans = new ArrayList<>();
        Map<TreeNode,TreeNode> parents = new HashMap<>();
        bfs1(root,parents);
        Map<TreeNode,Boolean> visited = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(target);
        visited.put(target,true);
        int currentLevel = 0;
        while(!q.isEmpty()){
            int size = q.size();
            if(currentLevel == k) break;
            currentLevel++;
            for(int i=0;i<size;i++){
                TreeNode node = q.remove();
                if(node.left != null && !visited.containsKey(node.left)){
                    q.offer(node.left);
                    visited.put(node.left,true);
                }
                if(node.right != null && !visited.containsKey(node.right)){
                    q.offer(node.right);
                    visited.put(node.right,true);
                }
                if(parents.get(node) != null && !visited.containsKey(parents.get(node))){
                    q.offer(parents.get(node));
                    visited.put(parents.get(node),true);
                }
            }
        }

        while(!q.isEmpty()){
            ans.add(q.remove().val);
        }
        return ans;
    }
}