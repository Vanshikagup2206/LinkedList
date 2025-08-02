package LinkedList.SinglyLL.Medium;


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class SortList {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        //find the middle
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;

        //split left and right
        ListNode left = sortList(head);
        ListNode right = sortList(slow);

        return merge(left,right);
    }

    public ListNode merge(ListNode left, ListNode right){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while(left != null && right != null){
            if(left.val <= right.val){
                tail.next = left;
                left = left.next;
            }else{
                tail.next = right;
                right = right.next;
            }
            tail = tail.next;
        }

        if(left != null)
            tail.next = left;
        else
            tail.next = right;

        return dummy.next;
    }
}