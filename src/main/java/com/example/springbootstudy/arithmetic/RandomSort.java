package com.example.springbootstudy.arithmetic;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class RandomSort {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        int generateCount = in.nextInt();
        final SortedSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < generateCount; i++) {
            Scanner scanner = new Scanner(System.in);
            if (in.hasNextInt()) {
                treeSet.add(in.nextInt());
                continue;
            }
        }
        treeSet.spliterator().forEachRemaining(e -> {
            System.out.println(e.intValue());
        });
    }

}
