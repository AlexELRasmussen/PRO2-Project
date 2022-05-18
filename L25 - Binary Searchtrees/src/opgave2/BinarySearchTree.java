package opgave2;

public class BinarySearchTree<E extends Comparable<E>> {
    private Node root;
    public BinarySearchTree() {
        root = null;
    }
    public void add(E obj) {

    }
    public boolean find(E obj) {
        return false;
    }
    public void remove(E obj) {

    }
    public void print() {}



    private class Node {
        private E data;
        private Node left;
        private Node right;
    }
}
