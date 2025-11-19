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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;
        ListNode mid=middle(head);
        ListNode sec=mid.next;
        mid.next=null;
        sec=reverse(sec);
        ListNode first=head;
        
        while(sec!=null){
          ListNode temp1=first.next;   
          ListNode temp2=sec.next;

          first.next=sec;
          sec.next=temp1;

          first=temp1;
          sec=temp2;   
        }
       

    }
    public ListNode middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head){
        ListNode prev=head;
        ListNode curr=head.next;
        while(curr!=null){
            ListNode nex=curr.next;
            curr.next=prev;

            prev=curr;
            curr=nex;
        }
        head.next=null;
        return prev;
    }
}