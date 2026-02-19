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
    static void f(TreeNode node,int level,List<Integer> arr){
        if(node == null) return;
        if(arr.size() == level) arr.add(node.val);
        if(node.right != null) f(node.right,level+1,arr);
        if(node.left != null) f(node.left,level+1,arr);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        f(root,0,ans);
        return ans;

    }
}