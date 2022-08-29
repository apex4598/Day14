package com.bridgelabz.lsq;

public class Queue<T extends Comparable<T>> {

    LinkedList<T> queue = new LinkedList<>();

    void enqueue(Node<T> newNode){
        queue.last(newNode);
    }

    void dequeue(){
        queue.deleteFirst();
    }
    void display(){
        queue.display();
    }
}
