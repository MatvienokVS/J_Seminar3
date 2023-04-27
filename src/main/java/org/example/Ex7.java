package org.example;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex7 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        long startTime = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            arrayList.add(0, 0);
        }

        long endTime = System.nanoTime();
        long arrayListTime = endTime - startTime;

        startTime = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            linkedList.add(0, 0);
        }

        endTime = System.nanoTime();
        long linkedListTime = endTime - startTime;

        System.out.println("ArrayList time: " + arrayListTime + " ns");
        System.out.println("LinkedList time: " + linkedListTime + " ns");
    }
}