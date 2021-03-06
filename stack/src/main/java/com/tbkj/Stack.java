package com.tbkj;

public class Stack<T> {

    private Node<T> head;
    private int height;

    Stack() {
        this.head = null;
        this.height = 0;
    }

    public void pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is Underflow.");
        }
        head = head.getNext();
        --height;
    }

    public void push(T data) {
        if (isEmpty()) {
            head = new Node<T>(data);
        } else {
            Node<T> tempHead = head;

            head = new Node<T>(data);
            head.setNext(tempHead);
        }

        ++height;
    }

    public T peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty.");
        }

        return head.getData();
    }

    public boolean isEmpty() {
        return height == 0;
    }

    public int height() {
        return height;
    }

}
