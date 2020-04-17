package link;

/**
 * @program: LeetCode
 * @description: 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * @author: CentreS
 * @create: 2020-01-16 14:48:21
 **/
public class Solution4 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head;
        if (l1 != null && l2 == null) {
            head = l1;
            l1 = l1.next;
        } else if (l1 == null && l2 != null) {
            head = l2;
            l2 = l2.next;
        } else if (l1 == null && l2 == null) {
            return null;
        } else if (l1.val < l2.val) {
            head = l1;
            l1 = l1.next;
        } else {
            head = l2;
            l2 = l2.next;
        }
        ListNode temp = head;
        while (l1 != null || l2 != null) {
            if (l1 != null && l2 == null) {
                temp.next = l1;
                l1 = l1.next;
                temp = temp.next;
            } else if (l1 == null && l2 != null) {
                temp.next = l2;
                l2 = l2.next;
                temp = temp.next;
            } else if (l1 == null && l2 == null) {
                return head;
            } else if (l1.val < l2.val) {
                temp.next = l1;
                l1 = l1.next;
                temp = temp.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
                temp = temp.next;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        Solution4 solution2 = new Solution4();
//        ListNode temp1 = new ListNode(1);
//        temp1.next = new ListNode(2);
//        temp1.next.next = new ListNode(4);

        ListNode temp2 = new ListNode(0);
//        temp2.next = new ListNode(3);
//        temp2.next.next = new ListNode(4);
        ListNode node = solution2.mergeTwoLists(null, temp2);
        node.print();
//        while (node.next != null) {
//            System.out.println(node.val);
//            node = node.next;
//        }
    }
}
