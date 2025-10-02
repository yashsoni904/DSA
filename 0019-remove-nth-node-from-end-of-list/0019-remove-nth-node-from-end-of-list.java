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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null){
            return null;
        }
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        
        int i=size-n;
        int j=1;
        if(i==0){
            return head.next;
        }
        ListNode prev=head;
        while(j<i){
           prev=prev.next;
           j++;
        }
        prev.next=prev.next.next;
        return head;
    }
}