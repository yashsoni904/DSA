/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        ListNode temp2=headB;
        int len1=1;
        int len2=1;
        

        while(temp1.next!=null){
            temp1=temp1.next;
            len1++;
        }
        while(temp2.next!=null){
            temp2=temp2.next;
            len2++;
        }
        if(temp1!=temp2)  return null;
        temp1=headA;
        temp2=headB;
        if(len1>len2){
            int dif=len1-len2;
            int i=0;
            while(i<dif){
                temp1=temp1.next;
                i++;
            }
            while(temp1!=temp2){
                temp1=temp1.next;
                temp2=temp2.next;
            }
            
        }
        else{
            int dif=len2-len1;
            int i=0;
            while(i<dif){
                temp2=temp2.next;
                i++;
            }
            while(temp1!=temp2){
                temp1=temp1.next;
                temp2=temp2.next;
            }
            

        }
        return temp1; 
    }
}