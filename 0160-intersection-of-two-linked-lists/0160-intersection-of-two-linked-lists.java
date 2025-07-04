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
        int l1=0,l2=0,size=0;
        ListNode h1=headA,h2=headB;
        while(h1!=null){
            l1++;
            h1=h1.next;
        }
        while(h2!=null){
            l2++;
            h2=h2.next;
        }
        h1=headA;
        h2=headB;
        if(l1>l2){
            int k=l1-l2;
            size=l2;
            for(int i=0;i<k;i++){
                h1=h1.next;
            }
        }
        else{
            int k=l2-l1;
            size=l1;
            for(int i=0;i<k;i++){
                h2=h2.next;
            }
        }
        while(size!=0){
            if(h1==h2) return h1;
            h1=h1.next;
            h2=h2.next;
            size--;
        }
        return null;
    }
}