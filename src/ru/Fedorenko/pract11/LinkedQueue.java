package ru.Fedorenko.pract11;

import java.util.Comparator;

public class LinkedQueue<T> extends AbstractQueue implements Queue<T>{
    private Node first;
    private final Comparator<T> c;
    LinkedQueue(Comparator<T> c) {
        if (c != null) {
            this.c = c;
        } else {
            throw new IllegalArgumentException("Comparator not may be null...");
        }
    }
    public void enqueue(T value) {
        boolean result;
        if (result = value != null) {
            if (this.size == 0) {
                this.first = new Node(value);
            } else {
                Node last = null;
                for (Node node = this.first; node != null; node = node.next) {
                    if (this.c.compare(node.value, value) >= 0) {
                        break;
                    }
                    last = node;
                }
                if (last == null) {
                    Node first = new Node(value);
                    first.next = this.first;
                    this.first = first;
                } else {
                    Node temp = last.next;
                    last.next = new Node(value);
                    last.next.next = temp;
                }
            }
            this.size++;
        }
    }

    public T element() {
        return this.size() == 0 ? null : this.first.value;
    }
    public T dequeue() {
        T first = null;
        if (this.size() > 0) {
            first = this.first.value;
            this.first = this.first.next;
            size--;
        }
        return first;
    }
    public void clear(){
        int s = size;
        for(int i = 0;i<s;i++){
            dequeue();
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        int count = 0;
        for (Node node = this.first; node != null; node = node.next) {
            sb.append(node.value);
            if (count++ < this.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.append("]").toString();
    }

    private class Node {
        private Node next;
        private T value;
        Node(T value) {
            this.value = value;
        }
    }
}