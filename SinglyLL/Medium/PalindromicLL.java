package LinkedList.SinglyLL.Medium;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class PalindromicLL {
    public boolean isPalindrome(ListNode head) {
        if(head == null)
            return true;
        ListNode slow = head;
        ListNode fast = head;

        //find the middle
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        //reverse the second half
        ListNode end = null;
        while(slow != null){
            ListNode temp = slow.next;
            slow.next = end;
            end = slow;
            slow = temp;
        }

        //compare values from first half and second half
        ListNode cmpStart = head;
        ListNode cmpEnd = end;
        while (cmpEnd != null) {
            if (cmpStart.val != cmpEnd.val) {
                return false;
            }
            cmpStart = cmpStart.next;
            cmpEnd = cmpEnd.next;
        }

        return true;
    }
}