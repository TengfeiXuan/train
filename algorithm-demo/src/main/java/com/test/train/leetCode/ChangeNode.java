package com.test.train.leetCode;

import java.util.Objects;

/**
 * @author: xuantf
 * @version: 1.0.0
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 *
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 *
 * 示例:
 *
 * 给定 1->2->3->4, 你应该返回 2->1->4->3.
 */
public class ChangeNode {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        ListNode change = change(node);
        System.out.println();
    }
    private static ListNode change(ListNode n1){
        ListNode result = new ListNode(0);
        result.next = n1;
        ListNode p1 = result;
        while (Objects.nonNull(p1.next) && Objects.nonNull(p1.next.next)) {
            ListNode first = p1.next;
            ListNode second = first.next;
            ListNode three = second.next;
            second.next = first;
            first.next = three;
            p1.next = second;
            p1 = first;
        }
        return result.next;
    }
}
