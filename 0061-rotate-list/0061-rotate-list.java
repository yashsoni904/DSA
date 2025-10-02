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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        ListNode temp=head;
        int len=0;
        while(temp!=null){
          temp=temp.next;
          len++;
        }
        k=k%len;
        if(k==0) return head;
        int diff= len-k;
        int i=1;
        temp=head;
        ListNode nex=head.next;
        while(i<diff){
            temp=temp.next;
            nex=nex.next;
            i++;
        }
        temp.next=null;
        ListNode newHead=nex;
        while(nex.next!=null){
            nex=nex.next;
        }
        nex.next=head;
        return newHead;


    }
}