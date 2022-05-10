package queue;

import java.util.NoSuchElementException;

public class NodeQueue <T> {
    /**
     * An implementation of a queue as a linked list.
     */
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

        public void enqueue(T element)
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

        public T dequeue()
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

        public int size()
        {
            return currentsize;
        }
        
        public boolean isEmpty()
        {
            return currentsize == 0;
        }

        class Node
        {
            public T data;
            public Node next;
        }
}
