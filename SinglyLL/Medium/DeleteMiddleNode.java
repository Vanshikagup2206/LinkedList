package LinkedList.SinglyLL.Medium;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class DeleteMiddleNode {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null)
            return null;

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null; // it keeps track of the prev node from the middle

        //find the middle
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        //just remove the middle by changing its next
        prev.next = slow.next;
        
        return head;
    }
}