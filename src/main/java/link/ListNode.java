package link;

import lombok.ToString;

/**
 * @program: LeetCode
 * @description:
 * @author: CentreS
 * @create: 2020-01-15 16:36:31
 **/
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }

    public void print() {
        ListNode temp = this;
        while (temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}
