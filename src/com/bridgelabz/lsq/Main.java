package com.bridgelabz.lsq;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type four integer");
        int x1 = input.nextInt(), x2 = input.nextInt(), x3 = input.nextInt(), x4 = input.nextInt();
        Node<Integer> fn = new Node<>(x1);
        Node<Integer> sn = new Node<>(x2);
        Node<Integer> tn = new Node<>(x3);
        Node<Integer> fon = new Node<>(x4);

        //linked list
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("Add method");
        list.add(fn);
        list.add(sn);
        list.add(tn);
        list.display();

        System.out.println("Push method");
        list.push(fn);
        list.push(sn);
        list.push(tn);
        list.display();

        System.out.println("\n\nInsert " + fon + " after " + x2);
        list.insertAfter(x2, fon);
        list.display();

        System.out.println("\n\nInserting second element");
        list.insert(sn);
        list.display();

        System.out.println("\n\nDelete first element (pop)");
        list.deleteFirst();
        list.display();

        System.out.println("\n\nDelete last element");
        list.deleteLast();
        list.display();

        System.out.println("\n\nSearching the node with value 30");
        Node<Integer> searchNode = list.search(30);
        if (searchNode == null) {
            System.out.println("Data not found");
        } else {
            System.out.println("Data found");
        }

        System.out.println("\n\nDelete the node with value " +x3);
        list.delete(x3);
        list.display();

        //Sorted linked list
        SortedLinkedList<Integer> sList = new SortedLinkedList<>();
        sList.add(fn);
        sList.add(sn);
        sList.add(tn);
        sList.add(fon);
        sList.display();

        //Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(fn);
        stack.push(sn);
        stack.push(tn);
        stack.push(fon);
        stack.display();

        System.out.println("\n\nDelete first element from stack");
        stack.peekPop();
        stack.display();

        //Queue
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(fn);
        queue.enqueue(sn);
        queue.enqueue(tn);
        queue.enqueue(fon);
        queue.display();

        System.out.println("\n\nDelete first element from queue");
        queue.dequeue();
        queue.display();
    }
}