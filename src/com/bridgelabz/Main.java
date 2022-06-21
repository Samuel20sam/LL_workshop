package com.bridgelabz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type three integer");
        int x1 = input.nextInt(), x2 = input.nextInt(), x3 = input.nextInt();
        LinkedList<Integer> list =  new LinkedList<>();
        Node <Integer> fn = new Node<>(x1);
        Node <Integer> sn = new Node<>(x2);
        Node <Integer> tn = new Node<>(x3);

        list.add(fn);
        list.add(sn);
        list.add(tn);
        list.display();
//        list.push(fn);
//        list.push(sn);
//        list.push(tn);
//        list.display();
    }
}