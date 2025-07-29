package LinkedList;

public class InsertAtFirst {
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
    public ListNode insertAtHead(ListNode head, int X) {
        ListNode newNode = new ListNode(X);
        if(head == null){
            head = newNode;
            return newNode;
        }
        newNode.next = head;
        head = newNode;
        return newNode;
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
        ListNode head = new ListNode(1);
        InsertAtFirst sol = new InsertAtFirst();
        head = sol.insertAtHead(head, 7);
        sol.printList(head);
    }
}