package com.test.train.leetCode;

import java.util.Objects;

/**
 * @author: xuantf
 * @version: 1.0.0
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * 示例：
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class NumSum {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        addTwoNumbers(l1,l2);
    }
    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();
        while (Objects.nonNull(l1)){
            num1.append(l1.val);
            num2.append(l2.val);
            l1 = l1.next;
            l2 = l2.next;
        }
        int sum = Integer.sum(Integer.valueOf(num1.reverse().toString()), Integer.valueOf(num2.reverse().toString()));
        return null;
    }
}
