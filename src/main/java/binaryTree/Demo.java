package binaryTree;

public class Demo {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        for (int i = 0; i < 10; i++) {
            tree.insert(i);
        }
        tree.printTree();
    }
}
