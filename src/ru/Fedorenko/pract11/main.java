package ru.Fedorenko.pract11;

import java.util.Comparator;

public class main {
    public static void main(String[] args) {
        LinkedQueue<Integer> q = new LinkedQueue<>(Comparator.comparing(Integer::new));
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        System.out.println(q.element());
        System.out.println(q.size());
        System.out.println(q.isEmpty());
        q.clear();
        System.out.println(q.isEmpty());

        ArrayQueue<Integer> q1 = new ArrayQueue<>(4);
        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        q1.enqueue(4);
        System.out.println(q1.element());
        System.out.println("удаленный элемент "+q1.dequeue());
        System.out.println(q1.element());
        q1.clear();
        System.out.println(q1.isEmpty());
    }
}