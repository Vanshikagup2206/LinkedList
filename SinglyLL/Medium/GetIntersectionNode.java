package LinkedList.SinglyLL.Medium;

import java.util.HashSet;
import java.util.Set;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

// public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         if(headA == null || headB == null)
//             return null;

//         ListNode tailA = headA;
//         while(tailA.next != null)
//             tailA = tailA.next;
//         ListNode tailB = headB;
//         while(tailB.next != null)
//             tailB = tailB.next;
//         if(tailA != tailB)
//             return null;
        
//         ListNode curA = headA;
//         ListNode curB = headB;
//         while(curA != curB){
//             //reset to head -> to traverse both lists equally
//             // so they’ll meet at the intersection if it exists. 
//             // If not, both will end up as null at the same time.
//             curA = (curA != null) ? curA.next : headA; 
//             curB = (curB != null) ? curB.next : headB;
//         }
//         return curA;
//     }
// }

public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        Set<ListNode> seen = new HashSet<>();
        ListNode curr = headA;

        while (curr != null) {
            seen.add(curr);
            curr = curr.next;
        }

        curr = headB;
        while (curr != null) {
            if (seen.contains(curr)) {
                return curr; 
            }
            curr = curr.next;
        }

        return null; 
    }
}