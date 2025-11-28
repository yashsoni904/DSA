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
    public ListNode mergeNodes(ListNode head) {
       ListNode dummy=new ListNode(0);
       int sum=0;
       ListNode temp1=dummy;
       ListNode temp=head.next;
       while(temp!=null){
           if(temp.val==0){
             if(sum!=0){
                temp1.next=new ListNode(sum);
                temp1=temp1.next;
                sum=0;
             }
           }
           sum+=temp.val;

           temp=temp.next;
       }
       return dummy.next;
    }
}