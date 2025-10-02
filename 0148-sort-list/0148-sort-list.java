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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode m=mid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(m);
        return merge(left,right);

    }
  
    public ListNode merge(ListNode list1,ListNode list2){
           ListNode tempnode = new ListNode();
           ListNode temp=tempnode;
           while(list1!=null && list2!=null){
               if(list1.val < list2.val){
                  temp.next=list1;
                  temp=list1;
                  list1=list1.next;
               }
               else{
                   temp.next=list2;
                   temp=list2;
                   list2=list2.next;
               }  
           }
           if(list1!=null) temp.next=list1;
           if(list2!=null) temp.next=list2;
           return tempnode.next;
    }

    public ListNode mid(ListNode list){
        ListNode slow=list;
        ListNode fast=list;
        ListNode prev=null;
        while(fast!=null  && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(prev!=null) prev.next=null;
        return slow;
    }
}