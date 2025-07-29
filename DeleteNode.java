package LinkedList;

public class DeleteNode {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
    public void printList(ListNode head){
        if(head == null){
            return;
        }
        ListNode curNode = head;
        while(curNode != null){
            System.out.print(curNode.val + "->");
            curNode = curNode.next;
        }
    }
    public static void main(String args[]){
        DeleteNode sol = new DeleteNode();

        ListNode node4 = new ListNode(9);
        ListNode node3 = new ListNode(1);
        node3.next = node4;
        ListNode node2 = new ListNode(5);
        node2.next = node3;
        ListNode head = new ListNode(4);
        head.next = node2;
    
        sol.deleteNode(node2);
        sol.printList(head);
    }
}