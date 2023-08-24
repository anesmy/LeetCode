package org.example.linkedList;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {

    //Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

        public static boolean hasCycle(ListNode head) {
            Set<ListNode> nodeSet = new HashSet<>();
            while (head != null) {
                if(!nodeSet.add(head)) return true;
                head = head.next;
            }
            return false;
        }
    }
}
