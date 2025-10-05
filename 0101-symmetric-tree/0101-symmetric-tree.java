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
    public boolean isSymmetric(TreeNode root) {
      if(root==null) return true;
      Queue<TreeNode> q= new LinkedList();
      q.offer(root.left);
      q.offer(root.right);

      while(!q.isEmpty()){
        TreeNode left=q.poll();
        TreeNode right=q.poll();
         // If both null, continue
        if(left==null && right==null) continue;
          // If only one null or values not equal, not symmetric
        if(left==null || right==null || left.val!=right.val) return false;
            // Add child pairs in mirror order
        q.offer(left.left);
        q.offer(right.right);
        q.offer(left.right);
        q.offer(right.left);
      }
      return true;
    }
    
}