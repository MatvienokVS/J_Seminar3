package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 7, 1, 8, 2, 5, 4));

        // нахождение минимального значения в списке
        int min = list.stream().mapToInt(Integer::intValue).min().getAsInt();
        System.out.println("Минимальное значение: " + min); // 1

        // нахождение максимального значения в списке
        int max = list.stream().mapToInt(Integer::intValue).max().getAsInt();
        System.out.println("Максимальное значение: " + max); // 8

        // нахождение среднего значения в списке
        double average = list.stream().mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println("Среднее значение: " + average); // 4.285714285714286
    }
}