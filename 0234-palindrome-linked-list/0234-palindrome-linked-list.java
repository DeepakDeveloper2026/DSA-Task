
class Solution {
    public boolean isPalindrome(ListNode head) {
    if (head == null || head.next == null) return true;
       ListNode slow=head;
       ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;      
        }
        ListNode halfLL=reverseList(slow);
        ListNode p1=head;
        ListNode p2=halfLL;
        while(p2!=null){
            if(p1.val!=p2.val) return false;
            p1=p1.next;
            p2=p2.next;
        }
        return true;
    }
    public ListNode reverseList(ListNode h){
	        ListNode previ = null;
	        ListNode next = null;
	        ListNode current = h;
	        while (current != null){
		        next = current.next;
		        current.next = previ;
		        previ = current;
		        current = next;
            }
	return previ;
    }
}