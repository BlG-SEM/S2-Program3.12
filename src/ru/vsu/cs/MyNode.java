package ru.vsu.cs;

public class MyNode<T> {

    private T value;
    private MyNode<T> next;

    public MyNode(T value) {
        this.value = value;
    }

    public MyNode() {
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public MyNode<T> getNext() {
        return next;
    }

    public void setNext(MyNode<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
