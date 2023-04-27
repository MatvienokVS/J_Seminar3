package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex4 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7));

        for (int num : list2) {
            if (!list1.contains(num)) {
                list1.add(num);
            }
        }

        System.out.println(list1); // [1, 2, 3, 4, 5, 6, 7]
    }
}