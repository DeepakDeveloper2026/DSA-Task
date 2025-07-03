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
    public ListNode deleteMiddle(ListNode head) {
      ListNode dummy=new ListNode(0);
      dummy.next=head;
      ListNode temp=dummy;
      ListNode slow=head;
      ListNode fast=head;
      int n=0;
      while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        n++;
      }
      for(int i=0;i<n;i++){
        temp=temp.next;
      }
      temp.next=slow.next;
      return dummy.next; 
    }
}