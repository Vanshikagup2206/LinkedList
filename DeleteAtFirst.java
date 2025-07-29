package LinkedList;

public class DeleteAtFirst {
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
    public ListNode deleteHead(ListNode head) {
        if(head == null){
            return head;
        }
        head = head.next;
        return head;
    }
    public void printList(ListNode head){
        if(head == null){
            return;
        }
        ListNode curNode = head;
        System.out.print("HEAD" + "->");
        while(curNode != null){
            System.out.print(curNode.val + "->");
            curNode = curNode.next;
        }
        System.out.print("NULL");
    }
    public static void main(String args[]){
        ListNode head = new ListNode(1, new ListNode(2));
        DeleteAtFirst sol = new DeleteAtFirst();
        head = sol.deleteHead(head);
        sol.printList(head);
    }
}