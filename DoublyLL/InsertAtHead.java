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

public class InsertAtHead {
    public ListNode insertBeforeHead(ListNode head, int X) {
        ListNode newNode = new ListNode(X);
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        return head;
    }
}