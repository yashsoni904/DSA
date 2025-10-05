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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result =new ArrayList<>();
        if(root==null) return result;
        Deque<TreeNode> q= new LinkedList();
        q.offer(root);
        boolean rev = false;
        while(!q.isEmpty()){
            int qs=q.size();
            List<Integer> list =new ArrayList<>();
            for(int i=0;i<qs;i++){
                if(!rev){ //normal order
                    TreeNode curr = q.pollFirst();
                    if(curr!=null){
                    list.add(curr.val);
                    }
                    if(curr.left!=null){
                    q.offerLast(curr.left);
                    }
                    if(curr.right!=null){
                      q.offerLast(curr.right);
                    }
                }
                else{  //reverse order
                    TreeNode curr=q.pollLast();
                    if(curr!=null){
                    list.add(curr.val);
                    }
                    if(curr.right!=null){
                      q.offerFirst(curr.right);
                    }
                    if(curr.left!=null){
                    q.offerFirst(curr.left);
                    }
                }   
            }
            result.add(list);
            if(!rev) rev=true;
            else rev = false;
            
        }
       return result;
    }
}