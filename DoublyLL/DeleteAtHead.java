package LinkedList.DoublyLL;

class ListNode {
    int val;
    ListNode next;
    ListNode prev;

    ListNode() {
        val = 0;
        next = null;
        prev = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
        prev = null;
    }

    ListNode(int data1, ListNode next1, ListNode prev1) {
        val = data1;
        next = next1;
        prev = prev1;
    }
}

public class DeleteAtHead {
    public ListNode deleteHead(ListNode head) {
        if (head == null) return null;         
        ListNode newHead = head.next;          
        if (newHead != null) {
            newHead.prev = null;                
        }
        head.next = null;
        head.prev = null;
        return newHead;
    }
}