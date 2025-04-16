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
    public ListNode reverseList(ListNode head) {
        // ListNode curr=head;
        // ListNode temp=null;
        // ListNode pre=null;
        // while(curr!=null){
        //     temp=curr.next;
        //     curr.next=pre;
        //     pre=curr;
        //     curr=temp;
        // }
        // return pre;
    //     return helper(head,null,null,null);
    // }
    if (head == null || head.next == null) {
        return head;
    }

    ListNode newHead = reverseList(head.next);

    head.next.next = head;
    head.next = null;

    return newHead;
}
}