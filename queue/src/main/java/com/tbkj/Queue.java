package com.tbkj;

public class Queue<T> {
    
    private Node<T> first;
    private Node<T> last;
    private int length;

    Queue() {
        this.first = null;
        this.last = null;
        this.length = 0;
    }


    public boolean isEmpty() {
        return length == 0;
    }

    public void enqueue(T data) {
        if(isEmpty()) {
            first = new Node<T>(data);
            last = first;
        } else {
            last.setNext(new Node<T>(data));
            last = last.getNext();
        }

        ++length;
    }

    public T peek() throws Exception {
        if(isEmpty()) {
            throw new Exception("Queue is empty.");
        }
        return first.getData();
    }

    public void dequeue() {
        if(isEmpty()) {
            return ;
        }

        first = first.getNext();
        --length;
    }

    public int length() {
        return length;
    }
}
