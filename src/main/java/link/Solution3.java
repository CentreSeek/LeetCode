package link;

import java.beans.EventHandler;

/**
 * @program: LeetCode
 * @description: 反转一个单链表。
 * @author: CentreS
 * @create: 2020-01-15 16:36:09
 **/
public class Solution3 {

    public ListNode reverseList(ListNode head) {
        if (head.next == null || head == null) {
            return head;
        }
        ListNode node = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }

}
