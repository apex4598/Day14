package com.bridgelabz.lsq;

public class Stack<T extends Comparable<T>> {
    LinkedList<T> stackList = new LinkedList<T>();

    void push(Node<T> newNode){
        stackList.add(newNode);
    }
    void display(){
        stackList.display();
    }
    void peekPop(){
        stackList.deleteFirst();
    }
}