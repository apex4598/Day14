package com.bridgelabz.lsq;

public class SortedLinkedList<T extends Comparable<T>> {
    Node<T> head;
    int size;

    void add (Node<T> newNode){
        insert(newNode);
    }

    void insert(Node<T> node){
        if (head == null){
            head = node;
        } else {
            Node<T> current = head;
            while ((current.next != null) && (node.compareTo(current.next) > 0)) {
                current = current.next;
            }
            if (current.next == null) {
                current.next = node;
            }
            if (node.compareTo(current.next) < 0) {
                node.next = current.next;
                current.next = node;
            }
        }
    }
    public void display() {
        Node<T> temp = head;
        System.out.print("Sorted linked list is\n");
        while (temp != null) {
            System.out.print(temp.value +"->");
            size++;
            temp = temp.next;
        }
        System.out.println("\nSize of sorted linked list is " +size);
        size = 0;
    }
}
