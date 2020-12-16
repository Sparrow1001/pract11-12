package ru.Fedorenko.pract11;

class ArrayQueue<T> extends AbstractQueue implements Queue<T>{
    private final T[] queue;
    private final int maxSize;
    private int nElem;
    private int front;
    private int rear;

    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        queue = (T[]) new Object[maxSize];
        rear = -1;
        front = 0;
        nElem = 0;
    }
    public void enqueue(T elem) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queue[++rear] = elem;
        nElem++;
    }
    public T element() {
        return queue[front];
    }
    public T dequeue() {
        T temp = queue[front++];
        if (front == maxSize) {
            front = 0;
        }
        nElem--;
        return temp;
    }
    public void clear() {
        for(int i =0;i<nElem;i++)
            dequeue();
    }
}
