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
    public List<Integer> preorderTraversal(TreeNode root) {
        //코테_ 네이밍 중요
        ArrayList<Integer> nodeValues = new ArrayList<>();
        if(root == null){
            return nodeValues;
        }
        nodeValues.add(root.val);
        nodeValues.addAll(preorderTraversal(root.left));
        nodeValues.addAll(preorderTraversal(root.right));
        
        return nodeValues;
    }
}