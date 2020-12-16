package ru.Fedorenko.pract11;

//enqueue: предусловие - данные универсального типа Т
//element: постусловие - возвращает 1 элемент очереди универсального типа Т
//dequeue: постусловие - возвращает удаленный элемент очереди универсального типа Т
//size: постусловие - возвращает кол-во элементов очереди типа int
//isEmpty: постусловие - возвращает boolean значение
public interface Queue<T> {
    void enqueue(T value);
    T element();
    T dequeue();
    void clear();
    int size();
    boolean isEmpty();
}
