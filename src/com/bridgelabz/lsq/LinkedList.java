package com.bridgelabz.lsq;

public class LinkedList<T extends Comparable<T>> {
    Node<T> head;
    Node<T> tail;
    int size;
    public void display() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.value +"->");
            size++;
            temp = temp.next;
        }
        System.out.println("\nSize of the list is " +size);
        size = 0;
    }
    void add(Node<T> newNode) {
        if (head == null) {
            tail = newNode;
        } else {
            newNode.next = head;
        }
        head = newNode;
    }

    public void push(Node<T> newNode) {
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    void insert(Node<T> newNode) {
        if (head == null) {
            head = newNode;
        } else if (tail == null) {
            tail = newNode;
        } else {
            head.next = newNode;
            newNode.next = tail;

        }
    }

    public void insertAfter(T prevData, Node<T> newNode){
        Node<T> searchedNode = this.search(prevData);
        if (searchedNode != null){
            Node<T> temp = searchedNode.next;
            searchedNode.next = newNode;
            newNode.next = temp;
        }
    }
    public Node<T> search(T data){
        Node<T> temp = head;
        while (temp != null) {
            if (temp.value == data) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    void deleteFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    void deleteLast() {
        Node<T> temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = (null);
    }
    void delete(T deleteNode) {
        Node<T> replace = new Node<>(deleteNode);
        Node<T> searchNode = this.search(deleteNode);
        Node<T> temp = head;
        while (temp != searchNode) {
            replace = temp;
            temp = temp.next;
        }
        replace.next = searchNode.next;
    }

    void last(Node<T> newNode) {
        if (head == null) {
            head = newNode;
        }
        if (tail != null) {
            tail.next = newNode;
        }
        tail = newNode;
    }
}