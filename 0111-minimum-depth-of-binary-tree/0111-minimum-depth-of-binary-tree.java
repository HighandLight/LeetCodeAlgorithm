import java.util.*;
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
    public int minDepth(TreeNode root) {
        //basecase
        if(root == null){
            return 0;
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        int answer = 0;
        if(left == 0 && right != 0){
            answer = right +1;
        }else if(left != 0 && right == 0){
            answer = left +1;
        }else{
            answer = Math.min(left, right) +1;
        }
        
        
        return answer;
        
        
            
        
    }
}