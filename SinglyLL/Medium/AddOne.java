package LinkedList.SinglyLL.Medium;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}

public class AddOne {
    public ListNode addOne(ListNode head) {
        if(head == null)
            return new ListNode(1);
        
        ListNode curNode = head;
        ListNode lastNonNine = null;
        while(curNode != null){
            if(curNode.val < 9){
                lastNonNine = curNode;
            }
            curNode = curNode.next;
        }
        
        if (lastNonNine != null) {
            lastNonNine.val += 1;
            curNode = lastNonNine.next;
            while (curNode != null) {
                curNode.val = 0;
                curNode = curNode.next;
            }
            return head;
        } else {
            curNode = head;
            while (curNode != null) {
                curNode.val = 0;
                curNode = curNode.next;
            }
            ListNode newHead = new ListNode(1);
            newHead.next = head;
            return newHead;
        }
    }
}