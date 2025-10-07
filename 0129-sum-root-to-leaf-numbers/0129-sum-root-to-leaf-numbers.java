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
    
   
    public int sumNumbers(TreeNode root) {
        int digit=0;
        return helper(root , digit);
    }
    public int helper(TreeNode root , int digit){
        if(root==null) return 0;

        digit=digit*10+root.val;
        int left = helper(root.left , digit);
        int right = helper(root.right , digit);
        if(left==0 && right==0) return digit;

        return left+right;

    }
}