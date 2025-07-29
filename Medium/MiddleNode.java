package LinkedList.Medium;

public class MiddleNode {
    
    static class ListNode {
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
    public ListNode middleOfLinkedList(ListNode head) {
        if(head == null)
            return head;
        
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String args[]){
        ListNode head = new ListNode(3, new ListNode(8, new ListNode(8, new ListNode(7, new ListNode(1, new ListNode(3))))));
        MiddleNode sol = new MiddleNode();
        ListNode middle = sol.middleOfLinkedList(head);
        System.out.print(middle.val);
    }
}