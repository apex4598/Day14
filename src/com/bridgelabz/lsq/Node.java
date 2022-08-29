package com.bridgelabz.lsq;

public class Node<T extends Comparable<T>> {
    T value;
    Node<T> next;

    public Node(T value) {
        this.value = value;
        this.next = null;
    }

    public int compareTo(Node<T> num) {
        return value.compareTo(num.value);
    }
}