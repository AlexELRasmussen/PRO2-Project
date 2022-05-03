package stack;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArrayDropOutStack implements DropOutStackI{
    public static void main(String[] args) {
        ArrayDropOutStack stack = new ArrayDropOutStack(6);

        Card card1 = new Card("Spade", "Jack");
        Card card2 = new Card("Club", "2");
        Card card3 = new Card("Heart", "3");
        Card card4 = new Card("Heart", "4");
        Card card5 = new Card("Diamond", "5");
        Card card6 = new Card("Diamond", "6");
        Card card7 = new Card("Spade","Ace");

        stack.push(card1);
        stack.push(card2);
        stack.push(card3);
        stack.push(card4);
        stack.push(card5);
        stack.push(card6);

        System.out.println(Arrays.toString(stack.getStack()));

        stack.push(card7);

        System.out.println(Arrays.toString(stack.getStack()));
    }
    private Object[] stack;
    private int top;

    public ArrayDropOutStack(int size) {
        stack = new Object[size];
        top = -1;
    }
    @Override
    public void push(Object element) {
        dropIfNeccassary();
        top++;
        stack[top] = element;
    }

    @Override
    public Object pop() {
        if (top < 0)
        {
            throw new NoSuchElementException();
        }
        Object element = stack[top];
        stack[top] = null;
        top--;
        return element;
    }

    @Override
    public Object peek() {
        if (top < 0)
        {
            throw new NoSuchElementException();
        }
        return stack[top];
    }

    @Override
    public int size() {
        return top;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    public Object[] getStack() {
        return stack;
    }

    private void dropIfNeccassary()
    {
        if (top + 1 == stack.length)
        {
            Object[] newElements = new Object[stack.length];
            for (int i = 0; i < stack.length - 1; i++)
            {
                newElements[i] = stack[i + 1];
            }
            top--;
            stack = newElements;
        }
    }

    static class Card
    {
        public String symbol;
        public String ranking;

        public Card(String symbol, String ranking)
        {
            super();
            this.symbol = symbol;
            this.ranking = ranking;
        }

        @Override
        public String toString()
        {
            return this.symbol + ": " + this.ranking;
        }
    }
}
