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
    int maxsum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root==null) return 0;
        helper(root);
        return maxsum;
    }
    public int helper(TreeNode node){
        if(node==null) return 0;
        //Agar left ya right subtree ka sum negative hai
       // To use include karne ka koi fayda nahi
        int left =Math.max(0,helper(node.left)) ;
        int right= Math.max(0,helper(node.right)) ;

        int currSum = left + node.val + right;

        maxsum= Math.max(currSum , maxsum);

        return node.val + Math.max(left , right);
    }
}