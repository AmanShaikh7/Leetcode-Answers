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
        if(head ==null || head.next==null){
            return null;
        }
        /*if(head.next.next==null && n==2){
            return head.next;
        }*/
        ListNode forwardPointer = head;
        ListNode prevoiusPointer = head;
        for(int i=0;i<n;i++){
            forwardPointer = forwardPointer.next;
        }
        if(forwardPointer==null){
            return head.next;
        }
        while(forwardPointer!=null && forwardPointer.next!=null){
            forwardPointer = forwardPointer.next;
            prevoiusPointer = prevoiusPointer.next;
        } 

        prevoiusPointer.next = prevoiusPointer.next.next;
        return head;
    }
}