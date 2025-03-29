package main.task55;

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode beforeHead = new ListNode(0);
        beforeHead.next = head;
        ListNode prevNode = beforeHead;
        ListNode currentNode = head;

        while (currentNode != null) {
            if (currentNode.val == val) {
                prevNode.next = currentNode.next;
            } else {
                prevNode = currentNode;
            }
            currentNode = currentNode.next;
        }

        return beforeHead.next;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
