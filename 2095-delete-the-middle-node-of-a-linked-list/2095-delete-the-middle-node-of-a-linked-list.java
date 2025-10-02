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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null  ||  head.next==null) return null; 
       int curr=0;
       int prev=0;
       int size=0;
       ListNode temp=head;
       while(temp!=null){
        temp=temp.next;
        size++;
       }
    
       curr=size/2;
       temp=head;
       while(prev<curr-1){
        temp=temp.next;
        prev++;
       }
       temp.next=temp.next.next;
       return head;
        
    }
}