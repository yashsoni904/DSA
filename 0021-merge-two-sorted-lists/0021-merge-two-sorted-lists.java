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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2==null) return null;
        
        ListNode tempnode = new ListNode(0);
        ListNode temp=tempnode;
        ListNode f=list1;
        ListNode s=list2;
        while(f!=null && s!=null){
            if(f.val <= s.val){
                temp.next=f;
                temp=f;
                f=f.next;

            }
            else{
                temp.next=s;
                temp=s;
                s=s.next;
            }
        }
        if(f!=null) temp.next=f;
        if(s!=null) temp.next=s;

        return tempnode.next;
    }
}