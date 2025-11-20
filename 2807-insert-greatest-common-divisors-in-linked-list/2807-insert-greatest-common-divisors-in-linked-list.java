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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null) return null;
        ListNode curr=head;
        
        while(curr.next!=null){
        ListNode nex=curr.next;
        int gcd=findHCF(curr.val,nex.val);
        ListNode newnode = new ListNode(gcd);
        curr.next=newnode;
        newnode.next=nex;
        curr=curr.next.next;
        }
        return head;
    }
    public int findHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}