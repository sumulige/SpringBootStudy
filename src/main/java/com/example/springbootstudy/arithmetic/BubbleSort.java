package com.example.springbootstudy.arithmetic;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        Integer[] a = {1, 2, 4, 5, 6, 7, 8, 9, 0, 3};
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = a.length - 1; j > i; j--) {
                if (a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        Arrays.asList(a).stream().forEach(System.out::println);
    }
}
