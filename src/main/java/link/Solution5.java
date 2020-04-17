package link;

import link.ListNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @program: LeetCode
 * @description: 给定一个链表，判断链表中是否有环。  为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 * @author: CentreS
 * @create: 2020-01-18 11:11:06
 **/
public class Solution5 {

    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<ListNode>();
        while (head != null){
            if (set.contains(head)){
                return true;
            }else {
                set.add(head);
                head = head.next;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Solution5 solution5 = new Solution5();
        ListNode temp = new ListNode(1);
//        temp.next = new ListNode(2);
        boolean b = solution5.hasCycle(temp);
        System.out.println(b);
    }
}
