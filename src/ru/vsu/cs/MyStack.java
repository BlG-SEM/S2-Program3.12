package ru.vsu.cs;

public class MyStack<T> {

    private MyNode<T> head = null;
    private int size = 0;

    public boolean push(T value) {
        MyNode node = new MyNode(value);

        if (isEmpty()) {
            head = node;
        } else {

            node.setNext(head);
            head = node;
        }

        size++;
        return true;
    }

    public T pop() {
        T result = head.getValue();
        head = head.getNext();
        size--;
        return result;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public MyNode getHead() {
        return head;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
