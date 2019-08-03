package binaryTree;

public class BinaryTree {

    private BinaryTreeNode root;
    BinaryTree(){

    }

    public void insert(Integer data){
        if (root == null){
            root = new BinaryTreeNode(data, 0);
        }else {
            insert(data,root);
        }
    }

    public void insert(Integer data, BinaryTreeNode node){
        int depth = node.getDepth();
        if (node.getData() > data){
            if (node.hasLeft()){
                insert(data,node.getLeft());
            }else {
                node.setLeft(new BinaryTreeNode(data,depth+1));
            }
        }else if(node.getData() < data){
            if (node.hasRight()){
                insert(data,node.getRight());
            }else {
                node.setRight(new BinaryTreeNode(data, depth+1));
            }
        }else {
            return;
        }
    }

    public void printTree(){
        System.out.println(root.getDepth() + ":" + root.getData());
        printTree(root.getLeft());
        printTree(root.getRight());
    }

    public void printTree(BinaryTreeNode node){
        if (node == null){
        }else {
            System.out.println(node.getDepth() + ":" + node.getData());
            printTree(node.getLeft());
            printTree(node.getRight());
        }
    }
}
