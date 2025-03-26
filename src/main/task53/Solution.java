package main.task53;

class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currentA = headA;
        while (currentA != null) {
            ListNode currentB = headB;
            while (currentB != null) {
                if (currentA == currentB) {
                    return currentA;
                }
                currentB = currentB.next;
            }
            currentA = currentA.next;
        }
        return null;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}

/*
The best solution:
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode nodeA = headA, nodeB = headB;

        while (nodeA != nodeB) {
            nodeA = nodeA == null ? headB : nodeA.next;
            nodeB = nodeB == null ? headA : nodeB.next;
        }

        return nodeA;
    }
 */
