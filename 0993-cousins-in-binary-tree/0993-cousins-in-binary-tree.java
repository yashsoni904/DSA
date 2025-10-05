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
    public boolean isCousins(TreeNode root, int x, int y) {
       if (root == null) return false;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();
            TreeNode parx=null,pary=null;  //parent of x and of y
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();

                if(curr.left!=null){
                    if(curr.left.val==x) parx=curr;
                    if(curr.left.val==y) pary=curr;
                    q.offer(curr.left);
                }

                if(curr.right!=null){
                    if(curr.right.val==x) parx=curr;
                    if(curr.right.val==y) pary=curr;
                    q.offer(curr.right);
                }
            }
            if(parx!=null && pary!=null){
                return parx!=pary;
            }
            if(parx!=null || pary!=null) return false;
        }  
        return false;  
    }
}