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

public class LengthOfLoop {
     public int findLengthOfLoop(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int length = 0;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                ListNode temp = slow;
                do{
                    temp = temp.next;
                    length++;
                }while(temp != slow);
                return length;
            }
        }

        return 0;
     }
 }