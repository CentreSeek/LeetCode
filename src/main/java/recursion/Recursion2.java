package recursion;

/**
 * @program: LeetCode
 * @description: 反转单链表
 * @author: CentreS
 * @create: 2020-03-04 15:24:07
 **/
public class Recursion2 {
    public static Node reverseList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newList = reverseList(head.next);
        Node temp = head.next;
        temp.next = head;
        head.next = null;
        return newList;
    }

    public static void main(String[] args) {
        Node node = new Node(0, null);
        Node node1 = new Node(1, node);
        Node node2 = new Node(2, node1);
        Node node3 = new Node(3, node2);
        Node node4 = new Node(4, node3);
        Node node5 = new Node(5, node4);
        System.out.println("===============past=============");
        while (node5 != null) {
            System.out.println(node5.data);
            node5 = node5.next;
        }
        Node node6 = reverseList(node5);
        System.out.println("===============reverseList=============");
        while (node6 != null) {
            System.out.println(node6.data);
            node6 = node6.next;
        }
    }
}

class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}
