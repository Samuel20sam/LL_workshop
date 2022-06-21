package com.bridgelabz;

public class LinkedList <T> {
    Node<T> Head;
    Node<T> Tail;

    void add(Node<T> newNode) {
        if (Head == null) {
            Tail = newNode;
        } else {
            newNode.next = Head;
        }
        Head = newNode;
    }
    public void display() {
        System.out.println();
        Node<T> temp = Head;
        while (temp.next != null) {
            System.out.print(temp.key + "->");
            temp = temp.next;
        }
        System.out.print(temp.key);
    }
}