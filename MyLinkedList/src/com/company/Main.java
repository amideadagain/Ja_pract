package com.company;

public class Main {

    public static void main(String[] args) {
        int val = 5;
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();
        list.add(5);
        System.out.println(list.lastElement.getValue());
    }
}
