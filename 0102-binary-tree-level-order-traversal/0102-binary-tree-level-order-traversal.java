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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result =new ArrayList<>();
        level(root , result );
        return result;
    }
    public void level(TreeNode root,List<List<Integer>> result){
        if(root==null) return;
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode curr=q.remove();
            if(curr==null){
               result.add(new ArrayList<>(list));
               list.clear();
               if(q.isEmpty()){
                  break;
               }
               else{
                 q.add(null);
               }
            }
            else{
               list.add(curr.val);
               if(curr.left!=null){
                 q.add(curr.left);
               }
               if(curr.right!=null){
                 q.add(curr.right);
               }
            }
        }

    }
}