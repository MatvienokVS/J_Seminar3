package org.example;

import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 7, 1, 8, 2, 5, 4));

        // компаратор для обратной сортировки
        Comparator<Integer> reverseComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };

        // сортировка списка в обратном порядке
        Collections.sort(list, reverseComparator);

        System.out.println(list); // [8, 7, 5, 4, 3, 2, 1]
    }
}