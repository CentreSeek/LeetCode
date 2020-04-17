package link;

import java.lang.annotation.ElementType;
import java.util.List;

/**
 * @program: LeetCode
 * @description: 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * @author: CentreS
 * @create: 2020-01-15 11:21:15
 **/
public class Solution2 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode resultHead = new ListNode(0);
        resultHead.next = head;
        ListNode f = resultHead;
        ListNode s = resultHead;
        while (n-- > 0) {
            f = f.next;
        }
        while (f.next != null) {
            f = f.next;
            s = s.next;
        }
        s.next = s.next.next;
        return resultHead.next;
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        ListNode temp = new ListNode(1);
        temp.next = new ListNode(2);
        ListNode node = solution2.removeNthFromEnd(temp, 1);
        while (node.next != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

}
