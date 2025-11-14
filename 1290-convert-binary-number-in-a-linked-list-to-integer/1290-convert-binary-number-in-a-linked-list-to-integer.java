/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
       if(head==null) return 0;
       int size=0;
       ListNode temp=head;
       while(temp!=null){
          size++;
          temp=temp.next;
       }
       size--;
        temp=head;
        int ans=0;
        while(temp!=null){
            if(temp.val==1){
                ans+=(int)Math.pow(2,size--);
            }
            else{
                size--;

            }
            temp=temp.next;
        }
     
         return ans;
        
    }
}