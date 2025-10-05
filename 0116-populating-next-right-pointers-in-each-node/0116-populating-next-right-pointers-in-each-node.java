/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null) return null;
        Queue<Node> q=new LinkedList();
        q.offer(root);
        q.offer(null);
        while(!q.isEmpty()){
          Node curr=q.poll();
          if(curr==null){
            if(q.isEmpty()){
                break;
            }
            else{
                q.offer(null);
            }
          } 
          else{
              curr.next=q.peek();
              if(curr.left!=null) q.offer(curr.left);
              if(curr.right!=null) q.offer(curr.right);
          } 
            
        }
     return root;

    }
}