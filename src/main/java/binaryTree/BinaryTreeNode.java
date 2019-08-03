package binaryTree;

public class BinaryTreeNode {
    private Integer data;
    private BinaryTreeNode left;
    private BinaryTreeNode right;

    public Integer getDepth() {
        return depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    private Integer depth;

    BinaryTreeNode(){

    }

    BinaryTreeNode(Integer data, Integer depth){
        this.data = data;
        this.depth = depth;
    }

    public boolean isEmpty(){
        if (this.data == null){
            return false;
        }
        return true;
    }

    public boolean hasLeft(){
        if (this.left == null){
            return false;
        }
        return true;
    }

    public boolean hasRight(){
        if (this.right == null){
            return false;
        }
        return true;
    }
    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }
}
