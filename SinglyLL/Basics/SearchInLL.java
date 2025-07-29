package LinkedList.SinglyLL.Basics;

public class SearchInLL {
    static class ListNode {
        int val;
        ListNode next;
    
        ListNode(int data1) {
            val = data1;
            next = null;
        }
    }
    public boolean searchKey(ListNode head, int key) {
        if(head == null)
            return false;
        ListNode curNode = head;
        while(curNode != null){
            if(curNode.val == key)
                return true;
            curNode = curNode.next;
        }
        return false;
    }
    public static void main(String args[]){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        SearchInLL sol = new SearchInLL();
        System.out.println(sol.searchKey(head,3));
    }
}