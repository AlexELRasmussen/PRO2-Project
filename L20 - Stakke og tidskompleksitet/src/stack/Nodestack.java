package stack;

import java.util.NoSuchElementException;

public class Nodestack implements StackI {

    private Node firstNode;
    private int size;

    public Nodestack() {
        this.firstNode = null;
        this.size = 0;
    }

    @Override
    public void push(Object element) {
        Node node = new Node();
        node.data = element;
        if (firstNode != null) {
            node.next = firstNode;
        }
        firstNode = node;
        size++;
    }

    @Override
    public Object pop() {
        if (firstNode == null) {
            throw new NoSuchElementException("Ingen elementer i denne stack");
        }
        Node removed = firstNode;
        firstNode = firstNode.next;
        size--;
        return removed.data;
    }

    @Override
    public Object peek() {
        if (firstNode == null) {
            throw new NoSuchElementException("Ingen elementer i denne stack");
        }
        return firstNode.data;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    class Node {
        public Object data;
        public Node next;

    }
}
