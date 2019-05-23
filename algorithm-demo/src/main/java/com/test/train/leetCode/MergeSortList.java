package com.test.train.leetCode;

import java.util.Objects;

/**
 * @author: xuantf
 * @version: 1.0.0
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 * 示例：
 *
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */
public class MergeSortList {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(1);
        ListNode node31 = new ListNode(3);
        ListNode node4 = new ListNode(5);
        node.next = node1;
        node1.next = node2;
        node3.next = node31;
//        ListNode merge = merge(node, node3);
        ListNode node5 = recursionMerge(node, node3);
        System.out.println();
    }
    private static ListNode merge(ListNode l1, ListNode l2){
        ListNode result = new ListNode(0);
        ListNode temp = result;
        if (Objects.isNull(l1)) {
            return l2;
        }
        if (Objects.isNull(l2)) {
            return l1;
        }
        while (Objects.nonNull(l1) && Objects.nonNull(l2)) {
            if (l1.val > l2.val) {
                temp.next = l2;
                temp = temp.next;
                l2 = l2.next;
            } else {
                temp.next = l1;
                temp = temp.next;
                l1 = l1.next;
            }
        }
        if (Objects.isNull(l1)) {
            temp.next = l2;

        }
        if (Objects.isNull(l2) ) {
            temp.next = l1;
        }
        result = result.next;
        return result;
    }

    /**
     * 递归方式
     */
    private static ListNode recursionMerge(ListNode l1, ListNode l2){
        ListNode result;
        if (Objects.isNull(l1)) {
            return l2;
        }
        if (Objects.isNull(l2)) {
            return l1;
        }
        if (l1.val < l2.val) {
            result = l1;
            result.next = recursionMerge(l1.next, l2);
        }else {
            result = l2;
            result.next = recursionMerge(l1, l2.next);
        }
        return result;
    }
}
