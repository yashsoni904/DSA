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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        int size=0;
        ListNode temp=head; 
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        if(k>size) return head;
        for(int i=1;i<=size;i=i+k){
            if((i+k-1)<=size){
                head= rev(head , i , i+k-1);
            }
        }
        return head;
    }
    public ListNode rev(ListNode head , int l ,int r) {
        if(l==r) return head; 
        ListNode dummy =new ListNode(0);
        dummy.next=head;
        ListNode waitprev = dummy;
        ListNode curr = head;

        for(int i=0;i<l-1;i++){
            waitprev=waitprev.next;
            curr=curr.next;
        }
        ListNode prev=null;
        ListNode headSublist=curr;
        for(int i=0;i<=r-l;i++){
            ListNode nex = curr.next;
            curr.next = prev;

            prev=curr;
            curr=nex;
        }
        waitprev.next=prev;
        headSublist.next=curr;
        return dummy.next;



    }
}