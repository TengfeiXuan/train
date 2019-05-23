package com.test.train.leetCode;

import java.util.Objects;

/**
 * @author: xuantf
 * @version: 1.0.0
 */
public class DivideListNode {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(5);
        ListNode node3 = new ListNode(6);
        ListNode node4 = new ListNode(2);
        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        ListNode divide = divide(node, 4);
        System.out.println();
    }

    private static ListNode divide(ListNode node, int num) {
        ListNode minNode = new ListNode(-1);
        ListNode maxNode = new ListNode(-1);
        ListNode max = maxNode;
        ListNode min = minNode;
        while (Objects.nonNull(node)){
            if (node.val <= num) {
                min.next = node;
                node = node.next;
                min = min.next;
                min.next = null;
            }else {
                max.next = node;
                node = node.next;
                max = max.next;
                max.next = null;
            }

        }
        min.next = maxNode.next;
        return minNode.next;
    }
}
