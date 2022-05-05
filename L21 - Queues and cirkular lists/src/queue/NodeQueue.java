package queue;

import java.util.NoSuchElementException;

/**
 * An implementation of a queue as a linked list.
 */
public class NodeQueue implements QueueI
{
    private Node headNode;
    private Node tailNode;
    int currentsize;
    /**
     * Constructs an empty queue.
     */
    public NodeQueue()
    {
        headNode = null;
        tailNode = null;
        currentsize = 0;
    }

    @Override
    public void enqueue(Object element)
    {
        Node node = new Node();
        node.data = element;
        if (headNode == null) {
            headNode = node;
            headNode.next = node;
        } else {
            tailNode.next = node;
        }
        tailNode = node;
        currentsize++;

    }

    @Override
    public Object dequeue()
    {
        if (headNode == null) {
            throw new NoSuchElementException("køen er tom");
        }
        Node node = headNode;
        if (headNode == tailNode) {
            tailNode = null;
            headNode.next = null;
        }
        headNode = headNode.next;
        currentsize--;
        return node.data;
    }

    @Override
    public int size()
    {
        return currentsize;
    }

    @Override
    public boolean isEmpty()
    {
        return currentsize == 0;
    }

    class Node
    {
        public Object data;
        public Node next;
    }
}
