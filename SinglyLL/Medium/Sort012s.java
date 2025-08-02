package LinkedList.SinglyLL.Medium;

class ListNode {
    int val;
    ListNode next;

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}

public class Sort012s {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode zeroDummy = new ListNode(0);
        ListNode oneDummy = new ListNode(0);
        ListNode twoDummy = new ListNode(0);

        ListNode zeroTail = zeroDummy;
        ListNode oneTail = oneDummy;
        ListNode twoTail = twoDummy;

        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next; 
            curr.next = null; 

            if (curr.val == 0) {
                zeroTail.next = curr;
                zeroTail = curr;
            } else if (curr.val == 1) {
                oneTail.next = curr;
                oneTail = curr;
            } else { 
                twoTail.next = curr;
                twoTail = curr;
            }

            curr = next;
        }

        ListNode newHead = null;
        if (zeroDummy.next != null) {
            newHead = zeroDummy.next;
            zeroTail.next = (oneDummy.next != null) ? oneDummy.next : twoDummy.next;
            if (oneDummy.next != null) {
                oneTail.next = twoDummy.next;
            }
        } else if (oneDummy.next != null) {
            newHead = oneDummy.next;
            oneTail.next = twoDummy.next;
        } else {
            newHead = twoDummy.next;
        }

        return newHead;
    }
}