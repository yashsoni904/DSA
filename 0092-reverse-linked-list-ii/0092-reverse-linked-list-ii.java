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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right) return head;
        ListNode dummy =new ListNode(0);
        dummy.next=head;

        ListNode waitPrev=dummy;
        ListNode curr=head;

        for(int i=0;i<left-1;i++){
            waitPrev=waitPrev.next;
            curr=curr.next;
        }

        ListNode sublistHead=curr;
        ListNode prev=null;

        for(int i=0;i<=right-left;i++){
            ListNode nex=curr.next;
            curr.next=prev;

            prev=curr;
            curr=nex;
        }

        waitPrev.next=prev;
        sublistHead.next=curr;
        return dummy.next;
    }
}