package link;

import javax.xml.bind.ValidationEvent;

/**
 * @program: LeetCode
 * @description: 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。
 * @author: CentreS
 * @create: 2020-01-15 11:09:02
 **/
public class Solution1 {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public void deleteNode(ListNode node) {
            ListNode next = node.next;
            node.next = next.next;
            node.val = next.val;
        }
    }
}
