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
    public List<Integer> postorderTraversal(TreeNode root) {
      Stack<TreeNode> st=new Stack<>();
      List<Integer> ans= new ArrayList<>();
      if(root==null) return ans;
      TreeNode curr=root;
      TreeNode lastVis=null;
      while(curr!=null || !st.isEmpty()){
          if(curr!=null){
            st.push(curr);
            curr=curr.left;
          }
          else{
              TreeNode temp=st.peek();
              if(temp.right!=null && temp.right!=lastVis ){
                curr=temp.right;
              }
              else{
                 ans.add(temp.val);
                 lastVis=st.pop();
              }
          }
      }
      return ans;
    }
}