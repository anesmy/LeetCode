package org.example.linkedList;

public class RemoveDuplicatesSortedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode prev = head;
        while(prev.next != null){
            if(prev.val == prev.next.val){
                prev.next = prev.next.next;
            } else prev = prev.next;
        }
        return head;
    }
}
