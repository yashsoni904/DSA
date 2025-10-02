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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null ) return null ;
        if(head.next==null) return head;
        ListNode temp=head;
        ListNode nex=head.next;

        while(nex!=null ){
            
            if(temp.val==nex.val){
                nex=nex.next;
            }
            else{
                temp.next=nex;
                temp=nex;
                nex=nex.next;
            }
        }
        temp.next=null;
        return head;
    }
}