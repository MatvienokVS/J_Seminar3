package org.example;

import java.util.LinkedList;

public class Ex6 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            list.add(0, 0);
        }
        System.out.println(list);
    }
}