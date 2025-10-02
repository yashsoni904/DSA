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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode midnode= middleNode(head);
        ListNode sechalf= reverse(midnode.next);
        
        ListNode firsthalf=head;
        while(sechalf!=null){
            if(firsthalf.val!=sechalf.val){
                return false;
            }
            firsthalf=firsthalf.next;
            sechalf=sechalf.next;
        }
        return true;

    }
    public ListNode middleNode(ListNode head){
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        ListNode midnode=head;
        int mid = size/2;
        int i=1;
        while(i<mid){
            midnode =midnode.next;
            i++;
        }
        return midnode;
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