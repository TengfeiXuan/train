package com.test.train.leetCode;


import java.util.Objects;

/**
 * @author: xuantf
 * @version: 1.0.0
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 *
 * 示例：
 *
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 *
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 *
 * 思路：
 * 我们可以设想假设设定了双指针p和q的话，当q指向末尾的NULL，p与q之间相隔的元素个数为n时，那么删除掉p的下一个指针就完成了要求。
 *
 * 设置虚拟节点dummyHead指向head
 * 设定双指针p和q，初始都指向虚拟节点dummyHead
 * 移动q，直到p与q之间相隔的元素个数为n
 * 同时移动p与q，直到q指向的为NULL
 * 将p的下一个节点指向下下个节点
 */
public class DeleteNode {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        ListNode delete = delete(node, 1);
        System.out.println();
    }

    private static ListNode delete(ListNode node, int num) {
        ListNode start = new ListNode(0);
        start.next = node;
        ListNode p = start;
        ListNode q = start;
        for (int i = 0; i < num + 1; i++) {
            q = q.next;
        }
        while (Objects.nonNull(q)) {
            p = p.next;
            q = q.next;
        }
        ListNode next = p.next;
        p.next = next.next;
        ListNode res = start.next;
        return res;
    }
}
